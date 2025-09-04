import java.util.Arrays;
import java.util.Random;

public class FootballTeam {

    public static void main(String[] args) {
        int[] heights = generateHeights();

        int sum = calculateSum(heights);
        double mean = calculateMean(heights);
        int shortest = findShortest(heights);
        int tallest = findTallest(heights);

        System.out.println("Football Team Player Heights:");
        System.out.println(Arrays.toString(heights));
        System.out.println("Sum of heights: " + sum + " cm");
        System.out.printf("Mean height: %.2f cm%n", mean);
        System.out.println("Shortest player height: " + shortest + " cm");
        System.out.println("Tallest player height: " + tallest + " cm");
    }

     public static int[] generateHeights() {
        Random random = new Random();
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // Random height between 150 and 250 cm
        }
        return heights;
    }

     public static int calculateSum(int[] arr) {
        int sum = 0;
        for (int height : arr) {
            sum += height;
        }
        return sum;
    }

 
    public static double calculateMean(int[] arr) {
        return (double) calculateSum(arr) / arr.length;
    }

 
    public static int findShortest(int[] arr) {
        int shortest = Integer.MAX_VALUE;
        for (int height : arr) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

 
    public static int findTallest(int[] arr) {
        int tallest = Integer.MIN_VALUE;
        for (int height : arr) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
