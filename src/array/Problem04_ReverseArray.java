package array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem04_ReverseArray {

    /*

     Açıklama:
     Bir tamsayı dizisi (int[]) verilmektedir. Bu dizinin elemanlarını
     yeni bir dizi oluşturmadan (in-place) ters çeviren bir Java programı yazınız.

     Program iki işaretçi (pointer) kullanarak dizinin başındaki ve sonundaki
     elemanları yer değiştirerek ilerlemelidir.

     */

    static int[] reverseArray(int[] arr){
        int right = 0;
        int left = arr.length-1;
        while (right<left){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            right++;
            left--;
        }
        return arr;
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

        System.out.println(Arrays.toString(array)+" dizisinin ters cevrilmiş hali -> "+ Arrays.toString(reverseArray(array)));
        sc.close();
    }
}
