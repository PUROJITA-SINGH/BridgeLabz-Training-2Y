import java.util.Scanner;

public class SmallestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        String result = (number1 <= number2 && number1 <= number3) ? "Yes" : "No";
        System.out.println("Is the first number the smallest? " + result);
        scanner.close();
    }
}
