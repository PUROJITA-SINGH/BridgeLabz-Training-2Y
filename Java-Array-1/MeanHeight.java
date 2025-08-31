import java.util.Scanner;

public class MeanHeight {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] heights = new double[11];
        System.out.println("Enter heights of 11 players (in cm):");
        double sum = 0.0;
        for (int i = 0; i < 11; i++) {
            heights[i] = scanner.nextDouble();
            sum += heights[i];
        }
        double mean = sum / 11;
        System.out.printf("Mean height of the football team: %.2f cm\n", mean);
        scanner.close();
    }
}
