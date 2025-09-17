import java.util.ArrayList;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(new Car("V001", "Sedan", 50));
        vehicles.add(new Bike("V002", "Motorcycle", 20));
        vehicles.add(new Truck("V003", "Heavy Duty", 100));
        
        int days = 3;
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.printf("Rental Cost for %d days: $%.2f\n", days, vehicle.calculateRentalCost(days));
            if (vehicle instanceof Insurable) {
                System.out.printf("Insurance Cost: $%.2f\n", ((Insurable) vehicle).calculateInsurance());
                System.out.println(((Insurable) vehicle).getInsuranceDetails());
            }
            System.out.println();
        }
    }
}

abstract class Vehicle implements Insurable {
    private String vehicleNumber;
    private String type;
    private double rentalRate;
    
    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }
    
    public String getVehicleNumber() { return vehicleNumber; }
    public String getType() { return type; }
    public double getRentalRate() { return rentalRate; }
    public void setRentalRate(double rentalRate) { this.rentalRate = rentalRate; }
    
    public abstract double calculateRentalCost(int days);
}

interface Insurable {
    double calculateInsurance();
    String getInsuranceDetails();
}

class Car extends Vehicle {
    public Car(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }
    
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }
    
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.1; // 10% of rental rate
    }
    
    @Override
    public String getInsuranceDetails() {
        return "Car Insurance: 10% of rental rate";
    }
}

class Bike extends Vehicle {
    public Bike(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }
    
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 0.8; // 20% discount
    }
    
    @Override
    public double calculateInsurance() {
        return 5; // Fixed insurance cost
    }
    
    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance: $5 flat rate";
    }
}

class Truck extends Vehicle {
    public Truck(String vehicleNumber, String type, double rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }
    
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days * 1.2; // 20% surcharge
    }
    
    @Override
    public double calculateInsurance() {
        return getRentalRate() * 0.15; // 15% of rental rate
    }
    
    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance: 15% of rental rate";
    }
}
