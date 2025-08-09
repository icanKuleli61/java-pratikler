import java.util.Scanner;

public class VucutKitleIndex {

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        KullaniciMesaj("Lütfen boyunuzu (metre cinsinde) giriniz örneğin(1,72) : ");
        float boy = input.nextFloat();
        KullaniciMesaj("Lütfen kilonuzu giriniz : ");
        int kilo = input.nextInt();

        float vucutIndex = kilo / (boy*boy);
        KullaniciMesaj("Vucut İndexsiniz :"+vucutIndex+"\n");

        if (vucutIndex <= 18.5){
            KullaniciMesaj("Zayıfsınız kilo almanı lazım ");
        } else if (vucutIndex <= 24.9 && vucutIndex > 18.5) {
            KullaniciMesaj("Normal kilodasınız ");
        } else if (vucutIndex > 24.9 && vucutIndex <=29.9) {
            KullaniciMesaj("Kilonuz fazla");
        } else if (vucutIndex >=30) {
            KullaniciMesaj("Obezitesiniz");
        }


    }

    public static void KullaniciMesaj(String mesaj){
        System.out.print(mesaj);
    }
}
