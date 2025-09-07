import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][2];
        System.out.println("Enter weight (kg) and height (cm) for 10 team members:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("Member %d: ", i + 1);
            teamData[i][0] = scanner.nextDouble(); // Weight
            teamData[i][1] = scanner.nextDouble(); // Height
        }
        
        String[][] bmiData = calculateBMIAndStatus(teamData);
        displayBMIData(bmiData);
        scanner.close();
    }

    public static String[][] calculateBMIAndStatus(double[][] teamData) {
        String[][] bmiData = new String[teamData.length][4];
        for (int i = 0; i < teamData.length; i++) {
            double weight = teamData[i][0];
            double heightM = teamData[i][1] / 100; // Convert cm to meters
            double bmi = weight / (heightM * heightM);
            String status;
            if (bmi < 18.5) status = "Underweight";
            else if (bmi < 25) status = "Normal";
            else if (bmi < 30) status = "Overweight";
            else status = "Obese";
            bmiData[i][0] = String.format("%.2f", teamData[i][1]);
            bmiData[i][1] = String.format("%.2f", weight);
            bmiData[i][2] = String.format("%.2f", bmi);
            bmiData[i][3] = status;
        }
        return bmiData;
    }

    public static void displayBMIData(String[][] bmiData) {
        System.out.println("Person\tHeight(cm)\tWeight(kg)\tBMI\tStatus");
        for (int i = 0; i < bmiData.length; i++) {
            System.out.printf("%d\t%s\t\t%s\t\t%s\t%s\n", i + 1, 
                bmiData[i][0], bmiData[i][1], bmiData[i][2], bmiData[i][3]);
        }
    }
}
