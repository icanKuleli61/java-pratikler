package array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem05_TwoSum {

    /*
     Açıklama:
     Bir tamsayı dizisi (int[]) ve bir hedef sayı (target) verilmektedir.
     Dizide bulunan iki farklı elemanın toplamı target değerine eşit olan
     indeksleri bulan bir Java programı yazınız.

     Program diziyi dolaşarak iki sayının toplamının target değerine eşit
     olup olmadığını kontrol etmelidir.

     Eğer böyle iki sayı bulunursa bu sayıların indeksleri döndürülmelidir.

     Not:
     Aynı eleman iki kez kullanılamaz.

     Örnek:

     Input:
     nums = [2, 7, 11, 15]
     target = 9

     Output:
     [0, 1]

     Açıklama:
     nums[0] + nums[1] = 2 + 7 = 9

     Amaç:
     - Array traversal pratiği yapmak
     - Algoritma geliştirme becerisi kazanmak
     - Problem çözme mantığını geliştirmek
     */
    static void twoSum(int[] arr, int target) {
    boolean isFlag = false;
        for(int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                int sum = arr[i]  + arr[j];
                if(sum == target){
                    System.out.println("Verdiğin dizi'de " + (i+1)+". index ile "+(j+1)+". indexsin toplamı targata eşit -> " +target  );

                    isFlag = true;
                }
            }

        }
        if (!isFlag){
            System.out.println("verdiğin dizi'de 2 index'in toplamı target -> " + target + "Eşit olan sayılar yok.");
        }
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
        System.out.print("targetı giriniz : ");
        int target = sc.nextInt();
        twoSum(array,target);
        sc.close();
    }

}
