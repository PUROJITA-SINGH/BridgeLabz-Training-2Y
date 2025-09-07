import java.util.Random;
import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students:");
        int n = scanner.nextInt();
        
        double[][] scores = generateScores(n);
        double[][] results = calculateResults(scores);
        String[][] grades = calculateGrades(results);
        displayScorecard(scores, results, grades);
        scanner.close();
    }

    public static double[][] generateScores(int n) {
        Random rand = new Random();
        double[][] scores = new double[n][3];
        for (int i = 0; i < n; i++) {
            scores[i][0] = 10 + rand.nextInt(91); // Physics
            scores[i][1] = 10 + rand.nextInt(91); // Chemistry
            scores[i][2] = 10 + rand.nextInt(91); // Maths
        }
        return scores;
    }

    public static double[][] calculateResults(double[][] scores) {
        double[][] results = new double[scores.length][3];
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

    public static String[][] calculateGrades(double[][] results) {
        String[][] grades = new String[results.length][1];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) grades[i][0] = "A+";
            else if (percentage >= 80) grades[i][0] = "A";
            else if (percentage >= 70) grades[i][0] = "B";
            else if (percentage >= 60) grades[i][0] = "C";
            else if (percentage >= 50) grades[i][0] = "D";
            else grades[i][0] = "F";
        }
        return grades;
    }

    public static void displayScorecard(double[][] scores, double[][] results, String[][] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f\t%.2f%%\t%s\n",
                i + 1, scores[i][0], scores[i][1], scores[i][2],
                results[i][0], results[i][1], results[i][2], grades[i][0]);
        }
    }
}
