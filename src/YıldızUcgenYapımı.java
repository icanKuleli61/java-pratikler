import java.util.Scanner;

public class YıldızUcgenYapımı {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //ücgen
        /*
         System.out.print("Kac satır yıldız oluşturalım :");
         int satirSayisi= input.nextInt();
         int boslukAzalt = satirSayisi;
         int yildizEkle =1;
         for (int j = 1; j <= satirSayisi; j++) {

             for( int i = 1; i <= boslukAzalt; i++ ) {
                 System.out.print(" ");
             }
             for( int i = 1; i <= yildizEkle; i++ ) {
                 System.out.print("*");
             }
             yildizEkle+=2;
             boslukAzalt--;
             System.out.println();
         }
         */
        //Ters ücgen,

        /*
        System.out.print("Kac satır yıldız oluşturalım :");
        int satirSayisi = input.nextInt();
        int boslukAzalt = 0;
        int yildizEkle = satirSayisi;
        if (satirSayisi % 2 != 0) {
            yildizEkle = satirSayisi + 2;
        } else yildizEkle =  satirSayisi+3;

        for (int i = 1; i <= satirSayisi; i++) {

            for (int j = 1; j <= boslukAzalt; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= yildizEkle; k++) {
                System.out.print("*");

            }
            boslukAzalt++;
            yildizEkle -= 2;
            System.out.println();
        }

         */
        /*
        System.out.print("Elmas oluşturmak icin n sayısı giriniz en sayısı en az 3 ve tek sayı olmalıdır :");
        int n = input.nextInt();
        int yildizBosluk = (n/2+1)-1;
        int yildizEkle = 1;
        for (int i = 1; i <= n/2+1; i++) {
            for (int j = 1; j <= yildizBosluk; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= yildizEkle; k++) {
                System.out.print("*");
            }
            yildizBosluk--;
            yildizEkle+=2;
            System.out.println();
        }


        int bosluk = 1;
        int yildiz =n/2;
        if (yildiz % 2 != 0) {
            yildiz = yildiz + 2;
        } else yildiz =  yildiz+1;


        for (int j = 1; j <= n/2; j++) {

            for (int i = 1; i <= bosluk; i++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= yildiz; k++) {
                System.out.print("*");
            }
            bosluk++;
            yildiz -=2;
            System.out.println();

         */
        /**
        Ödev - Ters Üçgen Yapımı
        Java ile basamak sayısının kullanıcıdan alınan ve döngüler kullanılarak, yıldızlar(*) ile
         ekrana ters üçgen çizen programı yazın.

         Örnek
        Basamak Sayısı : 10

                *******************
                *****************
                ***************
                *************
                ***********
                *********
                *******
                *****
                ***
                *
         * */

        System.out.print("Ücgen kac basamakdan oluşsun :");
        int basamakSayi = input.nextInt();

        for (int i = basamakSayi; 1<=i ; i--) {

            for (int j = 1; j <=i*2-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }







    }
}
