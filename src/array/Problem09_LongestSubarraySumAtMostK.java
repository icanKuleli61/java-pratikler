package array;

import java.util.Scanner;

public class Problem09_LongestSubarraySumAtMostK {
    /*
     Açıklama:
     Bir tamsayı dizisi (int[]) ve bir limit değeri (k) verilmektedir.
     Dizide bulunan ardışık (contiguous) alt dizilerden toplamı k değerinden
     küçük veya eşit olanlar arasındaki en uzun alt dizinin uzunluğunu
     bulan bir Java programı yazınız.

     Bu problem Sliding Window tekniği ile çözülebilir.

     Örnek:

     Input:
     arr = [2, 1, 5, 1, 3, 2]
     k = 7

     Output:
     3

     Açıklama:
     Toplamı 7 veya daha küçük olan alt diziler:

     [2,1] → toplam = 3
     [2,1,5] → toplam = 8 (geçersiz)
     [1,5,1] → toplam = 7
     [5,1] → toplam = 6
     [1,3,2] → toplam = 6

     En uzun geçerli alt dizi:

     [1,5,1] veya [1,3,2]

     uzunluk = 3

    */

    static int longestIncreasingSubarray(int[] arr, int k) {
        if (arr == null || arr.length == 0) return 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int sum = 0;
            for (int j = i; j< arr.length; j++) {
                sum += arr[j];
                if (sum <= k){
                    count++;
                }else {
                    if (count > maxCount){
                        maxCount = count;
                    }
                    break;
                }
            }
        }
        return maxCount;
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
        System.out.print("Toplamı hangi değerden kücük yada eşit olan dizi serisine bakılsın : ");
        int k = sc.nextInt();
        System.out.println(longestIncreasingSubarray(array,k));

        sc.close();
    }


}
