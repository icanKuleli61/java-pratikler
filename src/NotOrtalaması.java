import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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

        float result = (mat + fizik +  kimya + turkce + tarih + muzik)/6f;

        String basarıDurumu = (result >= 60) ? "Ders Ortalaman :"+result+ "Olduğun'dan sınıfı gectiniz" :
                "Ders Ortalaman : " +result + "Olduğun'dan sınıf'da kaldınız";

        kullaniciMesaj(basarıDurumu);

    }

    public static void kullaniciMesaj(String mesaj){
        System.out.print(mesaj);
    }
}