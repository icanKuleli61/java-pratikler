package array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem02_MinMaxArray {

        /***
     Problem 2: Dizideki En Büyük ve En Küçük Sayıyı Bulma

     Açıklama:
     Bir tamsayı dizisi verilmektedir. Bu dizide bulunan
     en büyük ve en küçük sayıyı bulan bir Java programı yazınız.

     Program diziyi yalnızca bir kez dolaşmalıdır.

     Örnek:
     Input:  [12, 7, 19, 3, 25, 4]
     Output:
     Max: 25
     Min: 3

     Amaç:
     - Array traversal
     - Karşılaştırma operatörleri
     - Algoritma geliştirme

     Time Complexity: O(n)
     Space Complexity: O(1)
    */

    static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++){
            int snapValue = arr[i];
            if (snapValue < min) min = snapValue;
            if (snapValue > max) max = snapValue;
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean showMessageFlag = false;
        int diziSize;
        do {
            if (!showMessageFlag) {
                System.out.print("Oluşturmak istediğiniz dizi boyutunu giriniz : ");
                showMessageFlag = true;
            } else {
                System.out.println("Dizi boyutu pozitif tam değerler almalı : ");
            }
            diziSize = sc.nextInt();
        }while (diziSize < 1);
        int[] array = new int[diziSize];
        for (int i = 0; i<array.length; i++){
            System.out.print("Dizinin " +(i+1) +". elemanını giriniz : ");
            array[i] = sc.nextInt();
            System.out.println();
        }
        int[] result =findMinMax(array);
        System.out.println(Arrays.toString(array) + "Verdiğiniz dizi'de min değer : " +result[0]+" Max değer : "+result[1]);
        sc.close();
    }
}
