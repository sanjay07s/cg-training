import java.util.*;
abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    public String getItemName() {
        return itemName;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void getItemDetails() {
        System.out.println("Item: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
    public abstract double calculateTotalPrice();
}
interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable {
    private double discount;
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        return total - (total * discount);
    }
    public void applyDiscount(double percentage) {
        this.discount = percentage / 100;
    }
    public String getDiscountDetails() {
        return "Veg Item Discount: " + (discount * 100) + "%";
    }
}
class NonVegItem extends FoodItem implements Discountable {
    private double discount;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0;
    }
    public double calculateTotalPrice() {
        double total = getPrice() * getQuantity();
        double nonVegCharge = 30 * getQuantity();
        total += nonVegCharge;
        return total - (total * discount);
    }
    public void applyDiscount(double percentage) {
        this.discount = percentage / 100;
    }
    public String getDiscountDetails() {
        return "Non-Veg Item Discount: " + (discount * 100) + "%";
    }
}
public class f {
    public static void processOrder(List<FoodItem> items) {
        for (FoodItem item : items) {
            item.getItemDetails();
            if (item instanceof Discountable) {
                ((Discountable) item).applyDiscount(10);
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println();
        }
    }
    public static void main(String[] args) {
        List<FoodItem> order = new ArrayList<>();
        order.add(new VegItem("Paneer Butter Masala", 180, 2));
        order.add(new NonVegItem("Chicken Biryani", 220, 3));

        processOrder(order);
    }
}