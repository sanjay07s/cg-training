import java.util.Scanner;
public class b {
    public static int recursiveSum(int n) {
        if (n == 1)
            return 1;
        return n + recursiveSum(n - 1);
    }
    public static int formulaSum(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Invalid input. Not a natural number.");
            return;
        }
        int sumRecursive = recursiveSum(n);
        int sumFormula = formulaSum(n);
        System.out.println("Sum using recursion: " + sumRecursive);
        System.out.println("Sum using formula: " + sumFormula);
        if (sumRecursive == sumFormula) {
            System.out.println("Both results are equal. Computation is correct.");
        } else {
            System.out.println("Mismatch in results. Check the logic.");
        }
    }
}