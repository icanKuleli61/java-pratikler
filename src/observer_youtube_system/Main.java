package observer_youtube_system;

public class Main {
    /*
    Açıklama:

    Bir YouTube sistemi geliştirilmektedir.

    Sistemde bir "YouTubeChannel" vardır ve bu kanal
    yeni video yüklediğinde abonelerine bildirim gönderir.

    Kullanıcılar (Subscriber) kanala abone olabilir.

    Kanal yeni video yüklediğinde tüm abonelere
    otomatik olarak bildirim gitmelidir.


    Sistem Gereksinimleri:

    - Kullanıcılar kanala abone olabilir.
    - Kullanıcılar abonelikten çıkabilir.
    - Kanal yeni video yüklediğinde tüm abonelere bildirim gitmelidir.


    Önemli:

    - Channel class, kullanıcıları tek tek bilmemelidir.
    - Observer Pattern kullanılmalıdır.
    - Loose coupling sağlanmalıdır.


    Amaç:

    Publisher (YouTubeChannel) ile Subscriber (User)
    arasındaki bağı gevşetmek ve event-driven yapı kurmak.


    Örnek Senaryo:

    Kanal: "Java Dersleri"

    User1 abone oldu
    User2 abone oldu

    Yeni video yüklendi: "OOP Ders 1"

    Output:
    User1: Yeni video: OOP Ders 1
    User2: Yeni video: OOP Ders 1


    User2 abonelikten çıktı

    Yeni video yüklendi: "Design Patterns"

    Output:
    User1: Yeni video: Design Patterns
    Beklenen:
    Yeni kullanıcı eklendiğinde sistem değişmeden çalışmalıdır.
    */

    public static void main(String[] args){

        YoutubeKanalSubject youtubeKanalSubject = new YoutubeKanalSubject("Enes batur");

        User user = new User("İlyas can", "ilyascan@gmail.com");
        User user2 = new User("Yasin", "yasin@gmail.com");
        User user3 = new User("hamit", "duhan@gmail.com");
        User user4 = new User("emre", "emre@gmail.com");
        User user5 = new User("duhan", "can@gmail.com");

        System.out.println();

        youtubeKanalSubject.registerObserver(user,user);
        youtubeKanalSubject.registerObserver(user2,user);
        youtubeKanalSubject.registerObserver(user3,user);
        youtubeKanalSubject.registerObserver(user4,user);
        youtubeKanalSubject.registerObserver(user5,user);

        youtubeKanalSubject.addVideoName("Yeni vlog Hayattayım :)");

    }
}
