import java.util.*;

public class EmployeeNameUppercase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Riya", "Arjun", "Meera");
        names.stream()
             .map(String::toUpperCase) // Method reference
             .forEach(System.out::println);
    }
}
