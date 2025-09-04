public class NumberChecker5 {
    public static void main(String[] args) {
        int number = 6; // Sample perfect
        
        System.out.println("Is Perfect: " + isPerfect(number));
        System.out.println("Is Abundant: " + isAbundant(number));
        System.out.println("Is Deficient: " + isDeficient(number));
        System.out.println("Is Strong: " + isStrong(number));
    }
    
    public static boolean isPerfect(int number) {
        int sum = sumProperDivisors(number);
        return sum == number;
    }
    
    public static boolean isAbundant(int number) {
        int sum = sumProperDivisors(number);
        return sum > number;
    }
    
    public static boolean isDeficient(int number) {
        int sum = sumProperDivisors(number);
        return sum < number;
    }
    
    public static int sumProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    
    public static boolean isStrong(int number) {
        int sum = 0;
        int temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }
    
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }
}
