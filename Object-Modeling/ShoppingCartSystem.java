import java.util.Scanner;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product name, ID, price, and quantity:");
        String productName = scanner.nextLine();
        String productID = scanner.nextLine();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        
        Product.updateDiscount(10.0); // Set 10% discount
        Product product = new Product(productName, productID, price, quantity);
        if (product instanceof Product) {
            product.displayDetails();
        }
        scanner.close();
    }
}

class Product {
    private static double discount = 0.0;
    private final String productID;
    private String productName;
    private double price;
    private int quantity;
    
    public Product(String productName, String productID, double price, int quantity) {
        this.productName = productName;
        this.productID = productID;
        this.price = price;
        this.quantity = quantity;
    }
    
    public static void updateDiscount(double newDiscount) {
        discount = newDiscount;
        System.out.printf("Discount updated to %.2f%%\n", discount);
    }
    
    public void displayDetails() {
        double totalCost = price * quantity * (1 - discount / 100);
        System.out.println("Product Details:");
        System.out.println("Name: " + productName);
        System.out.println("ID: " + productID);
        System.out.printf("Price: $%.2f\n", price);
        System.out.println("Quantity: " + quantity);
        System.out.printf("Total Cost (after %.2f%% discount): $%.2f\n", discount, totalCost);
    }
}
