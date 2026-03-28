package generic_cache;

import java.sql.SQLOutput;
import java.util.HashMap;

public class Main {



    /*
 Açıklama:


 Örnek Gerçek Dünya Senaryosu:

 - Kullanıcı bilgileri
 - Ürün bilgileri
 - API sonuçları

 Bu veriler sürekli database'den çekilmek yerine cache'te tutulur.
 Cache Sistemi şu özelliklere sahip olmalıdır:

 - Veri ekleme
 - Veri silme
 - Veri getirme
 - Cache temizleme
 - Cache boyutu öğrenme
 Problem:
 Farklı veri tipleri cache'e eklenmek istenmektedir:

 - User objesi
 - Product objesi
 - String veri
 - Integer veri

 Her biri için ayrı cache sınıfı oluşturmak:

 UserCache
 ProductCache
 StringCache

 gibi gereksiz tekrar eden kod üretir.


 Amaç:

 Generics kullanarak:

 Tek bir Cache sınıfı ile
 tüm veri tiplerini destekleyen
 reusable bir cache sistemi oluşturmak.


 Örnek Kullanım:

 Cache<String, User> userCache = new Cache<>();

 userCache.put("user1", new User("Ali"));

 User user = userCache.get("user1");


 Cache<Integer, Product> productCache = new Cache<>();

 productCache.put(1, new Product("Laptop"));

 Product product = productCache.get(1);



 Beklenen:

 - Generics kullanılmalı (<K, V>)
 - HashMap kullanılmalı
 - OOP prensiplerine uygun olmalı
 - Reusable bir yapı olmalı
 - Temel cache operasyonları olmalı

 Geliştirilecek Methodlar:

 - put(K key, V value)
 - get(K key)
 - remove(K key)
 - clear()
 - size()


 Bonus (Zorlaştırmak İçin):

 - Cache limit ekleme
 - TTL (Time To Live) ekleme
 - LRU Cache mantığı ekleme

*/

    public static void main(String[] args){

        CacheSystem<String, User> userCache = new CacheSystem<>();

        userCache.put("user1",new User(1L,"ilyas","Can","can71@gmail.com"));
        userCache.put("user2",new User(2L,"emre","ali","ali@gmail.com"));
        userCache.put("user3", new User (3L,"mehmet","cebeci","cebeci@gmail.com"));

        System.out.println(userCache.toString());

        CacheSystem<String, Product> productCache = new CacheSystem<>();

        productCache.put("ürün1", new Product(1L, "MacBook Pro M4 Max 16\"", 145000.00, 12, "Laptop"));
        productCache.put("Ürün2", new Product(2L, "RTX 5090 Ti Ekran Kartı", 85000.00, 5, "Donanım"));
        productCache.put("Ürün3", new Product(3L, "iPhone 17 Pro Max 1TB", 115000.00, 25, "Telefon"));
        productCache.put("Ürün4", new Product(4L, "Sony WH-1000XM6 Kulaklık", 18500.00, 40, "Ses Sistemi"));
        productCache.put("Ürün5", new Product(5L, "Samsung Odyssey OLED G9", 42000.00, 8, "Monitör"));
        productCache.put("Ürün6", new Product(6L, "Logitech G Pro X Superlight 3", 6500.00, 60, "Aksesuar"));

        System.out.println(productCache.toString());




    }
}
