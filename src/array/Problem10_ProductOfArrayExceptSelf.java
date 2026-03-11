package array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem10_ProductOfArrayExceptSelf {

    /*

     Açıklama:
     Bir tamsayı dizisi (int[]) verilmektedir. Her index için,
     o indexteki eleman hariç diğer tüm elemanların çarpımını
     hesaplayan bir dizi döndüren bir Java programı yazınız.

     Not:
     Bölme işlemi kullanılamaz.

     Örnek:

     Input:
     arr = [1,2,3,4]

     Output:
     [24,12,8,6]

     Açıklama:
     index 0 → 2*3*4 = 24
     index 1 → 1*3*4 = 12
     index 2 → 1*2*4 = 8
     index 3 → 1*2*3 = 6
    */


    static int[] productExceptSelf(int[] arr){
        int [] newExceptArr = new int[arr.length];
        for (int i = 0 ; i < arr.length ; i++){
            int carp = 1;
            for (int j = 0 ; j < arr.length ; j++){
                if (j == i){
                    continue;
                }
                carp *= arr[j];
            }
            newExceptArr[i] = carp;
        }
        return newExceptArr;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean showMessageFlag = false;
        int arraySize;
        do {
            if (!showMessageFlag){
                System.out.print("Kac karakterli dizi oluşturmak istersiniz : ");
                showMessageFlag = true;
            }else {
                System.out.println("Dizi boyutu pozitif tam değerler almalı : ");
            }
            arraySize = sc.nextInt();
            System.out.println();
        }while (arraySize <1);
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length ; i++) {
            System.out.print("Dizinin " +(i+1) +". elemanını giriniz : ");
            array[i] = sc.nextInt();
            System.out.println();
        }
        System.out.println(Arrays.toString(productExceptSelf(array)));

        sc.close();
    }
}
