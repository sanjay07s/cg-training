import java.util.Scanner;
class Item {
    String name;
    int itemId;
    int quantity;
    double price;
    Item next;
    public Item(String name, int itemId, int quantity, double price) {
        this.name = name;
        this.itemId = itemId;
        this.quantity = quantity;
        this.price = price;
        this.next = null;
    }
}
class InventoryList {
    private Item head = null;
    public void addAtBeginning(String name, int itemId, int quantity, double price) {
        Item newItem = new Item(name, itemId, quantity, price);
        newItem.next = head;
        head = newItem;
    }
    public void addAtEnd(String name, int itemId, int quantity, double price) {
        Item newItem = new Item(name, itemId, quantity, price);
        if (head == null) {
            head = newItem;
        } else {
            Item temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newItem;
        }
    }
    public void addAtPosition(int pos, String name, int itemId, int quantity, double price) {
        if (pos == 1) {
            addAtBeginning(name, itemId, quantity, price);
            return;
        }
        Item newItem = new Item(name, itemId, quantity, price);
        Item temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newItem.next = temp.next;
            temp.next = newItem;
        }
    }
    public void removeByItemId(int itemId) {
        if (head == null) return;

        if (head.itemId == itemId) {
            head = head.next;
            return;
        }
        Item temp = head;
        while (temp.next != null && temp.next.itemId != itemId) {
            temp = temp.next;
        }

        if (temp.next != null) {
            temp.next = temp.next.next;
        }
    }
    public void updateQuantity(int itemId, int newQuantity) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                temp.quantity = newQuantity;
                return;
            }
            temp = temp.next;
        }
    }
    public void searchByItemId(int itemId) {
        Item temp = head;
        while (temp != null) {
            if (temp.itemId == itemId) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with ID " + itemId + " not found.");
    }
    public void searchByItemName(String name) {
        Item temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {
                printItem(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Item with name " + name + " not found.");
    }
    public void calculateTotalValue() {
        double totalValue = 0;
        Item temp = head;
        while (temp != null) {
            totalValue += temp.quantity * temp.price;
            temp = temp.next;
        }
        System.out.println("Total inventory value: " + totalValue);
    }
    public void sortByItemName(boolean ascending) {
        if (head == null || head.next == null) return;
        Item temp, index;
        String tempName;
        int tempId, tempQuantity;
        double tempPrice;

        for (temp = head; temp != null; temp = temp.next) {
            for (index = temp.next; index != null; index = index.next) {
                if (ascending ? temp.name.compareTo(index.name) > 0 : temp.name.compareTo(index.name) < 0) {
                    tempName = temp.name;
                    tempId = temp.itemId;
                    tempQuantity = temp.quantity;
                    tempPrice = temp.price;
                    temp.name = index.name;
                    temp.itemId = index.itemId;
                    temp.quantity = index.quantity;
                    temp.price = index.price;
                    index.name = tempName;
                    index.itemId = tempId;
                    index.quantity = tempQuantity;
                    index.price = tempPrice;
                }
            }
        }
    }
    public void sortByPrice(boolean ascending) {
        if (head == null || head.next == null) return;
        Item temp, index;
        String tempName;
        int tempId, tempQuantity;
        double tempPrice;
        for (temp = head; temp != null; temp = temp.next) {
            for (index = temp.next; index != null; index = index.next) {
                if (ascending ? temp.price > index.price : temp.price < index.price) {
                    tempName = temp.name;
                    tempId = temp.itemId;
                    tempQuantity = temp.quantity;
                    tempPrice = temp.price;
                    temp.name = index.name;
                    temp.itemId = index.itemId;
                    temp.quantity = index.quantity;
                    temp.price = index.price;
                    index.name = tempName;
                    index.itemId = tempId;
                    index.quantity = tempQuantity;
                    index.price = tempPrice;
                }
            }
        }
    }
    public void displayInventory() {
        if (head == null) {
            System.out.println("Inventory is empty.");
            return;
        }
        Item temp = head;
        while (temp != null) {
            printItem(temp);
            temp = temp.next;
        }
    }
    private void printItem(Item item) {
        System.out.println("Item ID: " + item.itemId + ", Name: " + item.name + ", Quantity: " + item.quantity + ", Price: " + item.price);
    }
}
public class d {
    public static void main(String[] args) {
        InventoryList inventory = new InventoryList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Item at Beginning\n2. Add Item at End\n3. Add Item at Position\n4. Remove Item by Item ID\n5. Update Item Quantity\n6. Search Item by Item ID\n7. Search Item by Name\n8. Calculate Total Inventory Value\n9. Sort Inventory by Name\n10. Sort Inventory by Price\n11. Display Inventory\n12. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    inventory.addAtBeginning(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    break;
                case 2:
                    inventory.addAtEnd(sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    break;
                case 3:
                    inventory.addAtPosition(sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(), sc.nextDouble());
                    break;
                case 4:
                    inventory.removeByItemId(sc.nextInt());
                    break;
                case 5:
                    inventory.updateQuantity(sc.nextInt(), sc.nextInt());
                    break;
                case 6:
                    inventory.searchByItemId(sc.nextInt());
                    break;
                case 7:
                    inventory.searchByItemName(sc.next());
                    break;
                case 8:
                    inventory.calculateTotalValue();
                    break;
                case 9:
                    inventory.sortByItemName(sc.nextBoolean());
                    break;
                case 10:
                    inventory.sortByPrice(sc.nextBoolean());
                    break;
                case 11:
                    inventory.displayInventory();
                    break;
                case 12:
                    return;
            }
        }
    }
}