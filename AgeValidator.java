import java.util.Scanner;

public class AgeValidator {
    public static boolean isValidAdult(String input) {
        try {
            int age = Integer.parseInt(input);
            return age >= 18;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        String input = sc.nextLine();

        if (isValidAdult(input)) {
            System.out.println("User is 18 or older. Access granted.");
        } else {
            System.out.println("Invalid or underage. Access denied.");
        }
        sc.close();
    }
}
