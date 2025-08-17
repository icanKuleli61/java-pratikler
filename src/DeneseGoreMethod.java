import java.util.Scanner;

public class DeneseGoreMethod {
    /**
     * Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
     * Her çıkarma işlemi sırasında ekrana son değeri yazdırın. Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin.
     * Yine her ekleme işleminde sayının son değerini ekrana yazdırın.
     * **/

    static void DesenMethod(int number, int degisenNumber,boolean isAzaltYon){

        System.out.print(degisenNumber + " ");

        if(degisenNumber<=0){
            isAzaltYon=false;
        }

        if (number == degisenNumber && !isAzaltYon){
            return;
        }

        if (isAzaltYon){
            DesenMethod(number, degisenNumber-5,true);
        }else {
            DesenMethod(number, degisenNumber+5,false);
        }

    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz :");
        int number = input.nextInt();

        DesenMethod(number,number,true);
    }
}
