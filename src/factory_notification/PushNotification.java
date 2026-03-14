package factory_notification;

public class PushNotification extends INotification{


    public PushNotification() {
        super("Push bildirim sistemi");
    }

    @Override
    void send(String message) {
        System.out.println("Push Notification gönderildi :  " + message);
    }
}
