import java.util.Scanner;

public class h {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        System.out.print("Enter from city: ");
        String fromCity = scanner.nextLine();
        System.out.print("Enter via city: ");
        String viaCity = scanner.nextLine();
        System.out.print("Enter to city: ");
        String toCity = scanner.nextLine();
        System.out.print("Enter distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();
        System.out.print("Enter distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();
        System.out.print("Enter time taken in hours: ");
        double timeTaken = scanner.nextDouble();
        System.out.print("Enter fee: ");
        int fee = scanner.nextInt();
        System.out.print("Enter discount percent: ");
        int discountPercent = scanner.nextInt();
        int discountedFee = fee - (fee * discountPercent / 100);
        int sum = fee + discountPercent;
        int product = fee * discountPercent;
        System.out.println("The results of Int Operations are " +  discountedFee + ", " + sum + ", and " + product);
        scanner.close();
    }
}