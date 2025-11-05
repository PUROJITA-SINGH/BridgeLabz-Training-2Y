import static java.lang.Math.*;  // to use pow()

class InterestCalculator {
    public double calculateSimpleInterest(double P, double R, double T) {
        return (P * R * T) / 100;
    }
    public double calculateCompoundInterest(double P, double R, double T) {
        return P * (pow((1 + R / 100), T)) - P;
    }
}

public class BankingStaticImport {
    public static void main(String[] args) {
        InterestCalculator calc = new InterestCalculator();

        double si = calc.calculateSimpleInterest(10000, 5, 2);
        double ci = calc.calculateCompoundInterest(10000, 5, 2);

        System.out.println("Simple Interest: " + si);
        System.out.println("Compound Interest: " + ci);
        System.out.println("\n(Static import used for Math.pow)");
    }
}
