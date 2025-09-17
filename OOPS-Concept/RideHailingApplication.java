import java.util.ArrayList;

public class RideHailingApplication {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("V001", "Alice", 2));
        vehicles.add(new Bike("V002", "Bob", 1));
        vehicles.add(new Auto("V003", "Charlie", 1.5));
        
        double distance = 10;
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.printf("Fare for %.2f km: $%.2f\n", distance, vehicle.calculateFare(distance));
            System.out.println(((GPS) vehicle).getCurrentLocation());
            System.out.println();
        }
    }
}

abstract class Vehicle implements GPS {
    private String vehicleId;
    private String driverName;
    private double ratePerKm;
    
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }
    
    public String getVehicleId() { return vehicleId; }
    public String getDriverName() { return driverName; }
    public double getRatePerKm() { return ratePerKm; }
    
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver: " + driverName + ", Rate/km: $" + ratePerKm;
    }
    
    public abstract double calculateFare(double distance);
    
    @Override
    public String getCurrentLocation() {
        return "Current Location: GPS Coordinates (Mock)";
    }
    
    @Override
    public void updateLocation() {
        // Mock implementation
    }
}

interface GPS {
    String getCurrentLocation();
    void updateLocation();
}

class Car extends Vehicle {
    public Car(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance;
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance * 0.8; // 20% discount
    }
}

class Auto extends Vehicle {
    public Auto(String vehicleId, String driverName, double ratePerKm) {
        super(vehicleId, driverName, ratePerKm);
    }
    
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 5; // $5 base fare
    }
}
