package delivery;

import model.Order;

public class PickUpPointDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Pick-up point delivery");
    }
}
