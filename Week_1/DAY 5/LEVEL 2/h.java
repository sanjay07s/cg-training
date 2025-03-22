import java.util.Scanner;
class h {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            ages[i] = sc.nextInt();
        }
        String[][] result = checkVotingEligibility(ages);
        displayResult(result);
    }
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] eligibility = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            int age = ages[i];
            String voteEligibility = "Cannot Vote";
            if (age >= 0) {
                if (age >= 18) {
                    voteEligibility = "Can Vote";
                }
            } else {
                voteEligibility = "Cannot Vote";
            }
            eligibility[i][0] = String.valueOf(age);
            eligibility[i][1] = voteEligibility;
        }
        return eligibility;
    }
    public static void displayResult(String[][] result) {
        System.out.printf("%-10s%-20s\n", "Age", "Can Vote?");
        for (int i = 0; i < result.length; i++) {
            System.out.printf("%-10s%-20s\n", result[i][0], result[i][1]);
        }
    }
}