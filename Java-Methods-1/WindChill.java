import java.util.Scanner;

public class WindChill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature (F) and wind speed (mph):");
        double temperature = scanner.nextDouble();
        double windSpeed = scanner.nextDouble();
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.printf("Wind chill temperature: %.2f°F%n", windChill);
        scanner.close();
    }

    public static double calculateWindChill(double temperature, double windSpeed) {
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
