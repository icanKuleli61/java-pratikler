import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            int randomDeger = new Random().nextInt(100);
            int yanlisHak = 5;
            while (yanlisHak >0){
                System.out.println(randomDeger);
                System.out.print("Lütfen tahmininizi giriniz : ");
                int tahmin= input.nextInt();
                if (randomDeger == tahmin){
                    System.out.println("Tebrikler, doğru tahmin ! Tahmin ettiğiniz sayı : " + tahmin);
                    break;
                }else {
                    if (tahmin < randomDeger){
                        System.out.println(tahmin + " sayısı, gizli sayıdan büyüktür.");
                    }else {
                        System.out.println(tahmin + "  sayısı, gizli sayıdan küçüktür.");
                    }
                    yanlisHak--;
                    System.out.println("Kalan hak sayınız :" + yanlisHak);
                }

            }

        }
    }
