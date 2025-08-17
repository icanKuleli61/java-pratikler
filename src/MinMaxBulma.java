import java.util.Scanner;

public class MinMaxBulma {



    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        int enBuyuk = Integer.MIN_VALUE;
        int enKucuk = Integer.MAX_VALUE;
        while(true){
            System.out.print("kac tane sayı girmek istiyorsunuz  :");
            int kacSayi = input.nextInt();

            for(int i = 1; i <= kacSayi; i++){
                System.out.print(i +". sayıyı giriniz :");
                int number  = input.nextInt();
                if(kacSayi==1){
                    System.out.println("Tek sayı girdiniz :" + number);
                    return;
                }
                if (i==1){
                    enBuyuk = number;
                    enKucuk = number;
                } else {
                    enBuyuk = (enBuyuk < number) ? number : enBuyuk;
                    enKucuk = (enKucuk > number) ? number : enKucuk;
                }
            }
            break;

        }
        System.out.print("En büyük sayı :" + enBuyuk+"\nEn kücük sayi :" + enKucuk);
    }
}
