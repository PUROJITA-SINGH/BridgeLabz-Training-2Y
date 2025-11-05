// Simulated packages: com.company.hr, com.company.payroll, com.company.main

class Employee {
    private int id;
    private String name, department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id; this.name = name; this.department = department; this.salary = salary;
    }
    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}

class Payroll {
    public double calculateBonus(Employee e) {
        return e.getSalary() * 1.10; // 10% bonus
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "Riya", "IT", 50000);
        Payroll pay = new Payroll();
        double total = pay.calculateBonus(emp);

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Name: " + emp.getName());
        System.out.println("Department: " + emp.getDepartment());
        System.out.println("Salary after bonus: " + total);

        System.out.println("\n(Each class would live in its own package in a real project.)");
    }
}
