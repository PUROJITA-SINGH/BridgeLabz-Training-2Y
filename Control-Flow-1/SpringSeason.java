import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month and day: ");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        boolean isSpring = (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
        System.out.println(isSpring ? "Its a Spring Season" : "Not a Spring Season");
        scanner.close();
    }
}
