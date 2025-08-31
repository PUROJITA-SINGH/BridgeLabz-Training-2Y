import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three numbers: ");
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        String isFirstLargest = (number1 >= number2 && number1 >= number3) ? "Yes" : "No";
        String isSecondLargest = (number2 >= number1 && number2 >= number3) ? "Yes" : "No";
        String isThirdLargest = (number3 >= number1 && number3 >= number2) ? "Yes" : "No";
        System.out.println("Is the first number the largest? " + isFirstLargest);
        System.out.println("Is the second number the largest? " + isSecondLargest);
        System.out.println("Is the third number the largest? " + isThirdLargest);
        scanner.close();
    }
}
