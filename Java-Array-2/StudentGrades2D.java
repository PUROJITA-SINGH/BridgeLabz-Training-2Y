import java.util.Scanner;

public class StudentGrades2D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of students: ");
        int number = scanner.nextInt();
        double[][] marks = new double[number][3];
        double[] percentages = new double[number];
        String[] grades = new String[number];
        
        System.out.println("Enter marks for Physics, Chemistry, Maths for each student:");
        for (int i = 0; i < number; i++) {
            System.out.println("Student " + (i + 1) + ":");
            double p = scanner.nextDouble();
            double c = scanner.nextDouble();
            double m = scanner.nextDouble();
            if (p < 0 || c < 0 || m < 0) {
                System.out.println("Invalid marks. Enter again:");
                i--;
                continue;
            }
            marks[i][0] = p;
            marks[i][1] = c;
            marks[i][2] = m;
        }
        
        for (int i = 0; i < number; i++) {
            percentages[i] = (marks[i][0] + marks[i][1] + marks[i][2]) / 3.0;
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
        
        System.out.println("Results:");
        for (int i = 0; i < number; i++) {
            System.out.printf("Student %d: Physics: %.2f, Chemistry: %.2f, Maths: %.2f, Percentage: %.2f%%, Grade: %s\n",
                i + 1, marks[i][0], marks[i][1], marks[i][2], percentages[i], grades[i]);
        }
        scanner.close();
    }
}
