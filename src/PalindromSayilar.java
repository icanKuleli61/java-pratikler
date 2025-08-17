import java.util.Scanner;

public class PalindromSayilar {

    /**
     * Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.
     * <p>
     * Palindrom Sayı Nedir ?
     * Palindromik sayı, iki taraftan okunduğu zaman okunuş yönüyle aynı olan sayılardır.
     * <p>
     * Örnek: 1, 4, 8, 99, 101, 363, 4004, 9889....
     **/

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Polindrom olup olmadığını kontrol etmek istediğiniz sayıyı giriniz :");
        int sayi = input.nextInt();
        boolean result = isPolindrom(sayi);

        if (result) {
            System.out.println(sayi + " sayısı bir polindrom sayısıdır");
        }else {
            System.out.println(sayi+ " sayısı palindrom sayı değildir.");
        }

    }

    static boolean isPolindrom(int sayi) {
        int geciciSayi = sayi;
        int ters = 0;
        while (geciciSayi > 0) {
            int birlerBas = geciciSayi % 10;
            ters =  ters *10 + birlerBas;
            geciciSayi = geciciSayi / 10;
        }
        return sayi == ters;
    }
}
