import java.util.ArrayList;
import java.util.List;

public class FactorsProgram {
    public static void main(String[] args) {
        int number = 12; // Sample
        
        int[] factors = findFactors(number);
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        
        System.out.println("Greatest factor: " + greatestFactor(factors));
        System.out.println("Sum of factors: " + sumFactors(factors));
        System.out.println("Product of factors: " + productFactors(factors));
        System.out.println("Product of cubes: " + productCubes(factors));
    }
    
    public static int[] findFactors(int number) {
        List<Integer> factorList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorList.add(i);
            }
        }
        int[] factors = new int[factorList.size()];
        for (int i = 0; i < factorList.size(); i++) {
            factors[i] = factorList.get(i);
        }
        return factors;
    }
    
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1];
    }
    
    public static int sumFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }
    
    public static long productFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }
    
    public static long productCubes(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }
}
