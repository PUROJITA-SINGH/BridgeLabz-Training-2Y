import java.util.Scanner;
import java.util.ArrayList;

public class ShortestLongestStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        String[] words = splitTextCharAt(text);
        String[][] wordLengths = getWordLengths(words);
        String[] shortestLongest = findShortestAndLongest(wordLengths);
        
        System.out.println("Shortest string: " + shortestLongest[0]);
        System.out.println("Longest string: " + shortestLongest[1]);
        scanner.close();
    }

    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static String[] splitTextCharAt(String text) {
        ArrayList<Integer> spaceIndices = new ArrayList<>();
        spaceIndices.add(-1);
        for (int i = 0; i < findStringLength(text); i++) {
            if (text.charAt(i) == ' ') spaceIndices.add(i);
        }
        spaceIndices.add(findStringLength(text));
        
        String[] words = new String[spaceIndices.size() - 1];
        for (int i = 0; i < words.length; i++) {
            int start = spaceIndices.get(i) + 1;
            int end = spaceIndices.get(i + 1);
            StringBuilder word = new StringBuilder();
            for (int j = start; j < end; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }
        return words;
    }

    public static String[][] getWordLengths(String[] words) {
        String[][] wordLengths = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengths[i][0] = words[i];
            wordLengths[i][1] = String.valueOf(findStringLength(words[i]));
        }
        return wordLengths;
    }

    public static String[] findShortestAndLongest(String[][] wordLengths) {
        String shortest = wordLengths[0][0], longest = wordLengths[0][0];
        int minLength = Integer.parseInt(wordLengths[0][1]);
        int maxLength = minLength;
        
        for (int i = 1; i < wordLengths.length; i++) {
            int length = Integer.parseInt(wordLengths[i][1]);
            if (length < minLength) {
                minLength = length;
                shortest = wordLengths[i][0];
            }
            if (length > maxLength) {
                maxLength = length;
                longest = wordLengths[i][0];
            }
        }
        return new String[]{shortest, longest};
    }
}
