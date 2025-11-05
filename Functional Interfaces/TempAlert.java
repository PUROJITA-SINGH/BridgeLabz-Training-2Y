import java.util.function.Predicate;

public class TempAlert {
    public static void main(String[] args) {
        Predicate<Double> isHot = temp -> temp > 40.0;
        double currentTemp = 42.5;
        if (isHot.test(currentTemp))
            System.out.println("Alert! High temperature: " + currentTemp);
    }
}
