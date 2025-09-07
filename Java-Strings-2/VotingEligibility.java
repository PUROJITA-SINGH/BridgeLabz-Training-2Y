import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = scanner.nextInt();
        
        int[] ages = generateAges(n);
        String[][] votingStatus = checkVotingEligibility(ages);
        displayVotingStatus(votingStatus);
        scanner.close();
    }

    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(50); // Random age between 0 and 49
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] votingStatus = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            votingStatus[i][0] = String.valueOf(ages[i]);
            votingStatus[i][1] = (ages[i] >= 18 && ages[i] >= 0) ? "true" : "false";
        }
        return votingStatus;
    }

    public static void displayVotingStatus(String[][] votingStatus) {
        System.out.println("Student\tAge\tCan Vote");
        for (int i = 0; i < votingStatus.length; i++) {
            System.out.println((i + 1) + "\t" + Integer.parseInt(votingStatus[i][0]) + "\t" + votingStatus[i][1]);
        }
    }
}
