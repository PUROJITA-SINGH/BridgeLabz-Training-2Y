import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an angle in degrees:");
        double angle = scanner.nextDouble();
        double[] trigValues = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine: %.4f, Cosine: %.4f, Tangent: %.4f%n", 
            trigValues[0], trigValues[1], trigValues[2]);
        scanner.close();
    }

    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);
        return new double[]{sine, cosine, tangent};
    }
}
