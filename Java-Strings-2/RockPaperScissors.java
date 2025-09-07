import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of games:");
        int n = scanner.nextInt();
        scanner.nextLine(); // Clear buffer
        
        String[][] results = new String[n][2];
        int playerWins = 0, computerWins = 0;
        
        for (int i = 0; i < n; i++) {
            System.out.println("Enter your choice (rock/paper/scissors):");
            String player = scanner.nextLine().toLowerCase();
            String computer = getComputerChoice();
            String winner = findWinner(player, computer);
            results[i][0] = player;
            results[i][1] = computer;
            if (winner.equals("Player")) playerWins++;
            else if (winner.equals("Computer")) computerWins++;
        }
        
        String[][] stats = calculateStats(playerWins, computerWins, n);
        displayGameResults(results, stats);
        scanner.close();
    }

    public static String getComputerChoice() {
        Random rand = new Random();
        int choice = rand.nextInt(3);
        return switch (choice) {
            case 0 -> "rock";
            case 1 -> "paper";
            case 2 -> "scissors";
            default -> "";
        };
    }

    public static String findWinner(String player, String computer) {
        if (player.equals(computer)) return "Tie";
        if ((player.equals("rock") && computer.equals("scissors")) ||
            (player.equals("paper") && computer.equals("rock")) ||
            (player.equals("scissors") && computer.equals("paper"))) {
            return "Player";
        }
        return "Computer";
    }

    public static String[][] calculateStats(int playerWins, int computerWins, int totalGames) {
        double playerAvg = (double) playerWins / totalGames;
        double computerAvg = (double) computerWins / totalGames;
        double playerPercent = playerAvg * 100;
        double computerPercent = computerAvg * 100;
        return new String[][] {
            {"Player", String.valueOf(playerWins), String.format("%.2f", playerAvg), String.format("%.2f", playerPercent)},
            {"Computer", String.valueOf(computerWins), String.format("%.2f", computerAvg), String.format("%.2f", computerPercent)}
        };
    }

    public static void displayGameResults(String[][] results, String[][] stats) {
        System.out.println("Game\tPlayer\tComputer");
        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1]);
        }
        System.out.println("\nStats\tWins\tAverage\tPercentage");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1] + "\t" + stat[2] + "\t" + stat[3] + "%");
        }
    }
}
