import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int number = scanner.nextInt();
        double[] weights = new double[number];
        double[] heights = new double[number];
        double[] bmis = new double[number];
        String[] statuses = new String[number];
        
        System.out.println("Enter weight (kg) and height (cm) for each person:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            weights[i] = scanner.nextDouble();
            heights[i] = scanner.nextDouble();
            if (weights[i] <= 0 || heights[i] <= 0) {
                System.out.println("Invalid input. Enter again:");
                i--;
                continue;
            }
        }
        
        for (int i = 0; i < number; i++) {
            double heightM = heights[i] / 100;
            bmis[i] = weights[i] / (heightM * heightM);
            if (bmis[i] < 18.5) {
                statuses[i] = "Underweight";
            } else if (bmis[i] < 25) {
                statuses[i] = "Normal";
            } else if (bmis[i] < 30) {
                statuses[i] = "Overweight";
            } else {
                statuses[i] = "Obese";
            }
        }
        
        System.out.println("Results:");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Height: %.2f cm, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                i + 1, heights[i], weights[i], bmis[i], statuses[i]);
        }
        scanner.close();
    }
}
