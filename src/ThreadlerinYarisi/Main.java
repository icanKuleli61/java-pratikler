package ThreadlerinYarisi;

import java.util.ArrayList;
import java.util.List;

public class Main {

    /*
     Ödev - Threadlerin Yarışı
    1'den 10000 (10 bin)'e kadar olan sayılardan oluşan bir ArrayList oluşturunuz. Ardından, bu ArrayList'teki 10 bin elemanı 2500
     eleman olacak şekilde 4 eşit parçaya ayırınız. Bu 4 ayrı 2500 elemanlık ArrayList'ler içinde tek ve çift sayıları bulan 4 ayrı Thread tasarlayınız.

    4 Thread bulduğu çift sayıları ortak bir ArrayList'e ekleyecektir.

    4 Thread bulduğu tek sayıları ortak bir ArrayList'e ekleyecektir.

    Tek ve çift sayıları tutan ArrayList'ler ilk oluşturulduklarında boş olacaklardır. Ve iki tane ArrayList olacaklardır.

    4 Thread kendine ait 2500 elemanlık ArrayList'i işlemeye başlayınca tek ve çift sayı ArrayList'lerini dolduracaktır.

     */

    public static void main(String[] args) throws InterruptedException {

        List<Integer> sayilar = new ArrayList<>();
        List<Integer> part1 = new ArrayList<>();
        List<Integer> part2 = new ArrayList<>();
        List<Integer> part3 = new ArrayList<>();
        List<Integer> part4 = new ArrayList<>();
        for (int i = 1 ; i <= 10000 ; i++){
            sayilar.add(i);
        }

        part1 = sayilar.subList(0,2500);
        part2 = sayilar.subList(2500,5000);
        part3 = sayilar.subList(5000,7500);
        part4 = sayilar.subList(7500,10000);

        ThreadlerinYarisi th1 = new ThreadlerinYarisi(part1);
        ThreadlerinYarisi th2 = new ThreadlerinYarisi(part2);
        ThreadlerinYarisi th3 = new ThreadlerinYarisi(part3);
        ThreadlerinYarisi th4 = new ThreadlerinYarisi(part4);

        Thread t1 = new  Thread(th1);
        Thread t2 = new  Thread(th2);
        Thread t3 = new  Thread(th3);
        Thread t4 = new  Thread(th4);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

        t1.join();
        t2.join();
        t3.join();
        t4.join();


        for (Integer i : th1.ciftsayilar){
            System.out.print(i+ " ");
        }

        System.out.println();

        for (Integer i : th1.teksayilar){
            System.out.print(i+ " ");
        }






    }
}
