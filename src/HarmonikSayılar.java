import java.util.Scanner;

public class HarmonikSayılar {
    /**Java ile girilen sayının harmonik serisini bulan program yazacağız.

     **/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Harmonik sayı hesaplamak icin sayı giriniz : ");
        int number = input.nextInt();
        double sonucResult =0;
        int j =1;
        int i = 1;
        while (j<=number){
            sonucResult +=  1.0 /i;
            i++;
            j++;
        }
        System.out.println(sonucResult);
    }
}
