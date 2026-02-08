package main;

import model.*;
import payment.*;
import delivery.*;
import notification.*;
import discount.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Order order = new Order();

        order.addItem(new Product("Laptop", 350000), 1);
        order.addItem(new Product("Mouse", 8000), 2);

        order.setPayment(new CreditCardPayment());
        order.setDelivery(new CourierDelivery());

        DiscountCalculator calculator = new DiscountCalculator(
                List.of(new SeasonDiscount(), new BigOrderDiscount())
        );

        double total = order.calculateTotal(calculator);

        order.pay(total);
        order.deliver();

        INotification notification = new EmailNotification();
        notification.sendNotification("Order completed. Total: " + total);
    }
}
