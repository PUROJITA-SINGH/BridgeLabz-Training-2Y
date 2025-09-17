import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter radius for Circle 1:");
        double radius = scanner.nextDouble();
        
        // Using parameterized constructor
        Circle circle1 = new Circle(radius);
        circle1.displayDetails();
        
        // Using default constructor
        Circle circle2 = new Circle();
        circle2.displayDetails();
        
        scanner.close();
    }
    
    private double radius;
    private final double PI = Math.PI;
    
    // Default constructor
    public Circle() {
        this(1.0); // Constructor chaining
    }
    
    // Parameterized constructor
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void displayDetails() {
        double area = PI * radius * radius;
        double circumference = 2 * PI * radius;
        System.out.println("Circle Details:");
        System.out.printf("Radius: %.2f\n", radius);
        System.out.printf("Area: %.2f square units\n", area);
        System.out.printf("Circumference: %.2f units\n", circumference);
        System.out.println();
    }
}
