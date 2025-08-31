import java.util.Scanner;

public class StudentGrades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Input number of students
        System.out.println("Enter number of students: ");
        int number = scanner.nextInt();
        if (number <= 0) {
            System.out.println("Invalid number of students. Must be positive.");
            scanner.close();
            return;
        }
        
        // Initialize arrays for marks, percentages, and grades
        double[] physics = new double[number];
        double[] chemistry = new double[number];
        double[] maths = new double[number];
        double[] percentages = new double[number];
        String[] grades = new String[number];
        
        // Input marks for each student
        System.out.println("Enter marks for Physics, Chemistry, Maths for each student:");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ":");
            double p = scanner.nextDouble();
            double c = scanner.nextDouble();
            double m = scanner.nextDouble();
            // Validate marks
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks. Enter again:");
                i--;
                continue;
            }
            physics[i] = p;
            chemistry[i] = c;
            maths[i] = m;
        }
        
        // Calculate percentages and assign grades
        for (int i = 0; i < number; i++) {
            percentages[i] = (physics[i] + chemistry[i] + maths[i]) / 3.0;
            if (percentages[i] >= 90) {
                grades[i] = "A+";
            } else if (percentages[i] >= 80) {
                grades[i] = "A";
            } else if (percentages[i] >= 70) {
                grades[i] = "B";
            } else if (percentages[i] >= 60) {
                grades[i] = "C";
            } else if (percentages[i] >= 50) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        
        // Display results
        System.out.println("Results:");
        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d: Physics: %.2f, Chemistry: %.2f, Maths: %.2f, Percentage: %.2f%%, Grade: %s\n",
                i + 1, physics[i], chemistry[i], maths[i], percentages[i], grades[i]);
        }
        scanner.close();
    }
}
