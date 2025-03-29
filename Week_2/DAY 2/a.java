class a {
    String title
    String author
    double price
    Book() {
        title = "Unknown"
        author = "Unknown"
        price = 0.0
    }
    Book(String title, String author, double price) {
        this.title = title
        this.author = author
        this.price = price
    }
    void displayBook() {
        System.out.println("Title: " + title)
        System.out.println("Author: " + author)
        System.out.println("Price: ₹" + price)
    }
}
public class Main {
    public static void main(String[] args) {
        Book defaultBook = new Book()
        Book customBook = new Book("Wings of Fire", "A.P.J. Abdul Kalam", 299.0)
        System.out.println("Default Book:")
        defaultBook.displayBook()
        System.out.println()
        System.out.println("Custom Book:")
        customBook.displayBook()
    }
}