import java.util.Scanner;

public class MobilePhoneDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter mobile phone brand, model, and price:");
        String brand = scanner.nextLine();
        String model = scanner.nextLine();
        double price = scanner.nextDouble();
        
        MobilePhone phone = new MobilePhone(brand, model, price);
        phone.displayDetails();
        scanner.close();
    }
}

class MobilePhone {
    private String brand;
    private String model;
    private double price;
    
    public MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }
    
    public void displayDetails() {
        System.out.println("Mobile Phone Details:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + String.format("%.2f", price));
    }
}
