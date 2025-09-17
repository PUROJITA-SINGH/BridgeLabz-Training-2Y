import java.util.ArrayList;

public class EmployeeManagementSystem {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("E001", "Alice", 50000));
        employees.add(new PartTimeEmployee("E002", "Bob", 20, 25));
        
        for (Employee emp : employees) {
            emp.assignDepartment("Engineering");
            emp.displayDetails();
            System.out.println();
        }
    }
}

abstract class Employee implements Department {
    private String employeeId;
    private String name;
    private double baseSalary;
    private String department;
    
    public Employee(String employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }
    
    public String getEmployeeId() { return employeeId; }
    public String getName() { return name; }
    public double getBaseSalary() { return baseSalary; }
    public void setBaseSalary(double baseSalary) { this.baseSalary = baseSalary; }
    
    public abstract double calculateSalary();
    
    public void displayDetails() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + String.format("%.2f", calculateSalary()));
        System.out.println("Department: " + (department != null ? department : "Not Assigned"));
    }
    
    @Override
    public void assignDepartment(String department) {
        this.department = department;
    }
    
    @Override
    public String getDepartmentDetails() {
        return department != null ? department : "No Department Assigned";
    }
}

interface Department {
    void assignDepartment(String department);
    String getDepartmentDetails();
}

class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String employeeId, String name, double baseSalary) {
        super(employeeId, name, baseSalary);
    }
    
    @Override
    public double calculateSalary() {
        return getBaseSalary();
    }
}

class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private int hoursWorked;
    
    public PartTimeEmployee(String employeeId, String name, double hourlyRate, int hoursWorked) {
        super(employeeId, name, hourlyRate * hoursWorked);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }
    
    @Override
    public double calculateSalary() {
        return hourlyRate * hoursWorked;
    }
}
