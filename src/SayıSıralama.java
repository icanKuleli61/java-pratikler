import java.util.Scanner;

public class SayıSıralama {
//Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.


    public static void main(String[] args){

        System.out.println("Hoşgeldiniz bu program girdiğiniz 3 sayıyı kücük'den büyüğe doğru sıralamaktadır");

        Scanner input = new Scanner(System.in);
        System.out.println("1.sayıyı giriniz :");
        int sayi1 = input.nextInt();
        System.out.println("2.sayıyı giriniz :");
        int sayi2 = input.nextInt();
        System.out.println("3.sayıyı giriniz :");
        int sayi3 = input.nextInt();

        if (sayi1 > sayi2) {
            if (sayi1 > sayi3) {
                if (sayi2 > sayi3) {
                    System.out.println(String.format("%d,< %d,< %d", sayi3, sayi2,sayi1));
                }else System.out.println(String.format("%d,< %d,< %d", sayi2,sayi3,sayi1));
            }else System.out.println(String.format("%d,< %d,< %d", sayi2,sayi1,sayi3));
        }else {
            if (sayi2 > sayi3){
                System.out.println(String.format("%d,< %d,< %d", sayi1, sayi3, sayi2));
            }
            else System.out.println(String.format("%d,< %d,< %d", sayi1, sayi2, sayi3));
        }

    }
}
