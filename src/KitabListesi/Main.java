package KitabListesi;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    /*
    Ödev - Kitap Listesi
    Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
    Book sınıfından 10 tane nesne üretip bunu bir ArrayList yapısında saklayınız. stream yapısını ve lambda ifadelerini kullanarak
    kitap isminin karşısında yazar ismi olacak şekilde yeni bir Map<String, String> oluşturacak şekilde yazınız.
    Bu 10 elemanlık Book listesinden sayfa sayısı 100'den fazla olan kitapları filtreleyen ve yeni bir liste olarak verecek geliştirmeyi yapınız. (Stream ve Lambda ifadeleri kullanabilirsiniz.)
     */

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>(List.of(
                new Book("Suç ve Ceza", "Fyodor Dostoyevski", 200, 1866),
                new Book("Sefiller", "Victor Hugo", 150, 1862),
                new Book("Kürk Mantolu Madonna", "Sabahattin Ali", 95, 1943),
                new Book("1984", "George Orwell", 110, 1949),
                new Book("Hayvan Çiftliği", "George Orwell", 89, 1945),
                new Book("İnce Memed", "Yaşar Kemal", 60, 1955),
                new Book("Tutunamayanlar", "Oğuz Atay", 210, 1971),
                new Book("Şeker Portakalı", "José Mauro de Vasconcelos", 87, 1968),
                new Book("Uçurtma Avcısı", "Khaled Hosseini", 99, 2003),
                new Book("Simyacı", "Paulo Coelho", 122, 1988)
        ));


        Map<String,String> map = books.stream().collect(Collectors.toMap(Book::getBookName,Book::getBookAuthor));

        map.forEach((k,v)->{
            System.out.println("KİTAB İSMİ :\t" + k + " Yazar ismi :" + v);
        });


        System.out.println("----------------------------------");
        books.stream().filter(i -> i.getBookCount() > 100).forEach(i -> {
            System.out.println(i.getBookAuthor());
            System.out.println(i.getBookName());
            System.out.println(i.getBookCount());
            System.out.println(i.getBookData());
            System.out.println("-----------------------------");
        });

    }
}
