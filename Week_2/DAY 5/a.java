class Book {
    private String title;
    private int publicationYear;
    public Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }
    public String getTitle() {
        return title;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
}
class Author extends Book {
    private String name;
    private String bio;
    public Author(String title, int publicationYear, String name, String bio) {
        super(title, publicationYear);
        this.name = name;
        this.bio = bio;
    }
    public String getName() {
        return name;
    }
    public String getBio() {
        return bio;
    }
    public void displayInfo() {
        System.out.println("Book Title: " + getTitle());
        System.out.println("Publication Year: " + getPublicationYear());
        System.out.println("Author Name: " + name);
        System.out.println("Author Bio: " + bio);
    }
}
public class a {
    public static void main(String[] args) {
        Author author = new Author("The Time Machine", 1895, "H.G. Wells", "English writer known for science fiction.");
        author.displayInfo();
    }
}