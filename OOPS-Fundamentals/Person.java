import java.util.Scanner;

public class Person {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter person name and age:");
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        
        // Create original person
        Person person1 = new Person(name, age);
        person1.displayDetails();
        
        // Create copy using copy constructor
        Person person2 = new Person(person1);
        person2.displayDetails();
        
        scanner.close();
    }
    
    private String name;
    private int age;
    
    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    // Copy constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }
    
    public void displayDetails() {
        System.out.println("Person Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println();
    }
}
