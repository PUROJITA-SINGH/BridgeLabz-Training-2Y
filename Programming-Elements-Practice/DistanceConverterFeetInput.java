import java.util.Scanner;

public class DistanceConverterFeetInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distanceInFeet: ");
        double distanceInFeet = scanner.nextDouble();
        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;
        System.out.println("The distance in yards is " + distanceInYards + " while the distance in miles is " + distanceInMiles);
        scanner.close();
    }
}
