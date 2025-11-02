import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ShoppingCartPriceCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> priceStrings = new ArrayList<>();

        System.out.println("=== E-Commerce Shopping Cart ===");
        System.out.println("Enter item prices (one per line). Type 'done' to finish:");

        // Read input until 'done'
        while (true) {
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("done")) {
                break;
            }
            if (!input.isEmpty()) {
                priceStrings.add(input);
            }
        }

        // Calculate total
        int totalPrice = calculateTotalPrice(priceStrings);
        System.out.println("\nTotal Price: Rs." + totalPrice);

        scanner.close();
    }

    /**
     * Converts a list of string prices to integers and returns the sum.
     * Handles invalid inputs gracefully using try-catch.
     */
    public static int calculateTotalPrice(List<String> prices) {
        int total = 0;
        int invalidCount = 0;

        System.out.println("\n--- Price Processing ---");
        for (String priceStr : prices) {
            try {
                // Use Integer.parseInt() to convert string to int
                int price = Integer.parseInt(priceStr);
                
                if (price < 0) {
                    System.out.println("Warning: '" + priceStr + "' is negative. Skipping.");
                    invalidCount++;
                } else {
                    total += price;
                    System.out.println("Valid: '" + priceStr + "' → " + price);
                }
            } catch (NumberFormatException e) {
                // Handle non-numeric input
                System.out.println("Error: '" + priceStr + "' is not a valid integer. Skipping.");
                invalidCount++;
            }
        }

        if (invalidCount > 0) {
            System.out.println("\nWarning: " + invalidCount + " invalid price(s) were ignored.");
        }

        return total;
    }
}
