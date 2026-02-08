package payment;

public class BankTransferPayment implements IPayment {
    public void processPayment(double amount) {
        System.out.println("Bank transfer payment: " + amount);
    }
}
