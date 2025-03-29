class Book {
    public String ISBN;
    protected String title;
    private String author;
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}
class EBook extends Book {
    String fileSize;
    public EBook(String ISBN, String title, String author, String fileSize) {
        super(ISBN, title, author);
        this.fileSize = fileSize;
    }
    public void displayEBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("File Size: " + fileSize);
    }
    public static void main(String[] args) {
        EBook ebook = new EBook("978-3-16-148410-0", "Java Programming", "John Doe", "5MB");
        ebook.displayBookDetails();
        ebook.displayEBookDetails();
        ebook.setAuthor("Jane Doe");
        System.out.println("Updated Author: " + ebook.getAuthor());
    }
}