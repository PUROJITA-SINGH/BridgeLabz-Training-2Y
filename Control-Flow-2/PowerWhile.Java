import java.util.Scanner;

public class PowerWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter base number and power: ");
        int number = scanner.nextInt();
        int power = scanner.nextInt();
        if (number >= 0 && power >= 0) {
            long result = 1;
            int counter = 0;
            while (counter < power) {
                result *= number;
                counter++;
            }
            System.out.println(number + " raised to the power " + power + " is " + result);
        } else {
            System.out.println("Please enter non-negative integers.");
        }
        scanner.close();
    }
}
