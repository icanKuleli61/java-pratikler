package observer_ecommerce;


public class Main {

    /*
    Açıklama:

    Bir e-ticaret sistemi geliştirilmektedir.

    Sistemde bir ürün (Product) vardır ve bu ürünün fiyatı değişebilmektedir.

    Kullanıcılar bu ürünü "takip edebilir" (subscribe).

    Ürünün fiyatı düştüğünde veya değiştiğinde
    tüm takipçilere otomatik bildirim gitmelidir.


    Sistem Gereksinimleri:

    - Kullanıcılar ürünü takip edebilir (subscribe)
    - Kullanıcılar takibi bırakabilir (unsubscribe)
    - Ürün fiyatı değiştiğinde tüm takipçilere bildirim gitmelidir


    Amaç:

    Observer Pattern kullanarak event-driven bir sistem kurmak.


    Örnek Senaryo:

    Ürün: "iPhone 15"

    User1 takip etti
    User2 takip etti

    Fiyat değişti: 50000 → 45000

    Output:
    User1: iPhone 15 fiyatı düştü: 45000
    User2: iPhone 15 fiyatı düştü: 45000


    User2 takibi bıraktı

    Fiyat değişti: 45000 → 40000

    Output:
    User1: iPhone 15 fiyatı düştü: 40000
*/

    public static void main(String[] args) {

        Product laptop = new Product(
                "ABC-123", "Gaming Laptop",
                45000.0, 10,
                "16GB RAM, RTX 4060", "Elektronik"
        );

        User user = new User ("İlyas can", "ilyascan@gmail.com");
        User user2 = new User("Yasin", "yasin@gmail.com");
        User user3 = new User("hamit", "duhan@gmail.com");
        User user4 = new User("emre", "emre@gmail.com");
        User user5 = new User("duhan", "can@gmail.com");


        System.out.println();


        laptop.addObserver(user);
        laptop.addObserver(user2);
        laptop.addObserver(user3);
        laptop.addObserver(user4);
        laptop.addObserver(user5);

        System.out.println();

        laptop.setPrice(65000);



    }
}