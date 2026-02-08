package payment;

public class PayPalPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("PayPal payment: " + amount);
    }
}
