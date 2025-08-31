import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        String result;
        if (year < 1582) {
            result = "Year must be >= 1582 (Gregorian calendar)";
        } else if (year % 400 == 0) {
            result = "Leap Year";
        } else if (year % 100 == 0) {
            result = "Not a Leap Year";
        } else if (year % 4 == 0) {
            result = "Leap Year";
        } else {
            result = "Not a Leap Year";
        }
        System.out.println("The Year is " + result);
        scanner.close();
    }
}
