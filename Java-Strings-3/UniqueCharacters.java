import java.util.Scanner;
import java.util.ArrayList;

public class UniqueCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        char[] uniqueChars = findUniqueCharacters(text);
        
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) System.out.print(c + " ");
        System.out.println();
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
}
