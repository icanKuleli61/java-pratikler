import java.util.Scanner;

/* Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik

Geçme Notu : 55

Ödev
Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın. */

public class NotOrtalaması {

    public static int mat,fizik,kimya,turkce,tarih,muzik;
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        kullaniciMesaj("Matematik notunu giriniz :  ");
        mat = input.nextInt();
        kullaniciMesaj("fizik notunu giriniz :  ");
        fizik = input.nextInt();
        kullaniciMesaj("kimya notunu giriniz :  ");
        kimya = input.nextInt();
        kullaniciMesaj("Türkce notunu giriniz :  ");
        turkce = input.nextInt();
        kullaniciMesaj("Tarih notunu giriniz :  ");
        tarih = input.nextInt();
        kullaniciMesaj("Muzik notunu giriniz :  ");
        muzik = input.nextInt();

        if (mat<0 || mat >100) mat = 0;
        if (fizik<0 || fizik >100) fizik = 0;
        if (kimya<0 || kimya >100) kimya = 0;
        if (turkce<0 || turkce >100) turkce = 0;
        if (tarih<0 || tarih >100) tarih = 0;
        if (muzik<0 || muzik >100) muzik = 0;


        float result = (mat + fizik +  kimya + turkce + tarih + muzik)/6f;

        if (result >= 55)
            kullaniciMesaj("Sınıfı başarı ile gectiniz\n Dönem ortalamanız : "+result);
        else kullaniciMesaj("Sınıf da kaldınız\n Dönem ortalamanız : "+result);

    }

    public static void kullaniciMesaj(String mesaj){
        System.out.print(mesaj);
    }
}