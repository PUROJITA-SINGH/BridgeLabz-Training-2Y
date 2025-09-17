import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the radius of the circle:");
        double radius = scanner.nextDouble();
        
        Circle circle = new Circle(radius);
        circle.calculateArea();
        circle.calculateCircumference();
        scanner.close();
    }
}

class Circle {
    private double radius;
    private final double PI = Math.PI;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public void calculateArea() {
        double area = PI * radius * radius;
        System.out.printf("Area of the circle: %.2f square units\n", area);
    }
    
    public void calculateCircumference() {
        double circumference = 2 * PI * radius;
        System.out.printf("Circumference of the circle: %.2f units\n", circumference);
    }
}
