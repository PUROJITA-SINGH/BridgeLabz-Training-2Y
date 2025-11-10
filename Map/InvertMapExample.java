import java.util.*;

public class InvertMapExample {
    public static void main(String[] args) {
        Map<String, Integer> original = new HashMap<>();
        original.put("A", 1);
        original.put("B", 2);
        original.put("C", 1);

        Map<Integer, List<String>> inverted = new HashMap<>();

        for (Map.Entry<String, Integer> e : original.entrySet()) {
            inverted.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
        }

        System.out.println(inverted);
    }
}
