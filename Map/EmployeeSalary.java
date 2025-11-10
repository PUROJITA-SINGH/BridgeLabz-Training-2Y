import java.util.*;

public class EmployeeSalary {
    public static void main(String[] args) {
        Map<String, Double> salaries = new HashMap<>();

        salaries.put("Aman", 50000.0);
        salaries.put("Riya", 60000.0);
        salaries.put("Karan", 55000.0);
        salaries.put("Sita", 70000.0);
        salaries.put("John", 48000.0);
        salaries.put("Meera", 72000.0);

        // Give raise
        String emp = "Riya";
        if (salaries.containsKey(emp)) {
            salaries.put(emp, salaries.get(emp) * 1.10);
        }

        // Average salary
        double avg = salaries.values().stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println("Average salary: " + avg);

        // Find highest-paid
        double max = Collections.max(salaries.values());
        System.out.println("Highest-paid employees:");
        for (Map.Entry<String, Double> e : salaries.entrySet())
            if (e.getValue() == max)
                System.out.println(e.getKey() + " → " + e.getValue());
    }
}
