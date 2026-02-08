package delivery;

import model.Order;

public class PostDelivery implements IDelivery {
    public void deliverOrder(Order order) {
        System.out.println("Post delivery");
    }
}
