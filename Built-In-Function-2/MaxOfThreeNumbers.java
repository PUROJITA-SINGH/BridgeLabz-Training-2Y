import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = getInput(scanner);
        int max = findMax(numbers);
        displayResult(numbers, max);
        scanner.close();
    }

    public static int[] getInput(Scanner scanner) {
        System.out.println("Enter three integers:");
        int[] numbers = new int[3];
        for (int i = 0; i < 3; i++) {
            numbers[i] = scanner.nextInt();
        }
        return numbers;
    }

    public static int findMax(int[] numbers) {
        int max = numbers[0];
        if (numbers[1] > max) max = numbers[1];
        if (numbers[2] > max) max = numbers[2];
        return max;
    }

    public static void displayResult(int[] numbers, int max) {
        System.out.println("Numbers: " + numbers[0] + ", " + numbers[1] + ", " + numbers[2]);
        System.out.println("Maximum: " + max);
    }
}
