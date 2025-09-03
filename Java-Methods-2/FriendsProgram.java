import java.util.Scanner;

public class FriendsProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];
        
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age for " + names[i] + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height (in cm) for " + names[i] + ": ");
            heights[i] = scanner.nextDouble();
        }
        
        String youngest = findYoungest(ages, names);
        System.out.println("Youngest friend: " + youngest);
        
        String tallest = findTallest(heights, names);
        System.out.println("Tallest friend: " + tallest);
        
        scanner.close();
    }
    
    public static String findYoungest(int[] ages, String[] names) {
        int minAge = Integer.MAX_VALUE;
        String youngest = "";
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }
    
    public static String findTallest(double[] heights, String[] names) {
        double maxHeight = Double.MIN_VALUE;
        String tallest = "";
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }
}
