package payment;

public class CreditCardPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Credit card payment: " + amount);
    }
}
