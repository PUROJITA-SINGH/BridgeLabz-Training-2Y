import java.util.Scanner;

public class WordReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = scanner.nextLine();
        System.out.println("Enter word to replace:");
        String oldWord = scanner.nextLine();
        System.out.println("Enter new word:");
        String newWord = scanner.nextLine();
        
        String result = replaceWord(sentence, oldWord, newWord);
        
        System.out.println("Modified Sentence: " + result);
        scanner.close();
    }

    public static String replaceWord(String sentence, String oldWord, String newWord) {
        String[] words = sentence.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            if (word.equals(oldWord)) {
                sb.append(newWord);
            } else {
                sb.append(word);
            }
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}
