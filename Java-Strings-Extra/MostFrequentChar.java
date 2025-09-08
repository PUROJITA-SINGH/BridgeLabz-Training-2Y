import java.util.Scanner;

public class MostFrequentChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        
        char mostFrequent = findMostFrequentChar(input);
        
        System.out.println("Most Frequent Character: '" + mostFrequent + "'");
        scanner.close();
    }

    public static char findMostFrequentChar(String str) {
        int[] frequency = new int[256];
        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }
        
        char maxChar = str.charAt(0);
        int maxFreq = frequency[maxChar];
        for (int i = 1; i < str.length(); i++) {
            if (frequency[str.charAt(i)] > maxFreq) {
                maxChar = str.charAt(i);
                maxFreq = frequency[str.charAt(i)];
            }
        }
        return maxChar;
    }
}
