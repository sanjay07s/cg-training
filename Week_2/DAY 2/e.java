public class e {
    String title;
    String author;
    double price;
    boolean availability;
    Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }
    void borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully.");
        } else {
            System.out.println("Book is not available.");
        }
    }
    void displayBook() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
        System.out.println("Available: " + availability);
    }
    public static void main(String[] args) {
        Book book1 = new Book("The Alchemist", "Paulo Coelho", 399.0, true);
        book1.displayBook();
        book1.borrowBook();
        book1.displayBook();
        book1.borrowBook();
    }
}