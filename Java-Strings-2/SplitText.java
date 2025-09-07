import java.util.Scanner;
import java.util.ArrayList;

public class SplitText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        String[] userWords = splitTextCharAt(text);
        String[] builtInWords = text.split("\\s+");
        
        boolean areEqual = compareStringArrays(userWords, builtInWords);
        
        System.out.print("User-defined split: ");
        for (String word : userWords) System.out.print(word + " ");
        System.out.print("\nBuilt-in split(): ");
        for (String word : builtInWords) System.out.print(word + " ");
        System.out.println("\nArrays are equal: " + areEqual);
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

    public static boolean compareStringArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) return false;
        }
        return true;
    }
}
