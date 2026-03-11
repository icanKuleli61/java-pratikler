package array;

import java.util.Scanner;

public class Problem06_MaxSubArray {

    /*
     Problem 6: Maximum Subarray Sum

     Açıklama:
     Bir tamsayı dizisi verilmektedir. Bu dizide bulunan
     ardışık (contiguous) elemanlardan oluşan alt diziler
     arasındaki en büyük toplamı bulan bir Java programı yazınız.

     Program dizideki tüm olası alt dizileri kontrol ederek
     en büyük toplamı bulmalıdır.

     Örnek:

     Input:
     [-2, 1, -3, 4, -1, 2, 1, -5, 4]

     Output:
     6
     Açıklama:
     En büyük toplam şu alt diziden gelir:

     [4, -1, 2, 1]

     4 + (-1) + 2 + 1 = 6
    */

    static int maxSubArray(int[] arr) {
        int maxSum= Integer.MIN_VALUE ;

        for (int i = 0; i < arr.length; i++) {
            int sum = arr[i];
            for (int j = i+1; j < arr.length;  j++ ) {
                if (maxSum < sum) maxSum = sum;
                sum += arr[j];
                if (maxSum < sum) maxSum = sum;
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {
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
        System.out.println(maxSubArray(array));

        sc.close();
    }
}
