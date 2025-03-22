import java.util.Random;
import java.util.Scanner;
class i {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of games to play: ");
        int numGames = sc.nextInt();
        int playerWins = 0, computerWins = 0, ties = 0;
        for (int i = 0; i < numGames; i++) {
            System.out.println("\nGame " + (i + 1));
            String playerChoice = getUserChoice(sc);
            String computerChoice = getComputerChoice();
            String winner = findWinner(playerChoice, computerChoice);
            if (winner.equals("Player")) {
                playerWins++;
            } else if (winner.equals("Computer")) {
                computerWins++;
            } else {
                ties++;
            }
            System.out.println("Player chose: " + playerChoice);
            System.out.println("Computer chose: " + computerChoice);
            System.out.println("Winner: " + winner);
        }
        String[][] resultStats = calculateStats(playerWins, computerWins, ties, numGames);
        displayResults(resultStats);
    }
    public static String getUserChoice(Scanner sc) {
        System.out.println("Choose (rock, paper, or scissors): ");
        String choice = sc.next().toLowerCase();
        while (!choice.equals("rock") && !choice.equals("paper") && !choice.equals("scissors")) {
            System.out.println("Invalid choice! Please choose rock, paper, or scissors.");
            choice = sc.next().toLowerCase();
        }
        return choice;
    }
    public static String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random rand = new Random();
        return choices[rand.nextInt(3)];
    }
    public static String findWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "Tie";
        } else if (playerChoice.equals("rock") && computerChoice.equals("scissors") ||
                   playerChoice.equals("paper") && computerChoice.equals("rock") ||
                   playerChoice.equals("scissors") && computerChoice.equals("paper")) {
            return "Player";
        } else {
            return "Computer";
        }
    }
    public static String[][] calculateStats(int playerWins, int computerWins, int ties, int totalGames) {
        double playerWinPercentage = ((double) playerWins / totalGames) * 100;
        double computerWinPercentage = ((double) computerWins / totalGames) * 100;
        String[][] stats = new String[3][3];
        stats[0][0] = "Player Wins: " + playerWins;
        stats[1][0] = "Computer Wins: " + computerWins;
        stats[2][0] = "Ties: " + ties;
        stats[0][1] = "Win Percentage: " + String.format("%.2f", playerWinPercentage) + "%";
        stats[1][1] = "Win Percentage: " + String.format("%.2f", computerWinPercentage) + "%";
        stats[2][1] = "Ties Percentage: " + String.format("%.2f", (double) ties / totalGames * 100) + "%";
        stats[0][2] = "Average Wins: " + String.format("%.2f", playerWinPercentage);
        stats[1][2] = "Average Wins: " + String.format("%.2f", computerWinPercentage);
        stats[2][2] = "Average Ties: " + String.format("%.2f", (double) ties / totalGames * 100);

        return stats;
    }
    public static void displayResults(String[][] stats) {
        System.out.println("\nResults Summary:");
        System.out.println("------------------------------------");
        System.out.printf("%-20s%-20s%-20s\n", "Player", "Computer", "Ties");
        System.out.printf("%-20s%-20s%-20s\n", stats[0][0], stats[1][0], stats[2][0]);
        System.out.printf("%-20s%-20s%-20s\n", stats[0][1], stats[1][1], stats[2][1]);
        System.out.printf("%-20s%-20s%-20s\n", stats[0][2], stats[1][2], stats[2][2]);
    }
}