interface Converter {
    static double kmToMiles(double km) { return km * 0.621371; }
    static double kgToLbs(double kg) { return kg * 2.20462; }
}

public class Conversion {
    public static void main(String[] args) {
        System.out.println("10 km = " + Converter.kmToMiles(10) + " miles");
    }
}
