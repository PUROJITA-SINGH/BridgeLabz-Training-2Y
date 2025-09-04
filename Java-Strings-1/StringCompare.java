import java.util.Scanner;

public class StringCompare {
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

        // Taking user input for two strings
        System.out.println("Enter the first string: ");
        String str1 = scanner.next();
        System.out.println("Enter the second string: ");
        String str2 = scanner.next();

        // Compare using charAt() method
        boolean charAtResult = compareStringsCharAt(str1, str2);
        // Compare using built-in equals() method
        boolean equalsResult = str1.equals(str2);

        // Display results
        System.out.println("Comparison using charAt(): " + charAtResult);
        System.out.println("Comparison using equals(): " + equalsResult);
        System.out.println("Do both methods give the same result? " + (charAtResult == equalsResult));

        scanner.close();
    }
}
