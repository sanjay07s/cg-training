import java.util.Scanner;

public class l  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight in pounds: ");
        double weightInPounds = scanner.nextDouble();
        double weightInKg = weightInPounds / 2.2;
        System.out.println("The weight of the person in pound is " + weightInPounds + " and in kg is " + weightInKg);
        scanner.close();
    }
}