import java.util.Scanner;
class a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] weightHeight = new double[10][2];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Person " + (i + 1));
            System.out.print("Enter weight (in kg): ");
            weightHeight[i][0] = sc.nextDouble();
            System.out.print("Enter height (in cm): ");
            weightHeight[i][1] = sc.nextDouble();
        }
        String[][] result = calculateBMIAndStatus(weightHeight);
        displayResults(result);
    }
    public static String[][] calculateBMIAndStatus(double[][] weightHeight) {
        String[][] bmiStatus = new String[10][4];
        for (int i = 0; i < 10; i++) {
            double weight = weightHeight[i][0];
            double heightInMeters = weightHeight[i][1] / 100;
            double bmi = weight / (heightInMeters * heightInMeters);
            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi >= 25 && bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }
            bmiStatus[i][0] = String.format("%.2f", weightHeight[i][1]) + " cm";
            bmiStatus[i][1] = String.format("%.2f", weightHeight[i][0]) + " kg";
            bmiStatus[i][2] = String.format("%.2f", bmi);
            bmiStatus[i][3] = status;
        }
        return bmiStatus;
    }
    public static void displayResults(String[][] result) {
        System.out.println("\nPerson\t\tHeight\t\tWeight\t\tBMI\t\tStatus");
        System.out.println("---------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Person %d\t%-10s\t%-10s\t%-10s\t%-10s\n",
                    (i + 1), result[i][0], result[i][1], result[i][2], result[i][3]);
        }
    }
}