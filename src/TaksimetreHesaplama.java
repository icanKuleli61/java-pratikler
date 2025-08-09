import java.util.Scanner;

public class TaksimetreHesaplama {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        float taksimetKmBasıTutar = 2.20f,toplamUcret;
        int taksimetreAcılıs = 10, kacKmgitti;

        KullaniciMesaj("Yolcunun Gittiği Mesafeyi KM cinsin'den yazınız :");
        kacKmgitti = input.nextInt();

        toplamUcret = taksimetreAcılıs + (taksimetKmBasıTutar * kacKmgitti);

        float sonuc = (toplamUcret>= 20) ? toplamUcret : 20;

        KullaniciMesaj("Taksimetre Acılış Ücreti : " + taksimetreAcılıs +"\n Yolculuk Edilen mesafe " + kacKmgitti +"\n Yolculuk Ücreti : " +sonuc);






    }

    public static void KullaniciMesaj(String mesaj  ){
        System.out.print(mesaj);
    }
}
