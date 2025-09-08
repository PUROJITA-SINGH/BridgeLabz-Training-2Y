import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the main string:");
        String mainString = scanner.nextLine();
        System.out.println("Enter the substring:");
        String subString = scanner.nextLine();
        
        int count = countSubstringOccurrences(mainString, subString);
        
        System.out.println("Substring occurrences: " + count);
        scanner.close();
    }

    public static int countSubstringOccurrences(String mainString, String subString) {
        int count = 0, index = 0;
        while ((index = mainString.indexOf(subString, index)) != -1) {
            count++;
            index += 1;
        }
        return count;
    }
}
