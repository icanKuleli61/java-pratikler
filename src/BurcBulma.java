import java.util.Scanner;

public class BurcBulma {
    /*    /*Koç Burcu : 21 Mart - 20 Nisan

    Boğa Burcu : 21 Nisan - 21 Mayıs

    İkizler Burcu : 22 Mayıs - 22 Haziran

    Yengeç Burcu : 23 Haziran - 22 Temmuz

    Aslan Burcu : 23 Temmuz - 22 Ağustos

    Başak Burcu : 23 Ağustos - 22 Eylül

    Terazi Burcu : 23 Eylül - 22 Ekim

    Akrep Burcu : 23 Ekim - 21 Kasım

    Yay Burcu : 22 Kasım - 21 Aralık

    Oğlak Burcu : 22 Aralık - 21 Ocak

    Kova Burcu : 22 Ocak - 19 Şubat

    Balık Burcu : 20 Şubat - 20 Mart

   switch-case kullanarak yapınız/**/

    public static void main(String[] args) {
        System.out.println("-----Burc öğrenme Programına Hoş Geldiniz-----");
        int gün, ay;
        Scanner input = new Scanner(System.in);

        String burç ="";

        while (true){
            System.out.print("Doğduğunuz ayı giriniz :");
            ay = input.nextInt();
            if (!(ay > 0 && ay < 13)){
                System.out.println("Aylar 1 ile 12 arasında değer alabilir yanlış giriş yaptınız bir daha giriniz");
                continue;
            }

            System.out.print("Doğduğunuz günü giriniz :");
            gün = input.nextInt();
            if (!(gün > 0 && gün  < 32)){
                System.out.println("Günler 1 ile 31 arasında değer alabilir yanlış giriş yaptınız bir daha giriniz");
                continue;
            }

            break;

        }

        switch (ay) {
            case 1:
                if (gün >21) burç="Kova";
                else burç = "Oğlak";
                break;
            case 2:
                if (gün >19) burç="Balık";
                else burç = "Kova";
                break;
            case 3:
                if (gün >20) burç="Koç";
                else burç = "Balık";
                break;
            case 4:
                if (gün >20) burç="Boğa";
                else burç = "Koç";
                break;
            case 5:
                if (gün >21) burç="İkizler";
                else burç = "Boğa";
                break;
            case 6:
                if (gün >22) burç="Yengeç";
                else burç = "İkizler";
                break;
            case 7:
                if (gün >22) burç="Aslan";
                else burç = "Yengeç";
                break;
            case 8:
                if (gün >22) burç="Başak";
                else burç = "Aslan";
                break;
            case 9:
                if (gün >22) burç="Terazi";
                else burç = "Başak";
                break;
            case 10:
                if (gün >22) burç="Akrep";
                else burç = "Terazi";
                break;
            case 11:
                if (gün >21) burç="Oğlak";
                else burç = "Yay";
                break;
            case 12:
                if (gün >21) burç="Kova";
                else burç = "Oğlak";
                break;
            default:

        }

        System.out.println("Burcunuz :" +burç);


    }
}
