public class EarthVolume {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;
        double volumeKm3 = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);
        double kmToMiles = 1.0 / 1.6; // 1 km = 1/1.6 miles
        double volumeMiles3 = volumeKm3 * Math.pow(kmToMiles, 3);
        System.out.println("The volume of earth in cubic kilometers is " + volumeKm3 + " and cubic miles is " + volumeMiles3);
    }
}
