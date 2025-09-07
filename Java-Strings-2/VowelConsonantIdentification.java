import java.util.Scanner;

public class VowelConsonantIdentification {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        String[][] charTypes = getCharacterTypes(text);
        displayCharacterTypes(charTypes);
        scanner.close();
    }

    public static String checkVowelOrConsonant(char c) {
        c = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c; // Convert to lowercase
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
        if (c >= 'a' && c <= 'z') return "Consonant";
        return "Not a Letter";
    }

    public static String[][] getCharacterTypes(String text) {
        String[][] charTypes = new String[text.length()][2];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            charTypes[i][0] = String.valueOf(c);
            charTypes[i][1] = checkVowelOrConsonant(c);
        }
        return charTypes;
    }

    public static void displayCharacterTypes(String[][] charTypes) {
        System.out.println("Character\tType");
        for (String[] ct : charTypes) {
            System.out.println(ct[0] + "\t\t" + ct[1]);
        }
    }
}
