import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month (1-12), day, and year: ");
        int m = scanner.nextInt();
        int d = scanner.nextInt();
        int y = scanner.nextInt();
        if (y < 1582 || m < 1 || m > 12 || d < 1 || d > 31) {
            System.out.println("Invalid date");
            return;
        }
        if (m == 1 || m == 2) {
            m += 12;
            y -= 1;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (d + ((13 * (m + 1)) / 5) + k + (k / 4) + (j / 4) + (5 * j)) % 7;
        int dayOfWeek = ((h + 5) % 7);
        System.out.println("Day of the week: " + dayOfWeek);
        scanner.close();
    }
}
