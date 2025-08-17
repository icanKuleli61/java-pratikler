import java.util.Scanner;

public class MukemmelSayiBul {
    /***Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
    değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

     Mükemmel Sayı Nedir ?
     Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) toplamı kendisine eşit olan sayıya
     mükemmel sayı denir.
     ***/

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Kontrol Edilecek sayıyı giriniz :");
        int sayi = input.nextInt();
        int tamSayiBolen =0;

        for (int i = 1; i <= sayi; i++) {
            if (sayi%i==0 && sayi!= i){
                tamSayiBolen += i;
            }
        }
        if ((tamSayiBolen == sayi)) {
            System.out.println("Mükemmel sayi");
        } else {
            System.out.println("Mükenmel sayı değil.");
        }
    }
}
