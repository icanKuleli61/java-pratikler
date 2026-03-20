package builder_httpRequest;

import java.util.Timer;

public class Main {

    /*
    Açıklama:
    Bir HTTP Request sistemi geliştirilmektedir.
    Bir HTTP isteği şu bilgileri içerebilir:

    - URL (zorunlu)
    - Method (GET, POST vs.) (zorunlu)
    - Headers (opsiyonel)
    - Body (opsiyonel)
    - Timeout (opsiyonel)

    Problem:

    Çok fazla parametre olduğu için constructor kullanımı zorlaşmaktadır.
    Amaç:

    Builder Pattern kullanarak
    daha okunabilir ve esnek bir object oluşturma yapısı kurmak.


    Örnek Kullanım:

    HttpRequest request = new HttpRequest.Builder("https://api.com", "POST")
            .addHeader("Authorization", "Bearer token")
            .addHeader("Content-Type", "application/json")
            .setBody("{\"name\":\"Ali\"}")
            .setTimeout(5000)
            .build();


    Beklenen:

    - Fluent API kullanılmalı (method chaining)
    - Object immutable olmalı (sonradan değişmemeli)
    - Constructor karmaşası olmamalı */

    public static void main(String[] args){

        Http httpRequest = new Http.Builder("https://api.com",MethodRequest.POST)
                .addHeader("Authorization", "Bearer token")
                .addHeader("Content-Type", "application/json")
                .setBody("{\"name\":\"Ali\"}")
                .setTimeout(5000)
                .build();

    }
}
