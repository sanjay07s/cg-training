import java.util.Scanner;
public class d {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = null;
        try {
            System.out.print("Enter the number of elements: ");
            int size = scanner.nextInt();
            if (size > 0) {
                array = new int[size];
                System.out.println("Enter " + size + " integers:");
                for (int i = 0; i < size; i++) {
                    array[i] = scanner.nextInt();
                }
            }
            System.out.print("Enter index to access: ");
            int index = scanner.nextInt();
            int value = array[index];
            System.out.println("Value at index " + index + ": " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index!");
        } catch (NullPointerException e) {
            System.out.println("Array is not initialized!");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred.");
        } finally {
          scanner.close();
        }
    }
}