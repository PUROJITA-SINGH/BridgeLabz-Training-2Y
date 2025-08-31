import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter marks for Physics, Chemistry, and Maths: ");
        double physics = scanner.nextDouble();
        double chemistry = scanner.nextDouble();
        double maths = scanner.nextDouble();
        double total = physics + chemistry + maths;
        double percentage = (total / 300) * 100;
        String grade, remarks;
        if (percentage >= 90) {
            grade = "A+";
            remarks = "Excellent";
        } else if (percentage >= 80) {
            grade = "A";
            remarks = "Very Good";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Good";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Satisfactory";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Pass";
        } else {
            grade = "F";
            remarks = "Fail";
        }
        System.out.printf("Average Mark: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        scanner.close();
    }
}
