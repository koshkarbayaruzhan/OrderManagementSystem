package notification;

public class SmsNotification implements INotification {
    public void sendNotification(String message) {
        System.out.println("SMS: " + message);
    }
}
