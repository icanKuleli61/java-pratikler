package factory_notification;

public class EmailNotification extends INotification {

    public EmailNotification() {
        super("Email bildirim sistemi");
    }

    @Override
    void send(String message) {
        System.out.println("Email gönderildi : " + message);
    }
}
