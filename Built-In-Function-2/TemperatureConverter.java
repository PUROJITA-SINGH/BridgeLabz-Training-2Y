import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature value:");
        double temp = scanner.nextDouble();
        System.out.println("Enter unit (C for Celsius, F for Fahrenheit):");
        char unit = scanner.next().toUpperCase().charAt(0);
        
        if (unit == 'C') {
            double fahrenheit = celsiusToFahrenheit(temp);
            displayResult(temp, "Celsius", fahrenheit, "Fahrenheit");
        } else if (unit == 'F') {
            double celsius = fahrenheitToCelsius(temp);
            displayResult(temp, "Fahrenheit", celsius, "Celsius");
        } else {
            System.out.println("Invalid unit! Please enter C or F.");
        }
        scanner.close();
    }

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void displayResult(double input, String inputUnit, double output, String outputUnit) {
        System.out.printf("%.2f %s = %.2f %s\n", input, inputUnit, output, outputUnit);
    }
}
