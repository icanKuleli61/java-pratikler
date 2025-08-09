import java.util.Scanner;

public class ManavKasaProgramı {

    public static void main(String[] args){

        float armutF =76.99f, elmaF = 55.0f, domatesF = 36.90f ,muzF = 54.90f, patlıcanF = 41f;

        Scanner input = new Scanner(System.in);

        KdvHesaplama.KullaniciMesaj("Armut Kaç Kilo ? :");
        float armutKilo = input.nextFloat();
        KdvHesaplama.KullaniciMesaj("Elma Kaç Kilo ? :");
        float elmaKilo = input.nextFloat();
        KdvHesaplama.KullaniciMesaj("Domates Kaç Kilo ? :");
        float domatesKilo = input.nextFloat();
        KdvHesaplama.KullaniciMesaj("Muz Kaç Kilo ? :");
        float muzKilo = input.nextFloat();
        KdvHesaplama.KullaniciMesaj("Patlıcan Kaç Kilo ? :");
        float patlıcanKilo = input.nextFloat();

        float toplamTutar = (armutKilo * armutF) + (elmaKilo * elmaF) + (domatesKilo * domatesF) + (muzKilo * muzF) + (patlıcanKilo * patlıcanF);

        KdvHesaplama.KullaniciMesaj("Toplam Ücretiniz :" + toplamTutar);


    }



}
