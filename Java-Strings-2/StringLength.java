import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.next();
        
        int userLength = findStringLength(str);
        int builtInLength = str.length();
        
        System.out.println("User-defined length: " + userLength);
        System.out.println("Built-in length(): " + builtInLength);
        System.out.println("Lengths match: " + (userLength == builtInLength));
        scanner.close();
    }

    public static int findStringLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}
