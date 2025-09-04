
public class NumberChecker2 {
    public static void main(String[] args) {
        int number = 21; // Sample for Harshad
        
        int digitCount = countDigits(number);
        System.out.println("Digit count: " + digitCount);
        
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        int sumDigits = sumDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);
        
        int sumSquares = sumSquares(digits);
        System.out.println("Sum of squares: " + sumSquares);
        
        System.out.println("Is Harshad number: " + isHarshadNumber(number, sumDigits));
        
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1]);
            }
        }
    }
    
    public static int countDigits(int number) {
        if (number == 0) return 1;
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }
    
    public static int[] storeDigits(int number) {
        int digitCount = countDigits(number);
        int[] digits = new int[digitCount];
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }
    
    public static int sumDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }
    
    public static int sumSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }
    
    public static boolean isHarshadNumber(int number, int sumDigits) {
        return number % sumDigits == 0;
    }
    
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }
}
