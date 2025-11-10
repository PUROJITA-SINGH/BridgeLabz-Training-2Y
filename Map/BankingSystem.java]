import java.util.*;

public class BankingSystem {
    public static void main(String[] args) {
        Map<String, Double> accounts = new HashMap<>();

        accounts.put("ACC101", 25000.0);
        accounts.put("ACC102", 42000.0);
        accounts.put("ACC103", 15000.0);
        accounts.put("ACC104", 50000.0);

        // Deposit
        accounts.put("ACC101", accounts.get("ACC101") + 5000);

        // Withdraw (with check)
        double withdraw = 10000;
        if (accounts.get("ACC103") >= withdraw)
            accounts.put("ACC103", accounts.get("ACC103") - withdraw);
        else
            System.out.println("Insufficient balance for ACC103");

        // Sort by descending balance
        accounts.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));

        // Top 3 customers
        System.out.println("\nTop 3 customers:");
        accounts.entrySet().stream()
                .sorted((a, b) -> b.getValue().compareTo(a.getValue()))
                .limit(3)
                .forEach(e -> System.out.println(e.getKey() + " → " + e.getValue()));
    }
}
