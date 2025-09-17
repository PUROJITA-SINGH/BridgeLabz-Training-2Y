import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<CartItem> cart = new ArrayList<>();
        
        while (true) {
            System.out.println("\nChoose an option: 1. Add Item 2. Remove Item 3. Display Total 4. Exit");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Clear buffer
            
            if (choice == 4) break;
            
            switch (choice) {
                case 1:
                    System.out.println("Enter item name, price, and quantity:");
                    String name = scanner.nextLine();
                    double price = scanner.nextDouble();
                    int quantity = scanner.nextInt();
                    cart.add(new CartItem(name, price, quantity));
                    System.out.println("Item added to cart.");
                    break;
                case 2:
                    System.out.println("Enter item name to remove:");
                    String removeName = scanner.nextLine();
                    boolean removed = false;
                    for (int i = 0; i < cart.size(); i++) {
                        if (cart.get(i).getItemName().equals(removeName)) {
                            cart.remove(i);
                            System.out.println("Item removed from cart.");
                            removed = true;
                            break;
                        }
                    }
                    if (!removed) System.out.println("Item not found in cart.");
                    break;
                case 3:
                    double total = 0;
                    for (CartItem item : cart) {
                        total += item.calculateTotalCost();
                    }
                    System.out.printf("Total cost of cart: $%.2f\n", total);
                    break;
                default:
                    System.out.println("Invalid option!");
            }
        }
        scanner.close();
    }
}

class CartItem {
    private String itemName;
    private double price;
    private int quantity;
    
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
    
    public String getItemName() {
        return itemName;
    }
    
    public double calculateTotalCost() {
        return price * quantity;
    }
}
