import java.util.Scanner;
class Ticket {
    int ticketId;
    String customerName;
    String movieName;
    int seatNumber;
    String bookingTime;
    Ticket next;
    public Ticket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        this.ticketId = ticketId;
        this.customerName = customerName;
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.bookingTime = bookingTime;
        this.next = null;
    }
}
class TicketReservationSystem {
    private Ticket head;
    private Ticket tail;
    public TicketReservationSystem() {
        head = null;
        tail = null;
    }
        public void addTicket(int ticketId, String customerName, String movieName, int seatNumber, String bookingTime) {
        Ticket newTicket = new Ticket(ticketId, customerName, movieName, seatNumber, bookingTime);
        if (head == null) {
            head = newTicket;
            tail = newTicket;
            newTicket.next = head; 
        } else {
            tail.next = newTicket;
            tail = newTicket;
            tail.next = head; 
        }
        System.out.println("Ticket added successfully!");
    }
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }
        Ticket current = head;
        Ticket previous = null;
        if (head.ticketId == ticketId) {
            if (head == tail) {
                head = null;
                tail = null;
            } else {
                head = head.next;
                tail.next = head;
            }
            System.out.println("Ticket with ID " + ticketId + " removed successfully.");
            return;
        }
        do {
            previous = current;
            current = current.next;
        } while (current != head && current.ticketId != ticketId);
        if (current == head) {
            System.out.println("Ticket with ID " + ticketId + " not found.");
            return;
        }
        previous.next = current.next;
        if (current == tail) {
            tail = previous;
        }
        System.out.println("Ticket with ID " + ticketId + " removed successfully.");
    }
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets to display.");
            return;
        }

        Ticket current = head;
        do {
            System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName +
                    ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
            current = current.next;
        } while (current != head);
    }
    public void searchTicket(String searchTerm) {
        if (head == null) {
            System.out.println("No tickets to search.");
            return;
        }
        Ticket current = head;
        boolean found = false;
        do {
            if (current.customerName.equalsIgnoreCase(searchTerm) || current.movieName.equalsIgnoreCase(searchTerm)) {
                System.out.println("Ticket ID: " + current.ticketId + ", Customer: " + current.customerName +
                        ", Movie: " + current.movieName + ", Seat: " + current.seatNumber + ", Booking Time: " + current.bookingTime);
                found = true;
            }
            current = current.next;
        } while (current != head);
        if (!found) {
            System.out.println("No tickets found for the search term: " + searchTerm);
        }
    }
    public void totalTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }
        int count = 0;
        Ticket current = head;
        do {
            count++;
            current = current.next;
        } while (current != head);

        System.out.println("Total booked tickets: " + count);
    }
}
public class i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TicketReservationSystem system = new TicketReservationSystem();
        while (true) {
            System.out.println("\nOnline Ticket Reservation System");
            System.out.println("1. Add Ticket");
            System.out.println("2. Remove Ticket");
            System.out.println("3. Display All Tickets");
            System.out.println("4. Search for Ticket");
            System.out.println("5. Total Booked Tickets");
            System.out.println("6. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter Ticket ID: ");
                    int ticketId = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Customer Name: ");
                    String customerName = sc.nextLine();
                    System.out.print("Enter Movie Name: ");
                    String movieName = sc.nextLine();
                    System.out.print("Enter Seat Number: ");
                    int seatNumber = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Booking Time: ");
                    String bookingTime = sc.nextLine();
                    system.addTicket(ticketId, customerName, movieName, seatNumber, bookingTime);
                    break;
                case 2:
                    System.out.print("Enter Ticket ID to Remove: ");
                    int removeTicketId = sc.nextInt();
                    system.removeTicket(removeTicketId);
                    break;
                case 3:
                    system.displayTickets();
                    break;
                case 4:
                    System.out.print("Enter Customer Name or Movie Name to Search: ");
                    String searchTerm = sc.nextLine();
                    system.searchTicket(searchTerm);
                    break;
                case 5:
                    system.totalTickets();
                    break;
                case 6:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}