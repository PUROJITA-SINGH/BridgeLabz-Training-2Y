import java.util.function.Function;

public class StringCheck {
    public static void main(String[] args) {
        Function<String, Integer> lengthChecker = msg -> msg.length();
        String message = "Hello World!";
        System.out.println("Message length: " + lengthChecker.apply(message));
    }
}
