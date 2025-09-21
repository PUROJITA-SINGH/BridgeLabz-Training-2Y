public class SchoolSystemRoles {
    public static void main(String[] args) {
        Person teacher = new Teacher("Alice", 35, "Mathematics");
        Person student = new Student("Bob", 15, "10th");
        Person staff = new Staff("Charlie", 40, "Admin");
        
        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}

class Person {
    protected String name;
    protected int age;
    
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void displayRole() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Teacher extends Person {
    private String subject;
    
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    
    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Role: Teacher, Subject: " + subject);
    }
}

class Student extends Person {
    private String grade;
    
    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }
    
    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Role: Student, Grade: " + grade);
    }
}

class Staff extends Person {
    private String department;
    
    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    
    @Override
    public void displayRole() {
        super.displayRole();
        System.out.println("Role: Staff, Department: " + department);
    }
}
