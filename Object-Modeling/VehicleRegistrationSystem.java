import java.util.Scanner;

public class VehicleRegistrationSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter owner name, vehicle type, and registration number:");
        String ownerName = scanner.nextLine();
        String vehicleType = scanner.nextLine();
        String registrationNumber = scanner.nextLine();
        
        Vehicle.updateRegistrationFee(100.0); // Set fee
        Vehicle vehicle = new Vehicle(ownerName, vehicleType, registrationNumber);
        if (vehicle instanceof Vehicle) {
            vehicle.displayDetails();
        }
        scanner.close();
    }
}

class Vehicle {
    private static double registrationFee = 50.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;
    
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }
    
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.printf("Registration fee updated to $%.2f\n", registrationFee);
    }
    
    public void displayDetails() {
        System.out.println("Vehicle Details:");
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Number: " + registrationNumber);
        System.out.printf("Registration Fee: $%.2f\n", registrationFee);
    }
}
