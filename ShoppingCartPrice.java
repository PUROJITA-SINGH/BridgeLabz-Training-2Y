import java.util.ArrayList;

public class ShoppingCartPrice {
    public static void main(String[] args) {
        String[] prices = {"250", "499", "99", "abc", "150"};

        ArrayList<Integer> validPrices = new ArrayList<>();
        int total = 0;

        for (String p : prices) {
            try {
                int price = Integer.parseInt(p);
                validPrices.add(price);
                total += price;
            } catch (NumberFormatException e) {
                System.out.println("Invalid price skipped: " + p);
            }
        }

        System.out.println("Valid prices: " + validPrices);
        System.out.println("Total price: $" + total);
    }
}
