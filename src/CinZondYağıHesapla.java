import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CinZondYağıHesapla {

    /***
    Çin Zodyağı nasıl hesaplanır?

    Çin zodyağı hesaplanırken kişinin doğum yılının 12 ile bölümünde kalana göre bulunur.

    Doğum Tarihi %12 = 0 ➜ Maymun

    Doğum Tarihi %12 = 1 ➜ Horoz

    Doğum Tarihi %12 = 2 ➜ Köpek

    Doğum Tarihi %12 = 3 ➜ Domuz

    Doğum Tarihi %12 = 4 ➜ Fare

    Doğum Tarihi %12 = 5 ➜ Öküz

    Doğum Tarihi %12 = 6 ➜ Kaplan

    Doğum Tarihi %12 = 7 ➜ Tavşan

    Doğum Tarihi %12 = 8 ➜ Ejderha

    Doğum Tarihi %12 = 9 ➜ Yılan

    Doğum Tarihi %12 = 10 ➜ At

    Doğum Tarihi %12 = 11 ➜ Koyun

     ***/


    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int dogumYili;
        byte yildanKalan ;
        do {
            System.out.print("Doğum yılınızı giriniz :");
            dogumYili = input.nextInt();
            if (dogumYili <=1800) {
                System.out.print("Lüften Doğum yılınızı 1800'den büyük giriniz");
            }
        }while (dogumYili <=1800);
        yildanKalan = (byte) (dogumYili % 12);

        List<String> hayvanlar = List.of("Maymun","Horoz","Köpek","Domuz","Fare","Öküz","Kaplan","Tavşan","Ejderha","Yılan","At","Koyun");

        System.out.println("Çin Zodyağı Burcunuz :" + hayvanlar.get(yildanKalan));



    }
}
