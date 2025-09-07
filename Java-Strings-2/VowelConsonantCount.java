import java.util.Scanner;

public class VowelConsonantCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        int[] counts = countVowelsAndConsonants(text);
        
        System.out.println("Vowel Count: " + counts[0]);
        System.out.println("Consonant Count: " + counts[1]);
        scanner.close();
    }

    public static String checkVowelOrConsonant(char c) {
        c = (c >= 'A' && c <= 'Z') ? (char) (c + 32) : c; // Convert to lowercase
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') return "Vowel";
        if (c >= 'a' && c <= 'z') return "Consonant";
        return "Not a Letter";
    }

    public static int[] countVowelsAndConsonants(String text) {
        int vowelCount = 0, consonantCount = 0;
        for (int i = 0; i < text.length(); i++) {
            String result = checkVowelOrConsonant(text.charAt(i));
            if (result.equals("Vowel")) vowelCount++;
            else if (result.equals("Consonant")) consonantCount++;
        }
        return new int[]{vowelCount, consonantCount};
    }
}
