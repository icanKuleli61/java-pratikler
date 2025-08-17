import java.util.Scanner;

public class TekSayıKontrol {
//Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri
// kabul eden ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen cift sayı giriniz tek sayı girdiğiniz oyun biter :");
        boolean isNumberTek = false;
        int toplamDeger = 0;
        while (!isNumberTek) {
            System.out.print("Lütfen cift sayı giriniz :");
            int number = input.nextInt();
            if (number%2 !=0) {
                System.out.print("Tek sayı girdiniz. ");
                isNumberTek = true;
                break;
            }
            if (number%4==0 ) {
                toplamDeger = number;
            }

        }
        System.out.print("Girilen Cift sayılardan 4'ün katlarının Toplamı : " + toplamDeger);
    }
}
