package array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem11_SubarraySumEqualsK {

    /*
     Problem 11: Subarray Sum Equals K

     Açıklama:
     Bir tamsayı dizisi (int[]) ve bir hedef değer (k) verilmektedir.
     Dizide bulunan ardışık (contiguous) alt dizilerden toplamı k olan
     kaç tane subarray olduğunu bulan bir Java programı yazınız.

     Örnek:

     Input:
     arr = [1,1,1]
     k = 2

     Output:
     2

     Açıklama:
     [1,1] (index 0-1)
     [1,1] (index 1-2)

     toplamı 2 olan 2 farklı subarray vardır.

     Başka örnek:

     Input:
     arr = [1,2,3]
     k = 3

     Output:
     2

     Açıklama:
     [1,2] ve [3]
    */

    static int subArraySum(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            int sum = nums[i];
            if (sum == k) {
                count++;
            }
            for (int j = i + 1; j < nums.length; j++) {
                sum += nums[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    static int subArraySum2(int[] nums, int k) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int count = 0;
        int sum = 0;

        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
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
        sc.nextLine();
        System.out.print("Alt dizilerin toplamı hangi sayıya eşit olmalı : ");
        int k = sc.nextInt();
        System.out.println("Alt dizilerin toplamı K ya eşit olan alt kümeler sayısı "+ subArraySum2(array, k) );

        sc.close();
    }
}
