package factory_notification;

public class SmsNotification extends INotification{


    public SmsNotification() {
        super("Sms bildirim sistemi");
    }

    @Override
    void send(String message) {
        System.out.println("SMS gönderildi : " + message);
    }
}
