import java.util.Scanner;

public class HesapMakinası {

    public static void main(String[] args) {

        System.out.println("---Hesap Makinası---\nToplama işlemi icin 1\nCıkarma işlemi icin 2\nCarpma icin 3\nBölme icin 4 giriniz\n--------------");
        Scanner input = new Scanner(System.in);
        System.out.print("Seciminizi Yapınız :");
        int secim = input.nextInt();
        int tResult ;
        boolean islemKontrol = true;
        System.out.print("Birinci Sayıyı giriniz :");
        int birinciSayi = input.nextInt();

        System.out.print("İkinci Sayıyı giriniz :");
        int ikinciSayi = input.nextInt();

        switch (secim) {

            case 1:
                tResult = birinciSayi + ikinciSayi;
                break;
            case 2:
                tResult = birinciSayi - ikinciSayi;
                break;
            case 3:
                tResult = birinciSayi * ikinciSayi;
                break;
            case 4:
                if (ikinciSayi == 0){
                    tResult = 0;
                    System.out.print("Bölme işlemin'de payda 0 değerini alamaz ");
                    islemKontrol = false;
                    break;
                }
                tResult = birinciSayi / ikinciSayi;
                break;

            default:
                islemKontrol = false;
                tResult = 0;
                break;
        }

        if (islemKontrol) {
            System.out.print("İşlem sonucunuz :" +tResult);
        }


    }
}
