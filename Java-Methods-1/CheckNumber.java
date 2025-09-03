import java.util.Scanner;

public class CheckNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        int result = checkNumber(number);
        System.out.println("Result (1 for positive, -1 for negative, 0 for zero): " + result);
        scanner.close();
    }

    public static int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }
}
