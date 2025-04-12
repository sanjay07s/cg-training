import java.util.Scanner;
public class g {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       try {
            System.out.print("Enter numerator: ");
            int num1 = scanner.nextInt();
            System.out.print("Enter denominator: ");
            int num2 = scanner.nextInt();
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Operation completed");
            scanner.close();
        }
    }
}