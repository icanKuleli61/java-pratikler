import java.util.Arrays;
import java.util.Scanner;

public class DiziMaxMin {
    //Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve sayıdan  büyük en yakın sayıyı bulan programı yazınız.

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        
        int[] list = {25,30,25,48,10,12,2};
        int max = list[0];
        int min = list[0];
        int minYakin = 0;
        int maxYakin = 0;
        System.out.print("Bir sayı giriniz :");
        int bulSayi = input.nextInt();
        for(int i : list){
            if (i < bulSayi){
                if (min > bulSayi - i){
                    min = bulSayi - i;
                    minYakin = i;
                }
            }else {
                
                if (max > i - bulSayi){
                    max = i - bulSayi;
                    maxYakin = i;
                }
            }
        }
        System.out.println(Arrays.toString(list)+ " Dizisin'de" +bulSayi+" Sayıdan kücük en yakın sayı : "+ minYakin);
        System.out.println(Arrays.toString(list)+ " Dizisin'de" +bulSayi+" Sayıdan büyük en yakın sayı : "+ maxYakin);
    }
}
