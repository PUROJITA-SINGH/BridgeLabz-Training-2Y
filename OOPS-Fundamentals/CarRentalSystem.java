import java.util.Scanner;

public class CarRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter customer name, car model, and rental days:");
        String customerName = scanner.nextLine();
        String carModel = scanner.nextLine();
        int rentalDays = scanner.nextInt();
        
        // Using parameterized constructor
        CarRental rental1 = new CarRental(customerName, carModel, rentalDays);
        rental1.displayDetails();
        
        // Using default constructor
        CarRental rental2 = new CarRental();
        rental2.displayDetails();
        
        scanner.close();
    }
}

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private final double RATE_PER_DAY = 50.0;
    
    // Default constructor
    public CarRental() {
        this.customerName = "Unknown Customer";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }
    
    // Parameterized constructor
    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }
    
    public double calculateTotalCost() {
        return rentalDays * RATE_PER_DAY;
    }
    
    public void displayDetails() {
        System.out.println("Car Rental Details:");
        System.out.println("Customer Name: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Rental Days: " + rentalDays);
        System.out.printf("Total Cost: $%.2f\n", calculateTotalCost());
        System.out.println();
    }
}
