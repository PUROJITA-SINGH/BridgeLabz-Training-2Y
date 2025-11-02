import java.util.ArrayList;
import java.util.Collections;

public class PriceAnalysis {
    public static void main(String[] args) {
        double[] prices = {10.5, 20.0, 35.75, 5.5};
        ArrayList<Double> list = new ArrayList<>();

        for (double p : prices) {
            list.add(p); // Auto-boxing
        }

        double max = Collections.max(list);
        double avg = list.stream().mapToDouble(Double::doubleValue).average().orElse(0);

        System.out.println("Highest price: $" + max);
        System.out.printf("Average price: $%.2f\n", avg);
    }
}
