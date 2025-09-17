import java.util.Scanner;

public class EmployeeDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name, ID, and salary:");
        String name = scanner.nextLine();
        String id = scanner.nextLine();
        double salary = scanner.nextDouble();
        
        Employee employee = new Employee(name, id, salary);
        employee.displayDetails();
        scanner.close();
    }
}

class Employee {
    private String name;
    private String id;
    private double salary;
    
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: $" + String.format("%.2f", salary));
    }
}
