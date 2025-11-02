public class GameScoreboard {
    public static void main(String[] args) {
        Integer[] scores = {100, null, 250, null, 175};

        int nullCount = 0;
        int total = 0;

        for (Integer s : scores) {
            if (s == null) nullCount++;
            else total += s; // Auto-unboxing
        }

        System.out.println("Players not played: " + nullCount);
        System.out.println("Total valid score: " + total);
    }
}
