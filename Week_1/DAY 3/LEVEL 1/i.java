import java.util.Scanner;
public class i {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        int[] array = new int[rows * columns];
        int index = 0;
        System.out.println("Enter elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
                array[index++] = matrix[i][j];
            }
        }
        System.out.print("1D Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        scanner.close();
    } 
}
