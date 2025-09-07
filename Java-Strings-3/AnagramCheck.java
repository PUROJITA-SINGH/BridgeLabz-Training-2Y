import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String text1 = scanner.nextLine();
        String text2 = scanner.nextLine();
        
        boolean areAnagrams = checkAnagrams(text1, text2);
        
        System.out.println("Are anagrams: " + areAnagrams);
        scanner.close();
    }

    public static boolean checkAnagrams(String text1, String text2) {
        if (text1.length() != text2.length()) return false;
        
        int[] frequency = new int[256];
        for (int i = 0; i < text1.length(); i++) {
            frequency[text1.charAt(i)]++;
            frequency[text2.charAt(i)]--;
        }
        
        for (int freq : frequency) {
            if (freq != 0) return false;
        }
        return true;
    }
}
