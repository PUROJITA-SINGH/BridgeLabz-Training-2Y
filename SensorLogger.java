import java.util.ArrayList;

public class SensorLogger {
    static ArrayList<Double> logs = new ArrayList<>();

    public static void logReading(double primitive) {
        logs.add(primitive); // Auto-boxing
    }

    public static void logReading(Double wrapper) {
        logs.add(wrapper);
    }

    public static void main(String[] args) {
        logReading(98.6);           // primitive
        logReading(Double.valueOf(99.1)); // wrapper

        for (Double temp : logs) {
            System.out.println("Logged: " + temp); // Auto-unboxing in print
        }
    }
}
