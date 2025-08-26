import java.util.Scanner;

public class NegatifAltDiziler {
    //Tüm bitişik alt dizileri dene, toplamı negatifse say

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Matrisin boyutunu giriniz :");
        int matrisBoyut = input.nextInt();

        int[] matris = new int[matrisBoyut];
        for (int i = 0; i < matrisBoyut; i++) {
            System.out.print((i + 1) + ". elemanını giriniz : ");
            matris[i] = input.nextInt();
        }
        for (int i : matris) {
            System.out.print(i + " ");
        }
        System.out.println();
        int sayac = 0;
        for (int i = 0; i < matrisBoyut; i++) {
            int toplam = 0;
            for (int j = i; j < matrisBoyut; j++) {

                toplam += matris[j];
                if (toplam < 0) {
                    sayac++;
                }

            }

        }
        System.out.println("Toplamaları negatif olan alt küme sayısı :" +sayac);
    }
}
