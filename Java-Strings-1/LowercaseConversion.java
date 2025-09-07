import java.util.Scanner;

public class LowercaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        String userLowercase = toLowercaseCharAt(text);
        String builtInLowercase = text.toLowerCase();
        
        boolean areEqual = compareStringsCharAt(userLowercase, builtInLowercase);
        
        System.out.println("User-defined lowercase: " + userLowercase);
        System.out.println("Built-in toLowerCase(): " + builtInLowercase);
        System.out.println("Strings are equal: " + areEqual);
        scanner.close();
    }

    public static String toLowercaseCharAt(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32)); // Convert uppercase to lowercase (ASCII difference)
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static boolean compareStringsCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) return false;
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) return false;
        }
        return true;
    }
}
