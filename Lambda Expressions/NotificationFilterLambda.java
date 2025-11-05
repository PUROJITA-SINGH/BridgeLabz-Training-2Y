import java.util.*;
import java.util.function.Predicate;

public class NotificationFilterLambda {
    public static void main(String[] args) {
        List<String> alerts = Arrays.asList("Critical: Heart rate", "Info: Appointment", "Warning: Low battery");

        Predicate<String> criticalFilter = msg -> msg.startsWith("Critical");
        Predicate<String> warningFilter = msg -> msg.startsWith("Warning");

        System.out.println("Showing only Critical Alerts:");
        alerts.stream().filter(criticalFilter).forEach(System.out::println);

        System.out.println("\nShowing only Warning Alerts:");
        alerts.stream().filter(warningFilter).forEach(System.out::println);
    }
}
