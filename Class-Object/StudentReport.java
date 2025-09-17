import java.util.Scanner;

public class StudentReport {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student name, roll number, and marks:");
        String name = scanner.nextLine();
        String rollNumber = scanner.nextLine();
        double marks = scanner.nextDouble();
        
        Student student = new Student(name, rollNumber, marks);
        student.displayDetails();
        scanner.close();
    }
}

class Student {
    private String name;
    private String rollNumber;
    private double marks;
    
    public Student(String name, String rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    
    public String calculateGrade() {
        if (marks >= 90) return "A+";
        else if (marks >= 80) return "A";
        else if (marks >= 70) return "B";
        else if (marks >= 60) return "C";
        else if (marks >= 50) return "D";
        else return "F";
    }
    
    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Grade: " + calculateGrade());
    }
}
