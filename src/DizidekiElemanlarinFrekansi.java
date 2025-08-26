import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


/**
 * Java dilinde, dizideki elemanların kaç kez tekrar edildiğini yani frekanslarını bulan programı yazınız.
 * <p>
 * Senaryo
 * Dizi : [10, 20, 20, 10, 10, 20, 5, 20]
 * Tekrar Sayıları
 * 10 sayısı 3 kere tekrar edildi.
 * 20 sayısı 4 kere tekrar edildi.
 * 5 sayısı 1 kere tekrar edildi.
 **/
public class DizidekiElemanlarinFrekansi {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Kac boyutlu dizi oluşturmak isterseniz : ");
        int boyut = input.nextInt();

        int[] list = new int[boyut];
        for (int i = 0; i < list.length; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanı nı giriniz :");
            list[i] = input.nextInt();
        }

        boolean[] isSayildi = new boolean[boyut];

        for (int i = 0; i < list.length; i++) {
            int sayac = 1;
            if (isSayildi[i]) continue;
            for (int j = i + 1; j < list.length; j++) {
                if (list[i] == list[j]) {
                    sayac ++;
                    isSayildi[j] = true;
                }
            }
            System.out.println(list[i] + " Sayası "+sayac + " kere tekrar edildi.");
        }
    }
}
