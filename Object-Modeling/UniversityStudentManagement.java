import java.util.Scanner;

public class UniversityStudentManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name, roll number, and grade:");
        String name = scanner.nextLine();
        String rollNumber = scanner.nextLine();
        String grade = scanner.nextLine();
        
        Student student = new Student(name, rollNumber, grade);
        if (student instanceof Student) {
            student.displayStudentDetails();
        }
        Student.displayTotalStudents();
        scanner.close();
    }
}

class Student {
    private static String universityName = "Global University";
    private static int totalStudents = 0;
    private final String rollNumber;
    private String name;
    private String grade;
    
    public Student(String name, String rollNumber, String grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }
    
    public static void displayTotalStudents() {
        System.out.println("University: " + universityName);
        System.out.println("Total Students: " + totalStudents);
    }
    
    public void displayStudentDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Grade: " + grade);
    }
}
