import java.util.Arrays;
import java.util.Scanner;

public class DiziOrtalamaBul {

    static int ortalamaHesap(int[] arr){
        int result=0;
        for (int i : arr){
            result += i;
        }
        return result/arr.length;
    }

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        System.out.print("Kac elemanlı dizi girmek istiyorsunuz : ");
        int[] arr = new int[input.nextInt()];

        for(int i = 0; i < arr.length; i++){
            System.out.print("Dizinin "+ (i+1) +". elemanı'nı giriniz :");
            arr[i] = input.nextInt();
        }

        int ortalamaResult = ortalamaHesap(arr);
        System.out.println(Arrays.toString(arr) + "Dizisinin ortalaması :"+ ortalamaResult);
    }
}
