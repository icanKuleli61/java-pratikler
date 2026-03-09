package array;

import java.util.Arrays;
import java.util.Scanner;

public class Problem03_ExtractEvenNumbers {


    /*

     Açıklama:
     Bir tamsayı dizisi (int[]) verilmektedir. Bu dizide bulunan tüm
     çift sayıları tespit eden ve bu sayıları yeni bir diziye yerleştiren
     bir Java programı yazınız.

     Program şu adımları uygulamalıdır:
     1. Verilen diziyi dolaşarak kaç tane çift sayı olduğunu tespit et.
     2. Bu sayı kadar boyuta sahip yeni bir dizi oluştur.
     3. Diziyi tekrar dolaşarak çift sayıları yeni diziye ekle.
     4. Sonuç dizisini ekrana yazdır.

     Not:
     Bu problemde ArrayList kullanılmamalıdır. Amaç, sabit boyutlu
     dizilerle çalışarak algoritma mantığını geliştirmektir.

     Örnek:

     Input:
     [3, 8, 11, 6, 7, 10]

     Output:
     [8, 6, 10]

     Amaç:
     - Array traversal pratiği yapmak
     - Koşul kontrolü (modulus operator %)
     - Yeni dizi oluşturma
     - Algoritmik düşünme geliştirme


    */
    static int[] extractEvenNumbers(int[] array) {
        int countTwo = isCountTwo(array);
        if (countTwo < 1) {
            System.out.println("Dizi'de cift eleman bulunmuyor. ");
            throw new RuntimeException("Dizi'de cift eleman bulunmuyor. ");
        }
        int[] newResult = new int[countTwo];
        for (int i = 0,j=0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                newResult[j] = array[i];
                j++;
            }
        }
        return newResult;
    }

    static int isCountTwo(int[] array) {
        int count = 0;
        for (int i : array) {
            if (i % 2 == 0) {
                count++;
            }
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

        System.out.println("Verdiğin dizi : "+ Arrays.toString(array) + " Ciftleri ayrılmış dizi -> " + Arrays.toString(extractEvenNumbers(array)));

        sc.close();
    }
}
