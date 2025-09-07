import java.util.Scanner;
import java.util.ArrayList;

public class UniqueCharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] charFreq = findCharFrequency(text, uniqueChars);
        
        System.out.println("Character\tFrequency");
        for (String[] cf : charFreq) {
            if (cf[0] != null) {
                System.out.println(cf[0] + "\t\t" + cf[1]);
            }
        }
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

    public static char[] findUniqueCharacters(String text) {
        int len = findStringLength(text);
        char[] temp = new char[len];
        int uniqueCount = 0;
        
        for (int i = 0; i < len; i++) {
            boolean isUnique = true;
            for (int j = 0; j < uniqueCount; j++) {
                if (text.charAt(i) == temp[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) temp[uniqueCount++] = text.charAt(i);
        }
        
        char[] uniqueChars = new char[uniqueCount];
        for (int i = 0; i < uniqueCount; i++) {
            uniqueChars[i] = temp[i];
        }
        return uniqueChars;
    }

    public static String[][] findCharFrequency(String text, char[] uniqueChars) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        String[][] charFreq = new String[uniqueChars.length][2];
        for (int i = 0; i < uniqueChars.length; i++) {
            charFreq[i][0] = String.valueOf(uniqueChars[i]);
            charFreq[i][1] = String.valueOf(frequency[uniqueChars[i]]);
        }
        return charFreq;
    }
}
