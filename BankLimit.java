public class BankLimit {
    public static double getRemainingLimit(Double limitObj, double primitiveLimit) {
        Double limit = (limitObj != null) ? limitObj : primitiveLimit;
        return limit; // Auto-unboxing
    }

    public static void main(String[] args) {
        Double dbLimit = 500.0;
        double oldLimit = 300.0;

        System.out.println("Remaining (DB): $" + getRemainingLimit(dbLimit, 0));
        System.out.println("Remaining (Old): $" + getRemainingLimit(null, oldLimit));
    }
}
