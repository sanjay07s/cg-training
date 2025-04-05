import java.util.Scanner;
class Movie {
    String title;
    String director;
    int year;
    double rating;
    Movie next;
    Movie prev;
    public Movie(String title, String director, int year, double rating) {
        this.title = title;
        this.director = director;
        this.year = year;
        this.rating = rating;
    }
}
class MovieList {
    private Movie head;
    private Movie tail;
    public void addAtBeginning(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (head == null) {
            head = tail = newMovie;
        } else {
            newMovie.next = head;
            head.prev = newMovie;
            head = newMovie;
        }
    }
    public void addAtEnd(String title, String director, int year, double rating) {
        Movie newMovie = new Movie(title, director, year, rating);
        if (tail == null) {
            head = tail = newMovie;
        } else {
            tail.next = newMovie;
            newMovie.prev = tail;
            tail = newMovie;
        }
    }
    public void addAtPosition(int pos, String title, String director, int year, double rating) {
        if (pos <= 1) {
            addAtBeginning(title, director, year, rating);
            return;
        }
        Movie newMovie = new Movie(title, director, year, rating);
        Movie temp = head;
        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }
        if (temp == null || temp.next == null) {
            addAtEnd(title, director, year, rating);
        } else {
            newMovie.next = temp.next;
            newMovie.prev = temp;
            temp.next.prev = newMovie;
            temp.next = newMovie;
        }
    }
    public void removeByTitle(String title) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                if (temp == head) {
                    head = temp.next;
                    if (head != null) head.prev = null;
                } else if (temp == tail) {
                    tail = temp.prev;
                    if (tail != null) tail.next = null;
                } else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }
                return;
            }
            temp = temp.next;
        }
    }
    public void searchByDirector(String director) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.director.equalsIgnoreCase(director)) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found by director " + director);
    }
    public void searchByRating(double rating) {
        Movie temp = head;
        boolean found = false;
        while (temp != null) {
            if (temp.rating == rating) {
                printMovie(temp);
                found = true;
            }
            temp = temp.next;
        }
        if (!found) System.out.println("No movies found with rating " + rating);
    }
    public void updateRating(String title, double newRating) {
        Movie temp = head;
        while (temp != null) {
            if (temp.title.equalsIgnoreCase(title)) {
                temp.rating = newRating;
                return;
            }
            temp = temp.next;
        }
    }
    public void displayForward() {
        Movie temp = head;
        while (temp != null) {
            printMovie(temp);
            temp = temp.next;
        }
    }
    public void displayReverse() {
        Movie temp = tail;
        while (temp != null) {
            printMovie(temp);
            temp = temp.prev;
        }
    }
    private void printMovie(Movie m) {
        System.out.println("Title: " + m.title + ", Director: " + m.director + ", Year: " + m.year + ", Rating: " + m.rating);
    }
}
public class b {
    public static void main(String[] args) {
        MovieList list = new MovieList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1.Add at Beginning\n2.Add at End\n3.Add at Position\n4.Delete by Title\n5.Search by Director\n6.Search by Rating\n7.Display Forward\n8.Display Reverse\n9.Update Rating\n10.Exit");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    list.addAtBeginning(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                    break;
                case 2:
                    list.addAtEnd(sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                    break;
                case 3:
                    int pos = sc.nextInt();
                    list.addAtPosition(pos, sc.next(), sc.next(), sc.nextInt(), sc.nextDouble());
                    break;
                case 4:
                    list.removeByTitle(sc.next());
                    break;
                case 5:
                    list.searchByDirector(sc.next());
                    break;
                case 6:
                    list.searchByRating(sc.nextDouble());
                    break;
                case 7:
                    list.displayForward();
                    break;
                case 8:
                    list.displayReverse();
                    break;
                case 9:
                    list.updateRating(sc.next(), sc.nextDouble());
                    break;
                case 10:
                    return;
            }
        }
    }
}