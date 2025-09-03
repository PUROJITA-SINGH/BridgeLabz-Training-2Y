import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter month and day:");
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        boolean isSpring = isSpringSeason(month, day);
        System.out.println(isSpring ? "It's a Spring Season" : "Not a Spring Season");
        scanner.close();
    }

    public static boolean isSpringSeason(int month, int day) {
        if (month == 3 && day >= 20 && day <= 31) return true;
        if (month >= 4 && month <= 5) return true;
        if (month == 6 && day <= 20) return true;
        return false;
    }
}
