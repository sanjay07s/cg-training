import java.util.Scanner;
public class i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter " + size + " integers:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the index to access: ");
        int index = scanner.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();
        try {
            try {
                int value = array[index]; 
                System.out.println("Value at index " + index + ": " + value);
                try {
                    int result = value / divisor; 
                    System.out.println("Result of division: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
            }
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
            scanner.close();
        }
    }
}