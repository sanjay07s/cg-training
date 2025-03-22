public class b  {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter years of service: ");
        int yearsOfService = scanner.nextInt();
        if (yearsOfService > 5) {
            double bonus = 0.05 * salary;
            System.out.println("Bonus Amount: " + bonus);
        } else {
            System.out.println("No bonus");
        }
        scanner.close();
    }
}