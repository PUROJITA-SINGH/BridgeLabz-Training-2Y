import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }
        for (int num : numbers) {
            if (num > 0) {
                String type = (num % 2 == 0) ? "even" : "odd";
                System.out.println(num + " is positive and " + type);
            } else if (num < 0) {
                System.out.println(num + " is negative");
            } else {
                System.out.println(num + " is zero");
            }
        }
        String comparison = numbers[0] == numbers[4] ? "equal" : numbers[0] > numbers[4] ? "greater" : "less";
        System.out.println("First element (" + numbers[0] + ") is " + comparison + " than last element (" + numbers[4] + ")");
        scanner.close();
    }
}
