import java.util.*;

public class VotingSystem {
    public static void main(String[] args) {
        Map<String, Integer> votes = new HashMap<>();
        String[] castVotes = {"Alice", "Bob", "Alice", "Charlie", "Alice", "Bob", "Charlie", "Charlie", "Bob", "Alice"};

        for (String v : castVotes) {
            votes.put(v, votes.getOrDefault(v, 0) + 1);
        }

        // Find winner
        String winner = null;
        int maxVotes = 0;
        for (Map.Entry<String, Integer> e : votes.entrySet()) {
            if (e.getValue() > maxVotes) {
                maxVotes = e.getValue();
                winner = e.getKey();
            }
        }

        System.out.println("Vote counts: " + votes);
        System.out.println("Winner: " + winner);
    }
}
