import java.util.Scanner;

public class YoungestTallest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Amar's age and height: ");
        int amarAge = scanner.nextInt();
        double amarHeight = scanner.nextDouble();
        System.out.println("Enter Akbar's age and height: ");
        int akbarAge = scanner.nextInt();
        double akbarHeight = scanner.nextDouble();
        System.out.println("Enter Anthony's age and height: ");
        int anthonyAge = scanner.nextInt();
        double anthonyHeight = scanner.nextDouble();
        
        // Find youngest
        String youngest = "Amar";
        int minAge = amarAge;
        if (akbarAge < minAge) {
            minAge = akbarAge;
            youngest = "Akbar";
        }
        if (anthonyAge < minAge) {
            minAge = anthonyAge;
            youngest = "Anthony";
        }
        
        // Find tallest
        String tallest = "Amar";
        double maxHeight = amarHeight;
        if (akbarHeight > maxHeight) {
            maxHeight = akbarHeight;
            tallest = "Akbar";
        }
        if (anthonyHeight > maxHeight) {
            maxHeight = anthonyHeight;
            tallest = "Anthony";
        }
        
        System.out.println("Youngest friend: " + youngest + " (Age: " + minAge + ")");
        System.out.println("Tallest friend: " + tallest + " (Height: " + maxHeight + ")");
        scanner.close();
    }
}
