import java.util.*;

class Employee {
    String name, department;
    Employee(String n, String d) {
        name = n;
        department = d;
    }
}

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Alice", "HR"),
                new Employee("Bob", "IT"),
                new Employee("Carol", "HR")
        );

        Map<String, List<String>> deptMap = new HashMap<>();

        for (Employee e : employees) {
            deptMap.computeIfAbsent(e.department, k -> new ArrayList<>()).add(e.name);
        }

        System.out.println(deptMap);
    }
}
