interface PaymentProcessor {
    void processPayment(double amount);
    default void refund(double amount) {
        System.out.println("Refund of ₹" + amount + " initiated.");
    }
}

class PayPal implements PaymentProcessor {
    public void processPayment(double amount) {
        System.out.println("Paid ₹" + amount + " via PayPal");
    }
}

public class PaymentProcessorDemo {
    public static void main(String[] args) {
        PayPal payPal = new PayPal();
        payPal.processPayment(2000);
        payPal.refund(2000);
    }
}
