import java.util.*;

public class WordFrequencyInSentence {
    public static void main(String[] args) {
        String sentence = "Java is fun and Java is powerful";
        sentence = sentence.toLowerCase().replaceAll("[^a-z ]", "");

        Map<String, Integer> wordCount = new HashMap<>();
        for (String w : sentence.split(" ")) {
            wordCount.put(w, wordCount.getOrDefault(w, 0) + 1);
        }

        System.out.println(wordCount);
    }
}
