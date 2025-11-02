import java.util.ArrayList;

public class StudentMarks {
    public static void main(String[] args) {
        Object[] inputs = {"85", 95, Integer.valueOf(88), "null", "abc"};

        ArrayList<Integer> valid = new ArrayList<>();

        for (Object o : inputs) {
            try {
                if (o instanceof String) {
                    String s = (String) o;
                    if ("null".equals(s)) continue;
                    valid.add(Integer.parseInt(s));
                } else if (o instanceof Integer) {
                    valid.add((Integer) o);
                }
            } catch (NumberFormatException e) {
                // ignore
            }
        }

        double avg = valid.stream().mapToInt(Integer::intValue).average().orElse(0);
        System.out.println("Valid marks: " + valid);
        System.out.printf("Average: %.2f\n", avg);
    }
}
