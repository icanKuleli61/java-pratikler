package builder_UserRegisterSystem;

public class Main {

    /*
    Açıklama:

    Bir kullanıcı kayıt sistemi geliştirilmektedir.

    Kullanıcı oluşturulurken bazı alanlar zorunludur,
    bazıları opsiyoneldir.
    Zorunlu Alanlar:
    - username
    - email
    - password


    Opsiyonel Alanlar:
    - phoneNumber
    - address
    - age
    - bio
    Problem:

    Çok fazla parametre olduğu için constructor kullanımı
    karmaşık ve okunamaz hale gelmektedir.
    Amaç:

    Builder Pattern kullanarak:
    - temiz
    - okunabilir
    - esnek
    bir object oluşturma yapısı kurmak
    Örnek Kullanım:

    User user = new User.Builder("ilyas", "ilyas@mail.com", "123456")
            .setPhoneNumber("5551234567")
            .setAddress("İstanbul")
            .setAge(25)
            .build();

    Beklenen:

    - Fluent API kullanılmalı
    - Object immutable olmalı
    - Zorunlu alanlar constructor’da verilmeli
    - Opsiyonel alanlar builder ile eklenmeli
*/

    public static void main(String[] args){

        User user = new User.Builder("İlyas can","ilyascan@gmail.com","123546")
                .setPhoneNumber("01474422124")
                .setAddress("Kocaeli")
                .setAge(23)
                .build();
    }
}
