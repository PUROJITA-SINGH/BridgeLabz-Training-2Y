import java.util.Scanner;

public class DynamicArraySum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;
        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            double input = scanner.nextDouble();
            if (input <= 0 || index >= 10) {
                break;
            }
            numbers[index] = input;
            index++;
        }
        System.out.println("Entered numbers:");
        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }
        System.out.println("Total sum: " + total);
        scanner.close();
    }
}
