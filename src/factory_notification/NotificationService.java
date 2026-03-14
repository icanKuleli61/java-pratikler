package factory_notification;

public class NotificationService {

    private final INotification notification;

    public NotificationService(INotification notification) {
        this.notification = notification;
    }

    public void send(String message) {
        notification.send(message);
    }

}
