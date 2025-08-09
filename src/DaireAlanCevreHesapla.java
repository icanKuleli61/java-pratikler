import java.util.Scanner;

public class DaireAlanCevreHesapla {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        final float pi = 3.14f;
        float cevre,alan;
        KullaniciMesaj("Dairenin Yarıcapını giriniz :");


        int r = input.nextInt();

        cevre = 2 * pi * r;
        alan = pi * r* r;

        KullaniciMesaj("Dairenin Yarıcapı : "+r+"\n Dairenin cevresi :"+cevre+"\n Dairenin Alanı :"+alan);




    }

    public static void KullaniciMesaj(String mesaj){

        System.out.print(mesaj);
    }
}
