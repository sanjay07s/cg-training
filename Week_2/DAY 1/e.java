import java.util.ArrayList
import java.util.Scanner
class e {
    String itemName
    double price
    int quantity
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName
        this.price = price
        this.quantity = quantity
    }
    double getTotalPrice() {
        return price * quantity
    }
}
class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<CartItem>()
    void addItem(String name, double price, int quantity) {
        items.add(new CartItem(name, price, quantity))
    }
    void removeItem(String name) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(name)) {
                items.remove(i)
                break
            }
        }
    }
    void displayCart() {
        double total = 0
        System.out.println("Cart Items:")
        for (CartItem item : items) {
            System.out.println(item.itemName + " - ₹" + item.price + " x " + item.quantity + " = ₹" + item.getTotalPrice())
            total += item.getTotalPrice()
        }
        System.out.println("Total Cost: ₹" + total)
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        ShoppingCart cart = new ShoppingCart()
        while (true) {
            System.out.println("1. Add Item  2. Remove Item  3. Display Cart  4. Exit")
            int choice = scanner.nextInt()
            scanner.nextLine()
            if (choice == 1) {
                System.out.print("Enter item name: ")
                String name = scanner.nextLine()
                System.out.print("Enter price: ")
                double price = scanner.nextDouble()
                System.out.print("Enter quantity: ")
                int qty = scanner.nextInt()
                cart.addItem(name, price, qty)
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ")
                String name = scanner.nextLine()
                cart.removeItem(name)
            } else if (choice == 3) {
                cart.displayCart()
            } else {
                break
            }
        }
    }
}