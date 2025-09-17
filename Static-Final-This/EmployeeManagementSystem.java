import java.util.Scanner;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter employee name, ID, and designation:");
        String name = scanner.nextLine();
        String id = scanner.nextLine();
        String designation = scanner.nextLine();
        
        Employee employee = new Employee(name, id, designation);
        if (employee instanceof Employee) {
            employee.displayDetails();
        }
        Employee.displayTotalEmployees();
        scanner.close();
    }
}

class Employee {
    private static String companyName = "Tech Corp";
    private static int totalEmployees = 0;
    private final String id;
    private String name;
    private String designation;
    
    public Employee(String name, String id, String designation) {
        this.name = name;
        this.id = id;
        this.designation = designation;
        totalEmployees++;
    }
    
    public static void displayTotalEmployees() {
        System.out.println("Company: " + companyName);
        System.out.println("Total Employees: " + totalEmployees);
    }
    
    public void displayDetails() {
        System.out.println("Employee Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Designation: " + designation);
    }
}
