import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a date (yyyy-MM-dd):");
        String dateInput = scanner.nextLine();
        
        // Parse input date
        LocalDate date = LocalDate.parse(dateInput);
        
        // Perform date arithmetic
        LocalDate result = date.plusDays(7)
                              .plusMonths(1)
                              .plusYears(2)
                              .minusWeeks(3);
        
        // Display results
        System.out.println("Original Date: " + date);
        System.out.println("After adding 7 days, 1 month, 2 years, and subtracting 3 weeks: " + result);
        scanner.close();
    }
}
