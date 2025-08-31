import java.util.Scanner;

public class BMICalculator2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of persons: ");
        int number = scanner.nextInt();
        double[][] personData = new double[number][3];
        String[] weightStatus = new String[number];
        
        System.out.println("Enter weight (kg) and height (cm) for each person:");
        for (int i = 0; i < number; i++) {
            System.out.println("Person " + (i + 1) + ":");
            double weight = scanner.nextDouble();
            double height = scanner.nextDouble();
            if (weight <= 0 || height <= 0) {
                System.out.println("Invalid input. Enter again:");
                i--;
                continue;
            }
            personData[i][0] = weight;
            personData[i][1] = height;
        }
        
        for (int i = 0; i < number; i++) {
            double heightM = personData[i][1] / 100;
            personData[i][2] = personData[i][0] / (heightM * heightM);
            if (personData[i][2] < 18.5) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] < 25) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] < 30) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }
        
        System.out.println("Results:");
        for (int i = 0; i < number; i++) {
            System.out.printf("Person %d: Height: %.2f cm, Weight: %.2f kg, BMI: %.2f, Status: %s\n",
                i + 1, personData[i][1], personData[i][0], personData[i][2], weightStatus[i]);
        }
        scanner.close();
    }
}
