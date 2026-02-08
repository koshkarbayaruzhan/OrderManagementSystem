package model;

import discount.DiscountCalculator;
import delivery.IDelivery;
import payment.IPayment;

import java.util.ArrayList;
import java.util.List;

public class Order {

    private final List<OrderItem> items = new ArrayList<>();
    private IPayment payment;
    private IDelivery delivery;

    public void addItem(Product product, int quantity) {
        items.add(new OrderItem(product, quantity));
    }

    public void setPayment(IPayment payment) {
        this.payment = payment;
    }

    public void setDelivery(IDelivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotal(DiscountCalculator calculator) {
        double sum = 0;
        for (OrderItem item : items) {
            sum += item.getTotal();
        }
        return calculator.applyDiscount(sum);
    }

    public void pay(double amount) {
        payment.processPayment(amount);
    }

    public void deliver() {
        delivery.deliverOrder(this);
    }
}
