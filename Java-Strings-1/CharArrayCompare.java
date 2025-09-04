import java.util.Scanner;

public class CharArrayCompare {
    // Method to return characters as an array using charAt()
    public static char[] getChars(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
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

        // Get characters using user-defined method
        char[] userDefinedChars = getChars(str);
        // Get characters using built-in toCharArray()
        char[] builtInChars = str.toCharArray();

        // Compare the two arrays
        boolean areEqual = compareCharArrays(userDefinedChars, builtInChars);

        // Display results
        System.out.println("Characters from user-defined method: " + new String(userDefinedChars));
        System.out.println("Characters from toCharArray(): " + new String(builtInChars));
        System.out.println("Are the arrays equal? " + areEqual);

        scanner.close();
    }
}
