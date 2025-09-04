import java.util.Scanner;

public class CalendarProgram {
    private static final String[] MONTH_NAMES = {
        "", "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };
    
    private static final int[] DAYS_IN_MONTH = {
        0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();
        System.out.print("Enter year: ");
        int year = scanner.nextInt();
        
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        
        int days = getDaysInMonth(month, year);
        int firstDay = getFirstDayOfMonth(month, year);
        
        // Print leading spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }
        
        // Print days
        for (int day = 1; day <= days; day++) {
            System.out.printf("%3d ", day);
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println();
    }
    
    public static String getMonthName(int month) {
        return MONTH_NAMES[month];
    }
    
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month];
    }
    
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    
    public static int getFirstDayOfMonth(int month, int year) {
        // Zeller's Congruence for Gregorian calendar
        if (month < 3) {
            month += 12;
            year--;
        }
        int k = year % 100;
        int j = year / 100;
        int day = (1 + ((month + 1) * 26 / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        return (day + 5) % 7; // Adjust for Sun=0
    }
}
