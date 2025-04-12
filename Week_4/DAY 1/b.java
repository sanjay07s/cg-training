interface Category {
    String getCategoryName();
}
class BookCategory implements Category {
    public String getCategoryName() {
        return "Books";
    }
}
class ClothingCategory implements Category {
    public String getCategoryName() {
        return "Clothing";
    }
}
class GadgetCategory implements Category {
    public String getCategoryName() {
        return "Gadgets";
    }
}
class Product<T extends Category> {
    private String name;
    private double price;
    private T category;
    public Product(String name, double price, T category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public T getCategory() {
        return category;
    }
    public void applyDiscount(double percentage) {
        price = price - (price * percentage / 100);
    }
    public String getDetails() {
        return "Name: " + name + ", Category: " + category.getCategoryName() + ", Price: " + price;
    }
}
import java.util.ArrayList;
import java.util.List;
class Catalog {
    private List<Product<? extends Category>> productList;
    public Catalog() {
        productList = new ArrayList<>();
    }
    public void addProduct(Product<? extends Category> product) {
        productList.add(product);
    }
    public List<Product<? extends Category>> getAllProducts() {
        return productList;
    }
    public static <T extends Product<?>> void applyDiscount(T product, double percentage) {
        product.applyDiscount(percentage);
    }
}
public class b {
    public static void main(String[] args) {
        BookCategory bookCat = new BookCategory();
        ClothingCategory clothingCat = new ClothingCategory();
        GadgetCategory gadgetCat = new GadgetCategory();
        Product<BookCategory> book = new Product<>("Java Programming", 500, bookCat);
        Product<ClothingCategory> shirt = new Product<>("T-Shirt", 800, clothingCat);
        Product<GadgetCategory> phone = new Product<>("Smartphone", 15000, gadgetCat);
        Catalog catalog = new Catalog();
        catalog.addProduct(book);
        catalog.addProduct(shirt);
        catalog.addProduct(phone);
        Catalog.applyDiscount(book, 10);
        Catalog.applyDiscount(shirt, 15);
        Catalog.applyDiscount(phone, 5);
        System.out.println("Product Catalog with Discounts:");
        for (Product<? extends Category> product : catalog.getAllProducts()) {
            System.out.println(product.getDetails());
        }
    }
}