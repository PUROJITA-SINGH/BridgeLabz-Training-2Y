import java.util.Scanner;

public class CharFrequencyNested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        String[] charFreq = findCharFrequencyNested(text);
        
        System.out.println("Character\tFrequency");
        for (String cf : charFreq) {
            if (cf != null) {
                String[] parts = cf.split(":");
                System.out.println(parts[0] + "\t\t" + parts[1]);
            }
        }
        scanner.close();
    }

    public static String[] findCharFrequencyNested(String text) {
        char[] chars = text.toCharArray();
        int[] frequency = new int[chars.length];
        String[] charFreq = new String[chars.length];
        int count = 0;
        
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') continue;
            frequency[i] = 1;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[j] == chars[i]) {
                    frequency[i]++;
                    chars[j] = '0';
                }
            }
            if (frequency[i] > 0) {
                charFreq[count++] = chars[i] + ":" + frequency[i];
            }
        }
        return charFreq;
    }
}
