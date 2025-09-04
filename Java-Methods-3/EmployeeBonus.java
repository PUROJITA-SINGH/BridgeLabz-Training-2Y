import java.util.Random;

public class EmployeeBonus {
    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] updatedData = calculateBonusAndNewSalary(employeeData);
        displayTotals(employeeData, updatedData);
    }
    
    public static double[][] generateEmployeeData(int numEmployees) {
        Random random = new Random();
        double[][] data = new double[numEmployees][2]; // [salary, years]
        for (int i = 0; i < numEmployees; i++) {
            data[i][0] = random.nextInt(90000) + 10000; // 10000 to 99999
            data[i][1] = random.nextInt(20) + 1; // 1 to 20 years
        }
        return data;
    }
    
    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] updated = new double[employeeData.length][2]; // [newSalary, bonus]
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonusRate = (years > 5) ? 0.05 : 0.02;
            double bonus = salary * bonusRate;
            updated[i][0] = salary + bonus;
            updated[i][1] = bonus;
        }
        return updated;
    }
    
    public static void displayTotals(double[][] oldData, double[][] newData) {
        double oldSum = 0, newSum = 0, bonusSum = 0;
        for (int i = 0; i < oldData.length; i++) {
            oldSum += oldData[i][0];
            newSum += newData[i][0];
            bonusSum += newData[i][1];
        }
        System.out.println("Old Salary Sum\tNew Salary Sum\tTotal Bonus");
        System.out.printf("%.2f\t\t%.2f\t\t%.2f\n", oldSum, newSum, bonusSum);
    }
}
