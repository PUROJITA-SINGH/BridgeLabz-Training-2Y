import java.util.Scanner;

public class HarshadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        int temp = Math.abs(number);
        while (temp != 0) {
            sum += temp % 10;
            temp /= 10;
        }
        String result = (number % sum == 0 && number > 0) ? "Harshad Number" : "Not a Harshad Number";
        System.out.println(number + " is " + result);
        scanner.close();
    }
}

