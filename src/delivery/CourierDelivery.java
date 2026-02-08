package delivery;

import model.Order;

public class CourierDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Courier delivery");
    }
}
