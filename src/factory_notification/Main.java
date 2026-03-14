package factory_notification;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    /*
    Açıklama:

    Bir bildirim (notification) sistemi geliştirilmektedir.

    Sistem farklı türlerde bildirim gönderebilmelidir.
    Şu bildirim türleri desteklenmektedir:

    - Email
    - SMS
    - Push Notification

    Kullanıcı hangi bildirim türünü kullanmak istediğini seçer.
    Sistem bu seçime göre uygun bildirim nesnesini oluşturur
    ve mesajı gönderir.


    Önemli Kurallar:

    - Main class içinde new Email(), new SMS() gibi nesneler
      doğrudan oluşturulmamalıdır.

    - Nesne oluşturma işlemi merkezi bir factory class
      tarafından yapılmalıdır.

    - Sistem yeni bir bildirim türü eklendiğinde
      mevcut kodu değiştirmeden genişletilebilmelidir.


    Amaç:

    Object creation logic'i merkezi bir yerde toplayarak
    daha temiz ve yönetilebilir bir mimari kurmak.


    Örnek Senaryo:

    Input:
    notificationType = 1
    message = "Siparişiniz hazır"

    Output:
    Email gönderildi: Siparişiniz hazır


    Input:
    notificationType = 2
    message = "Siparişiniz yola çıktı"

    Output:
    SMS gönderildi: Siparişiniz yola çıktı


    Input:
    notificationType = 3
    message = "Yeni kampanya!"

    Output:
    Push Notification gönderildi: Yeni kampanya!


    Beklenen:

    Sistem yeni bir bildirim türü (örneğin WhatsApp)
    eklendiğinde sadece yeni bir class yazılarak
    genişletilebilmelidir.
    */
    private static int isSecim() {
        Scanner sc = new Scanner(System.in);
        int secim;
        boolean isFlag = false;
        do {
            if (isFlag){
                System.out.println("Yanlış bir değer girdiniz lütfen tekrar deneyin.");
            }
            System.out.println("1- Email ile bildirim göndermek\n2- Sms ile bildirim göndermek\n3- PushNotification ile bildirim göndermek");
            System.out.print("Secim : ");
            isFlag = true;
            secim = sc.nextInt();
        }while (secim < 1 || secim > 3);
        return secim;
    }
    public static void main(String[] args){
        Map<Integer,INotification> notifications = new HashMap<>();
        notifications.put(1,new EmailNotification());
        notifications.put(2,new SmsNotification());
        notifications.put(3,new PushNotification());

        System.out.println("Bildirim Merkezine Hoşgeldin");
        System.out.println("--------------------");
        System.out.println("Hangi sistem ile mesaj göndermek istersin");

        int secim = isSecim();

        Scanner mesage = new Scanner(System.in);
        System.out.print("Göndermek istediğiniz mesajı seciniz : ");
        String message = mesage.nextLine();
        new NotificationService(notifications.get(secim)).send(message);
        mesage.close();
    }
}
