package ChatRoom;

import java.util.Date;

public class Main {

    /*
    Açıklama:
    Bir chat (mesajlaşma) sistemi geliştirilmektedir.
    Sistemde bir "ChatRoom" (sohbet odası) vardır.
    Kullanıcılar bu odaya katılabilir (subscribe).
    Odaya bir kullanıcı mesaj gönderdiğinde
    o odadaki tüm diğer kullanıcılara mesaj gitmelidir.
    Sistem Gereksinimleri:
    - Kullanıcılar chat odasına katılabilir
    - Kullanıcılar odadan çıkabilir
    - Bir kullanıcı mesaj gönderdiğinde tüm diğer kullanıcılar
      bu mesajı almalıdır

    Amaç:

    Observer Pattern kullanarak real-time mesajlaşma sistemi kurmak


    Örnek Senaryo:

    ChatRoom: "Java Grubu"

    Ahmet katıldı
    Mehmet katıldı

    Ahmet mesaj gönderdi: "Selam"

    Output:
    Mehmet: Ahmet → Selam


    Mehmet mesaj gönderdi: "Merhaba"

    Output:
    Ahmet: Mehmet → Merhaba


    Beklenen:

    Yeni kullanıcı eklendiğinde sistem değişmeden çalışmalıdır
*/


    public static void main(String[] args){

        ChatRoom sohbetOdasi = new ChatRoom("Gebze Nakliye Grubu");

        User duhan = new User(1,"Duhan","Günay");
        User emre = new User(2,"Emre","Ali");
        User numan = new User(3,"Numan ","Kara");
        User cetin = new User(4,"Cetin","Gedik");
        User ali = new User(5,"Ali","Kara");

        sohbetOdasi.joinRoom(duhan);
        sohbetOdasi.joinRoom(emre);
        sohbetOdasi.joinRoom(numan);
        sohbetOdasi.joinRoom(cetin);
        sohbetOdasi.joinRoom(ali);

        Message message = new Message(1,"Merhaba nasılsınız",duhan,new Date());
        sohbetOdasi.chatRoomHandler(message);
        Message message2 = new Message(2,"teşekkürler sen",emre,new Date());
        sohbetOdasi.chatRoomHandler(message2);
        Message message3 = new Message(3,"İyiyim nabıyorsun",duhan,new Date());
        sohbetOdasi.chatRoomHandler(message3);
    }
}
