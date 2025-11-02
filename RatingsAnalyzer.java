import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Collectors;

public class RatingsAnalyzer {
    public static void main(String[] args) {
        int[] oldRatings = {4, 5, 3};
        ArrayList<Integer> newRatings = new ArrayList<>();
        newRatings.add(5); newRatings.add(null); newRatings.add(2);

        ArrayList<Integer> all = new ArrayList<>();
        for (int r : oldRatings) all.add(r);
        all.addAll(newRatings);

        var valid = all.stream()
                       .filter(Objects::nonNull)
                       .collect(Collectors.toList());

        double avg = valid.stream().mapToInt(Integer::intValue).average().orElse(0);

        System.out.println("Valid ratings: " + valid);
        System.out.printf("Average rating: %.2f\n", avg);
    }
}
