import java.util.Random;
import java.util.Scanner;

public class StudentMarks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();
        
        int[][] scores = generateScores(numStudents);
        double[][] results = calculateResults(scores);
        displayScorecard(scores, results);
    }
    
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // Physics, Chemistry, Math
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = random.nextInt(90) + 10; // 10-99
            }
        }
        return scores;
    }
    
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][3]; // total, avg, percentage
        for (int i = 0; i < scores.length; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2];
            double avg = total / 3;
            double percentage = (total / 300) * 100;
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(avg * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }
        return results;
    }
    
    public static void displayScorecard(int[][] scores, double[][] results) {
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t%.2f%%\n",
                (i + 1), scores[i][0], scores[i][1], scores[i][2],
                results[i][0], results[i][1], results[i][2]);
        }
    }
}
