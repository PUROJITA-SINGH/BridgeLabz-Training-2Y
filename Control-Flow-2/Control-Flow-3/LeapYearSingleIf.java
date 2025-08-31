import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year: ");
        int year = scanner.nextInt();
        String result = (year >= 1582 && (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))) 
                       ? "Leap Year" 
                       : (year < 1582 ? "Year must be >= 1582 (Gregorian calendar)" : "Not a Leap Year");
        System.out.println("The Year is " + result);
        scanner.close();
    }
}
