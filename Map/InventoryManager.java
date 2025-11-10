import java.util.*;

public class InventoryManager {
    public static void main(String[] args) {
        Map<String, Integer> stock = new HashMap<>();

        // Add products
        stock.put("Apple", 10);
        stock.put("Banana", 5);
        stock.put("Mango", 0);

        // Customer buys 3 apples
        stock.put("Apple", stock.get("Apple") - 3);

        // Shipment arrives
        stock.put("Banana", stock.get("Banana") + 10);

        // Remove out of stock
        stock.entrySet().removeIf(e -> e.getValue() <= 0);

        // Query
        String product = "Mango";
        if (stock.containsKey(product))
            System.out.println(product + " → " + stock.get(product));
        else
            System.out.println(product + " is not stocked.");

        // Print all out-of-stock items
        System.out.println("Current stock: " + stock);
    }
}
