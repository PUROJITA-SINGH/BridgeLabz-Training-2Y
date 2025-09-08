import java.util.Scanner;

public class LexicographicalCompare {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two strings:");
        String str1 = scanner.nextLine();
        String str2 = scanner.nextLine();
        
        String result = compareLexicographically(str1, str2);
        
        System.out.println(result);
        scanner.close();
    }

    public static String compareLexicographically(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) < str2.charAt(i)) {
                return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
            } else if (str1.charAt(i) > str2.charAt(i)) {
                return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
            }
        }
        if (str1.length() < str2.length()) {
            return "\"" + str1 + "\" comes before \"" + str2 + "\" in lexicographical order";
        } else if (str1.length() > str2.length()) {
            return "\"" + str2 + "\" comes before \"" + str1 + "\" in lexicographical order";
        }
        return "\"" + str1 + "\" and \"" + str2 + "\" are equal";
    }
}
