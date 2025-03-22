import java.util.Scanner;
public class d{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side A (in meters): ");
        double sideA = sc.nextDouble();
        System.out.print("Enter side B (in meters): ");
        double sideB = sc.nextDouble();
        System.out.print("Enter side C (in meters): ");
        double sideC = sc.nextDouble();
        double rounds = calculateRounds(sideA, sideB, sideC);
        System.out.println("The athlete must complete " + rounds + " rounds to complete a 5 km run.");
    } 
    public static int calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000;
        return (int) Math.ceil(distance / perimeter);
    }
}