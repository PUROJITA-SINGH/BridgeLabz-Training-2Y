import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a positive integer: ");
        int number = scanner.nextInt();
        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                String type = (i % 2 == 0) ? "even" : "odd";
                System.out.println(i + " is " + type);
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }
        scanner.close();
    }
}
