package array;

import java.util.Scanner;

public class Problem07_LongestIncreasingSubarray {
    /*
     Açıklama:
     Bir tamsayı dizisi (int[]) verilmektedir. Bu dizide bulunan
     ardışık (contiguous) ve artan (increasing) elemanlardan oluşan
     en uzun alt dizinin uzunluğunu bulan bir Java programı yazınız.

     Increasing subarray şu anlama gelir:
     Her eleman kendisinden önce gelen elemandan büyük olmalıdır.

     Örnek:

     Input:
     [1, 3, 5, 4, 7]

     Output:
     3

     Açıklama:
     En uzun artan alt dizi:

     [1, 3, 5]

     uzunluğu = 3

     Başka bir örnek:

     Input:
     [2, 2, 2, 2, 2]

     Output:
     1

     Çünkü hiçbir eleman kendinden önceki elemandan büyük değildir.
    */

    static int longestIncreasingSubarray(int[] arr){

        if (arr.length == 0 ) return 0;

        int maxCount = 0;
        int startCount =1;
        for (int i = 0; i < arr.length-1; i++){
            if (arr[i+1] > arr[i]){
                startCount++;
            }else {
                if (maxCount < startCount){
                    maxCount = startCount;
                }
                startCount = 1;
            }
            if (maxCount < startCount){
                maxCount = startCount;
            }
        }
        return maxCount;
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
        System.out.println(longestIncreasingSubarray(array));

        sc.close();
    }
}
