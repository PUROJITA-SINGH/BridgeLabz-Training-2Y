import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first date (yyyy-MM-dd):");
        String date1Input = scanner.nextLine();
        System.out.println("Enter second date (yyyy-MM-dd):");
        String date2Input = scanner.nextLine();
        
        // Parse input dates
        LocalDate date1 = LocalDate.parse(date1Input);
        LocalDate date2 = LocalDate.parse(date2Input);
        
        // Compare dates
        if (date1.isBefore(date2)) {
            System.out.println(date1 + " is before " + date2);
        } else if (date1.isAfter(date2)) {
            System.out.println(date1 + " is after " + date2);
        } else if (date1.isEqual(date2)) {
            System.out.println(date1 + " is the same as " + date2);
        }
        scanner.close();
    }
}
