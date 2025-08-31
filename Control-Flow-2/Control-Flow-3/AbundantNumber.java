import java.util.Scanner;

public class AbundantNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        String result = (sum > number && number > 0) ? "Abundant Number" : "Not an Abundant Number";
        System.out.println(number + " is " + result);
        scanner.close();
    }
}
