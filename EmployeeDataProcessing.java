import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeDataProcessing {
    public static void main(String[] args) {
        // Step 1: Simulate data from a file - array of primitive int ages
        int[] employeeAgesPrimitive = {25, 34, 22, 45, 38, 29, 41, 27};

        // Step 2: Convert int[] to ArrayList<Integer> using wrapper class (auto-boxing)
        List<Integer> employeeAges = new ArrayList<>();
        for (int age : employeeAgesPrimitive) {
            employeeAges.add(age);  // Auto-boxing: int → Integer
        }

        // Step 3: Find youngest and oldest using Collections.min() and max()
        if (employeeAges.isEmpty()) {
            System.out.println("No employee data available.");
            return;
        }

        int youngest = Collections.min(employeeAges);  // Auto-unboxing inside min()
        int oldest = Collections.max(employeeAges);    // Auto-unboxing inside max()

        // Step 4: Display results
        System.out.println("Employee Ages (Wrapper Objects): " + employeeAges);
        System.out.println("Youngest Employee Age: " + youngest);
        System.out.println("Oldest Employee Age: " + oldest);
    }
}
