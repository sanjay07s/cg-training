import java.util.Scanner;

public class i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side1 in meters: ");
        double side1 = scanner.nextDouble();
        System.out.print("Enter side2 in meters: ");
        double side2 = scanner.nextDouble();
        System.out.print("Enter side3 in meters: ");
        double side3 = scanner.nextDouble();
        double perimeter = side1 + side2 + side3;
        int rounds = (int) Math.ceil(5000 / perimeter);
        System.out.println("The total number of rounds the athlete will run is " + rounds + " to complete 5 km");
        scanner.close();
    }
}