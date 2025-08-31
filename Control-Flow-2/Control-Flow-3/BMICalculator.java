import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Enter height (cm): ");
        double heightCm = scanner.nextDouble();
        double heightM = heightCm / 100;
        double bmi = weight / (heightM * heightM);
        String status;
        if (bmi < 18.5) {
            status = "Underweight";
        } else if (bmi < 25) {
            status = "Normal";
        } else if (bmi < 30) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        System.out.printf("BMI: %.2f\n", bmi);
        System.out.println("Weight Status: " + status);
        scanner.close();
    }
}
