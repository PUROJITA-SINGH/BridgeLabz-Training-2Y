import java.util.Scanner;

public class SubstringCompare {
    // Method to create substring using charAt()
    public static String createSubstringCharAt(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            return "";
        }
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
        }
        return result.toString();
    }

    // Method to compare two strings using charAt()
    public static boolean compareStringsCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.println("Enter the string: ");
        String str = scanner.next();
        System.out.println("Enter start index: ");
        int start = scanner.nextInt();
        System.out.println("Enter end index: ");
        int end = scanner.nextInt();

        // Create substring using charAt()
        String charAtSubstring = createSubstringCharAt(str, start, end);
        // Create substring using built-in substring()
        String builtInSubstring = str.substring(start, end);

        // Compare the two substrings
        boolean areEqual = compareStringsCharAt(charAtSubstring, builtInSubstring);

        // Display results
        System.out.println("Substring using charAt(): " + charAtSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Are the substrings equal? " + areEqual);

        scanner.close();
    }
}
