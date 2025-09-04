public class NumberChecker {
    public static void main(String[] args) {
        int number = 153; // Sample number
        
        int digitCount = countDigits(number);
        System.out.println("Digit count: " + digitCount);
        
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        System.out.println("Is Duck number: " + isDuckNumber(digits));
        System.out.println("Is Armstrong number: " + isArmstrongNumber(digits, digitCount));
        
        int largest = findLargest(digits);
        int secondLargest = findSecondLargest(digits, largest);
        System.out.println("Largest digit: " + largest);
        System.out.println("Second largest digit: " + secondLargest);
        
        int smallest = findSmallest(digits);
        int secondSmallest = findSecondSmallest(digits, smallest);
        System.out.println("Smallest digit: " + smallest);
        System.out.println("Second smallest digit: " + secondSmallest);
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
    
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean isArmstrongNumber(int[] digits, int digitCount) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digitCount);
        }
        int original = 0;
        for (int i = 0; i < digits.length; i++) {
            original = original * 10 + digits[i];
        }
        return sum == original;
    }
    
    public static int findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                largest = digit;
            }
        }
        return largest;
    }
    
    public static int findSecondLargest(int[] digits, int largest) {
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit < largest && digit > secondLargest) {
                secondLargest = digit;
            }
        }
        return secondLargest;
    }
    
    public static int findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                smallest = digit;
            }
        }
        return smallest;
    }
    
    public static int findSecondSmallest(int[] digits, int smallest) {
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit > smallest && digit < secondSmallest) {
                secondSmallest = digit;
            }
        }
        return secondSmallest;
    }
}
