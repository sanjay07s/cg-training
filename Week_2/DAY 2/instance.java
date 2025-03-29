public class instance {
    String productName;
    double price;
    static int totalProducts = 0;
    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;
    }
    void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: " + price);
    }
    static void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }
    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 55000.0);
        Product p2 = new Product("Phone", 25000.0);
        p1.displayProductDetails();
        p2.displayProductDetails();
        Product.displayTotalProducts();
    }
}