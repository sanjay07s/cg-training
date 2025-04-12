abstract class WarehouseItem {
    private String name;
    private int id;
    public WarehouseItem(String name, int id) {
        this.name = name;
        this.id = id;
    }
    public String getDetails() {
        return "ID: " + id + ", Name: " + name;
    }
}
class Electronics extends WarehouseItem {
    public Electronics(String name, int id) {
        super(name, id);
    }
}
class Groceries extends WarehouseItem {
    public Groceries(String name, int id) {
        super(name, id);
    }
}
class Furniture extends WarehouseItem {
    public Furniture(String name, int id) {
        super(name, id);
    }
}
import java.util.ArrayList;
import java.util.List;
class Storage<T extends WarehouseItem> {
    private List<T> items;
    public Storage() {
        items = new ArrayList<>();
    }
    public void addItem(T item) {
        items.add(item);
    }
    public List<T> getItems() {
        return items;
    }
    public T getItem(int index) {
        return items.get(index);
    }
}
class DisplayUtil {
    public static void displayAllItems(List<? extends WarehouseItem> items) {
        for (WarehouseItem item : items) {
            System.out.println(item.getDetails());
        }
    }
}
public class a {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage = new Storage<>();
        electronicsStorage.addItem(new Electronics("Laptop", 101));
        electronicsStorage.addItem(new Electronics("Smartphone", 102));
        Storage<Groceries> groceriesStorage = new Storage<>();
        groceriesStorage.addItem(new Groceries("Rice", 201));
        groceriesStorage.addItem(new Groceries("Milk", 202));
        Storage<Furniture> furnitureStorage = new Storage<>();
        furnitureStorage.addItem(new Furniture("Chair", 301));
        furnitureStorage.addItem(new Furniture("Table", 302));
        System.out.println("Electronics:");
        DisplayUtil.displayAllItems(electronicsStorage.getItems());
        System.out.println("\nGroceries:");
        DisplayUtil.displayAllItems(groceriesStorage.getItems());
        System.out.println("\nFurniture:");
        DisplayUtil.displayAllItems(furnitureStorage.getItems());
    }
}