import java.util.Scanner;

public class SmallestLargest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int[] minMax = findSmallestAndLargest(num1, num2, num3);
        System.out.println("Smallest: " + minMax[0] + ", Largest: " + minMax[1]);
        scanner.close();
    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(Math.min(number1, number2), number3);
        int largest = Math.max(Math.max(number1, number2), number3);
        return new int[]{smallest, largest};
    }
}
