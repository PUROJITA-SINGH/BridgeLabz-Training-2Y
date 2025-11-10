import java.util.*;

public class CountryCapital {
    public static void main(String[] args) {
        Map<String, String> capitals = new TreeMap<>();

        capitals.put("India", "New Delhi");
        capitals.put("France", "Paris");
        capitals.put("Japan", "Tokyo");
        capitals.put("USA", "Washington DC");
        capitals.put("Germany", "Berlin");
        capitals.put("Italy", "Rome");
        capitals.put("Brazil", "Brasilia");
        capitals.put("Canada", "Ottawa");

        String country = "Japan";
        System.out.println("Capital of " + country + ": " +
                capitals.getOrDefault(country, "Unknown country"));

        System.out.println("\nAll countries:");
        for (Map.Entry<String, String> e : capitals.entrySet()) {
            System.out.println(e.getKey() + " → " + e.getValue());
        }
    }
}
