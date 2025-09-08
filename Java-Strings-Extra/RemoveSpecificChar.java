import java.util.Scanner;

public class RemoveSpecificChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        System.out.println("Enter character to remove:");
        char ch = scanner.nextLine().charAt(0);
        
        String result = removeCharacter(input, ch);
        
        System.out.println("Modified String: " + result);
        scanner.close();
    }

    public static String removeCharacter(String str, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}
