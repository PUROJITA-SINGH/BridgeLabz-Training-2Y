public class NumberChecker3 {
    public static void main(String[] args) {
        int number = 121; // Sample palindrome
        
        int digitCount = countDigits(number);
        System.out.println("Digit count: " + digitCount);
        
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        int[] reversed = reverseDigits(digits);
        System.out.print("Reversed digits: ");
        for (int digit : reversed) {
            System.out.print(digit + " ");
        }
        System.out.println();
        
        System.out.println("Arrays equal (palindrome check): " + compareArrays(digits, reversed));
        System.out.println("Is palindrome: " + isPalindrome(digits));
        System.out.println("Is Duck number: " + isDuckNumber(digits));
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
    
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }
    
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) return false;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) return false;
        }
        return true;
    }
    
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }
    
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }
}
