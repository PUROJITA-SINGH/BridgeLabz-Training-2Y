import java.util.Scanner;

public class TriangularParkRounds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three sides of the triangular park (in meters):");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        double rounds = calculateRounds(side1, side2, side3);
        System.out.printf("Number of rounds to complete 5km: %.2f%n", rounds);
        scanner.close();
    }

    public static double calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        double distance = 5000; // 5km in meters
        return distance / perimeter;
    }
}
