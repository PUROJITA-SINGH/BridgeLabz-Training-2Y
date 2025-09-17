import java.util.Scanner;

public class InventoryTracker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter item code, name, price, and quantity:");
        String itemCode = scanner.nextLine();
        String itemName = scanner.nextLine();
        double price = scanner.nextDouble();
        int quantity = scanner.nextInt();
        
        Item item = new Item(itemCode, itemName, price);
        item.displayDetails();
        item.calculateTotalCost(quantity);
        scanner.close();
    }
}

class Item {
    private String itemCode;
    private String itemName;
    private double price;
    
    public Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    
    public void displayDetails() {
        System.out.println("Item Details:");
        System.out.println("Code: " + itemCode);
        System.out.println("Name: " + itemName);
        System.out.println("Price: $" + String.format("%.2f", price));
    }
    
    public void calculateTotalCost(int quantity) {
        double totalCost = price * quantity;
        System.out.printf("Total cost for %d units: $%.2f\n", quantity, totalCost);
    }
}
