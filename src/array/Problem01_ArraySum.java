package array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem01_ArraySum {

    /**
     Açıklama

     Bir tamsayı dizisi (int[]) verilmektedir.
     Bu dizide bulunan tüm elemanların toplamını hesaplayan bir Java programı yazınız.

     Program diziyi baştan sona dolaşmalı ve her elemanı toplam değişkenine eklemelidir.

     Bu problem aşağıdaki konuların pekiştirilmesini amaçlar:

     Array kullanımı

     Döngüler (for loop)

     Temel algoritma mantığı

     Time Complexity analizi
     */

    static int sumArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i <arr.length ; i++) {
            sum += arr[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCheck = false;
        int arraySize;
        do {
            if (!isCheck){
                System.out.print("Kac karakterli dizi oluşturmak istersiniz : ");
                isCheck = true;
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
        System.out.println("Verdiğin dizi : "+ Arrays.toString(array) + "Bu dizinin toplamı "+ sumArray(array));
        sc.close();
    }

}
