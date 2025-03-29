import java.util.*;
abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }
    public String getItemId() {
        return itemId;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
    public abstract int getLoanDuration();
}
interface Reservable {
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String reservedBy;
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() {
        return 14;
    }
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            reservedBy = borrowerName;
        }
    }
    public boolean checkAvailability() {
        return isAvailable;
    }
}
class Magazine extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String reservedBy;
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() {
        return 7;
    }
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            reservedBy = borrowerName;
        }
    }
    public boolean checkAvailability() {
        return isAvailable;
    }
}
class DVD extends LibraryItem implements Reservable {
    private boolean isAvailable = true;
    private String reservedBy;
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
    }
    public int getLoanDuration() {
        return 5;
    }
    public void reserveItem(String borrowerName) {
        if (isAvailable) {
            isAvailable = false;
            reservedBy = borrowerName;
        }
    }
    public boolean checkAvailability() {
        return isAvailable;
    }
}
public class e {
    public static void main(String[] args) {
        List<LibraryItem> items = new ArrayList<>();
        Book book = new Book("B001", "The Alchemist", "Paulo Coelho");
        Magazine magazine = new Magazine("M101", "National Geographic", "Various");
        DVD dvd = new DVD("D501", "Inception", "Christopher Nolan");
        items.add(book);
        items.add(magazine);
        items.add(dvd);
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                Reservable r = (Reservable) item;
                System.out.println("Available: " + r.checkAvailability());
                r.reserveItem("John Doe");
                System.out.println("Available after reservation: " + r.checkAvailability());
            }
            System.out.println();
        }
    }
}