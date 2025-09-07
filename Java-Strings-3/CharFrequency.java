import java.util.Scanner;

public class CharFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.nextLine();
        
        String[][] charFreq = findCharFrequency(text);
        
        System.out.println("Character\tFrequency");
        for (String[] cf : charFreq) {
            if (cf[1] != null && Integer.parseInt(cf[1]) > 0) {
                System.out.println(cf[0] + "\t\t" + cf[1]);
            }
        }
        scanner.close();
    }

    public static String[][] findCharFrequency(String text) {
        int[] frequency = new int[256];
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }
        
        String[][] charFreq = new String[256][2];
        int count = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                charFreq[count][0] = String.valueOf((char) i);
                charFreq[count][1] = String.valueOf(frequency[i]);
                count++;
            }
        }
        return charFreq;
    }
}
