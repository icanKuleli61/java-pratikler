package array;

import java.util.Scanner;

public class Problem08_MaximumSumSubarrayOfSizeK {
    /*
     Problem 8: Maximum Sum Subarray of Size K

     Açıklama:
     Bir tamsayı dizisi (int[]) ve bir pencere boyutu (k) verilmektedir.
     Dizide bulunan ve uzunluğu k olan tüm ardışık alt diziler (subarray)
     arasındaki en büyük toplamı bulan bir Java programı yazınız.

     Program diziyi dolaşarak uzunluğu k olan tüm alt dizileri kontrol etmeli
     ve bu alt diziler arasında en büyük toplamı bulmalıdır.

     Örnek:

     Input:
     arr = [2, 1, 5, 1, 3, 2]
     k = 3

     Output:
     9
     Açıklama:
     Uzunluğu 3 olan alt diziler:

     [2,1,5] → toplam = 8
     [1,5,1] → toplam = 7
     [5,1,3] → toplam = 9
     [1,3,2] → toplam = 6

     En büyük toplam = 9
    */

    static int maxSumSubarray(int[] arr,int k){
        if (arr == null || arr.length == 0) return 0;
        if (k > arr.length) throw new IllegalArgumentException();
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length -k; i++ ){
            int sum=arr[i];
            for (int j = i + 1; j < i+k ; j++){
                sum+=arr[j];
            }
            if (maxsum< sum){
                maxsum=sum;
            }
        }
        return maxsum;
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
        System.out.print("hangi aralıkda dizilere ayırmak istersiniz : ");
        int k = sc.nextInt();
        System.out.println(maxSumSubarray(array,k));

        sc.close();
    }

}
