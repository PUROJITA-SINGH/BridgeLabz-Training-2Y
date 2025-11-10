import java.util.*;

public class EmployeeDepartmentMapping {
    public static void main(String[] args) {
        // 1️⃣ Create HashMap: employeeId → department
        Map<Integer, String> empDept = new HashMap<>();

        // 2️⃣ Add employees
        empDept.put(101, "HR");
        empDept.put(102, "IT");
        empDept.put(103, "Finance");
        empDept.put(104, "IT");
        empDept.put(105, "HR");

        System.out.println("Initial Mapping: " + empDept);

        // 3️⃣ Change department of an employee (update)
        empDept.put(105, "Finance");
        System.out.println("After Update (Emp 105 moved to Finance): " + empDept);

        // 4️⃣ Find all employees in a given department
        String targetDept = "IT";
        System.out.print("Employees in " + targetDept + ": ");
        for (Map.Entry<Integer, String> e : empDept.entrySet()) {
            if (e.getValue().equals(targetDept)) {
                System.out.print(e.getKey() + " ");
            }
        }
        System.out.println();

        // 5️⃣ Group employees by department (reverse mapping)
        Map<String, List<Integer>> deptEmployees = new HashMap<>()
