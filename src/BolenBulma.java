import java.util.Scanner;

public class BolenBulma {


    /** Java döngüler ile 0'dan girilen sayıya kadar olan sayılardan 3 ve 4'e tam bölünen sayıların ortalamasını hesaplayan programı yazınız.**/
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        /*
        int toplamDeger = 0;
        System.out.print("0 ile hangi sayı arasın'daki 3 ve 4 ile bölünen sayıların ortalamasın bulmak istiyorsunu :");
        int number = input.nextInt();
        int i = 0;


        while (i<number){

            if (i%3==0 && i%4 ==0){
                toplamDeger = i;

            }
            i++;
        }

        System.out.println("0 İle "+number+" arasın'daki sayıların 3 ile 4 ile kalansız bölünenlerin toplamı :" + toplamDeger);

         */


        int toplamDeger = 0;
        int sayac = 0;
        System.out.print("0 ile hangi sayı arasın'daki 3 ve 4 ile bölünen sayıların ortalamasın bulmak istiyorsunu :");
        int number = input.nextInt();
        for (int i = 0 ; i<=number; i++){
            if (i%3 == 0 && i%4 == 0){
                System.out.print(i +" ,");
                toplamDeger =i;
                sayac ++;
            }
            i++;
        }
        if (sayac !=0)System.out.println("----> 0 İle "+number+" arasın'daki sayıların 3 ile 4 ile kalansız bölünenlerin ortalaması :" + toplamDeger/sayac);
        else System.out.println("0 İle "+number+" arasın'daki sayıların 3 ile 4 ile kalansız bölünen değer bulunamadı.");


    }
}
