import java.util.Scanner;
class Book {
    String title;
    String author;
    String genre;
    int bookId;
    boolean isAvailable;
    Book next;
    Book prev;
    public Book(String title, String author, String genre, int bookId, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.bookId = bookId;
        this.isAvailable = isAvailable;
        this.next = null;
        this.prev = null;
    }
}
class Library {
    private Book head = null;
    private Book tail = null;
    private int totalBooks = 0;
    public void addAtBeginning(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (head == null) {
            head = tail = newBook;
        } else {
            newBook.next = head;
            head.prev = newBook;
            head = newBook;
        }
        totalBooks++;
    }
    public void addAtEnd(String title, String author, String genre, int bookId, boolean isAvailable) {
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        if (tail == null) {
            head = tail = newBook;
        } else {
            tail.next = newBook;
            newBook.prev = tail;
            tail = newBook;
        }
        totalBooks++;
    }
    public void addAtPosition(int position, String title, String author, String genre, int bookId, boolean isAvailable) {
        if (position == 1) {
            addAtBeginning(title, author, genre, bookId, isAvailable);
            return;
        }
        Book newBook = new Book(title, author, genre, bookId, isAvailable);
        Book temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp != null) {
            newBook.next = temp.next;
            if (temp.next != null) {
                temp.next.prev = newBook;
            }
            temp.next = newBook;
            newBook.prev = temp;
        }
        totalBooks++;
    }
    public void removeByBookId(int bookId) {
        if (head == null) return;
        if (head.bookId == bookId) {
            if (head.next != null) {
                head.next.prev = null;
            }
            head = head.next;
            totalBooks--;
            return;
        }
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }
                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                }
                totalBooks--;
                return;
            }
            temp = temp.next;
        }
    }
    public void searchByTitle(String title) {
        Book temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                printBook(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book with title " + title + " not found.");
    }
    public void searchByAuthor(String author) {
        Book temp = head;
        while (temp != null) {
            if (temp.author.equalsIgnoreCase(author)) {
                printBook(temp);
                return;
            }
            temp = temp.next;
        }
        System.out.println("Book by author " + author + " not found.");
    }
    public void updateAvailabilityStatus(int bookId, boolean isAvailable) {
        Book temp = head;
        while (temp != null) {
            if (temp.bookId == bookId) {
                temp.isAvailable = isAvailable;
                return;
            }
            temp = temp.next;
        }
    }
    public void displayBooksForward() {
        if (head == null) {
            System.out.println("No books available.");
            return;
        }
        Book temp = head;
        while (temp != null) {
            printBook(temp);
            temp = temp.next;
        }
    }
    public void displayBooksReverse() {
        if (tail == null) {
            System.out.println("No books available.");
            return;
        }
        Book temp = tail;
        while (temp != null) {
            printBook(temp);
            temp = temp.prev;
        }
    }

    public void countTotalBooks() {
        System.out.println("Total number of books: " + totalBooks);
    }
   private void printBook(Book book) {
        System.out.println("Book ID: " + book.bookId + ", Title: " + book.title + ", Author: " + book.author + ", Genre: " + book.genre + ", Available: " + (book.isAvailable ? "Yes" : "No"));
    }
}
public class e {
    public static void main(String[] args) {
        Library library = new Library();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add Book at Beginning\n2. Add Book at End\n3. Add Book at Position\n4. Remove Book by Book ID\n5. Search Book by Title\n6. Search Book by Author\n7. Update Book Availability Status\n8. Display Books in Forward Order\n9. Display Books in Reverse Order\n10. Count Total Books\n11. Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    library.addAtBeginning(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean());
                    break;
                case 2:
                    library.addAtEnd(sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean());
                    break;
                case 3:
                    library.addAtPosition(sc.nextInt(), sc.next(), sc.next(), sc.next(), sc.nextInt(), sc.nextBoolean());
                    break;
                case 4:
                    library.removeByBookId(sc.nextInt());
                    break;
                case 5:
                    library.searchByTitle(sc.next());
                    break;
                case 6:
                    library.searchByAuthor(sc.next());
                    break;
                case 7:
                    library.updateAvailabilityStatus(sc.nextInt(), sc.nextBoolean());
                    break;
                case 8:
                    library.displayBooksForward();
                    break;
                case 9:
                    library.displayBooksReverse();
                    break;
                case 10:
                    library.countTotalBooks();
                    break;
                case 11:
                    return;
            }
        }
    }
}