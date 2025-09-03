public class UnitConvertorMisc {
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }
    
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }
    
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }
    
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
    
    public static void main(String[] args) {
        // Example usage
        System.out.println("32 Fahrenheit to Celsius: " + convertFahrenheitToCelsius(32));
        System.out.println("0 Celsius to Fahrenheit: " + convertCelsiusToFahrenheit(0));
        System.out.println("10 pounds to kilograms: " + convertPoundsToKilograms(10));
        System.out.println("10 kilograms to pounds: " + convertKilogramsToPounds(10));
        System.out.println("10 gallons to liters: " + convertGallonsToLiters(10));
        System.out.println("10 liters to gallons: " + convertLitersToGallons(10));
    }
}
