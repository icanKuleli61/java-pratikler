package KitapSıralayici;

import java.awt.print.Book;
import java.util.Comparator;
import java.util.TreeSet;

public class Main {
    /*Kitap Sıralayıcı
    Book isminde bir sınıf tasarlayınız. Bu sınıf Comparable interface'den kalıtım alıp "compareTo" metodunu override ediniz.
    Bu metodun içinde kitabı A'dan Z'ye isme göre sıralayan kodu yazınız. Bu sınıftan 5 tane nesne oluşturun ve nesneleri Set tipinde bir yapısında saklayınız.
    Sonra ikinci kez Set tipinden bir veri yapısı kullanın ve kitapları sayfa sayısına göre sıralamasını sağlayınız.
    Book sınıfı kitap ismi, sayfa sayısı, yazarın ismi, yayın tarihi değişkenlerinden oluşmaktadır.
     */

    public static void main(String[] args){


        TreeSet<BookClass> treeSet = new TreeSet<>();
        BookClass b1 = new BookClass("Kürk Mantolu Madonna","Sabahattin Ali",200,"1943");
        BookClass b2 = new BookClass("Tutunamayanlar", "Oğuz Atay", 450, "1971");
        BookClass b3 = new BookClass("İnce Mehmed", "Yaşar Kemal", 320, "1968");
        BookClass b4 = new BookClass("Çalıkuşu", "Reşat Nuri Güntekin", 380, "1922");
        BookClass b5 = new BookClass("Suç ve Ceza", "Fyodor Dostoyevski", 430, "1866");

        treeSet.add(b1);
        treeSet.add(b2);
        treeSet.add(b3);
        treeSet.add(b4);
        treeSet.add(b5);
        System.out.println("Sayfa Adına göre sıralama");
        System.out.println();
        System.out.println("--------------------------");

        for(BookClass b : treeSet){
            System.out.println(b.getBookName());
        }

        Comparator<BookClass> orderByPackentNo = new Comparator<BookClass>() {
            @Override
            public int compare(BookClass o1, BookClass o2) {
                return o1.getBookCount()-o2.getBookCount();
            }
        };

        TreeSet<BookClass> treeSet2 = new TreeSet<>(orderByPackentNo);
        System.out.println("Sayfa Sayısına göre sıralama");
        System.out.println();
        System.out.println("--------------------------");
        treeSet2.addAll(treeSet);
        for(BookClass b : treeSet2){
            System.out.println(b.getBookCount());
        }

    }
}
