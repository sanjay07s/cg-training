import java.util.Scanner;
public class f {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        double sum = 0.0;
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        double mean = sum / 11;
        System.out.println("Mean height of the football team: " + mean);
        scanner.close();
    }
}