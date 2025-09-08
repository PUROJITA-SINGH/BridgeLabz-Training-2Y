import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        boolean areAnagrams = areAnagrams(str1, str2);
        
        System.out.println("Are Anagrams: " + areAnagrams);
        scanner.close();
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        
        int[] frequency = new int[256];
        for (int i = 0; i < str1.length(); i++) {
            frequency[str1.charAt(i)]++;
            frequency[str2.charAt(i)]--;
        }
        
        for (int freq : frequency) {
            if (freq != 0) return false;
        }
        return true;
    }
}
