import java.util.Scanner
class d {
    String movieName
    int seatNumber
    double price
    MovieTicket(String movieName) {
        this.movieName = movieName
        this.seatNumber = -1
        this.price = 0.0
    }
    void bookTicket(int seat, double ticketPrice) {
        this.seatNumber = seat
        this.price = ticketPrice
    }
    void displayTicket() {
        System.out.println("Movie Name: " + movieName)
        System.out.println("Seat Number: " + seatNumber)
        System.out.println("Price: ₹" + price)
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)
        System.out.print("Enter movie name: ")
        String movie = scanner.nextLine()
        System.out.print("Enter seat number: ")
        int seat = scanner.nextInt()
        System.out.print("Enter ticket price: ")
        double price = scanner.nextDouble()
        MovieTicket ticket = new MovieTicket(movie)
        ticket.bookTicket(seat, price)
        System.out.println("Booking Confirmed:")
        ticket.displayTicket()
    }
}