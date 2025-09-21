public class EmployeeManagementSystem {
    public static void main(String[] args) {
        Employee manager = new Manager("Alice", "E001", 80000, 5);
        Employee developer = new Developer("Bob", "E002", 60000, "Java");
        Employee intern = new Intern("Charlie", "E003", 30000, "6 months");
        
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}

class Employee {
    protected String name;
    protected String id;
    protected double salary;
    
    public Employee(String name, String id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    
    public void displayDetails() {
        System.out.println("Name: " + name + ", ID: " + id + ", Salary: $" + String.format("%.2f", salary));
    }
}

class Manager extends Employee {
    private int teamSize;
    
    public Manager(String name, String id, double salary, int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Manager, Team Size: " + teamSize);
    }
}

class Developer extends Employee {
    private String programmingLanguage;
    
    public Developer(String name, String id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Developer, Programming Language: " + programmingLanguage);
    }
}

class Intern extends Employee {
    private String internshipDuration;
    
    public Intern(String name, String id, double salary, String internshipDuration) {
        super(name, id, salary);
        this.internshipDuration = internshipDuration;
    }
    
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Role: Intern, Duration: " + internshipDuration);
    }
}
