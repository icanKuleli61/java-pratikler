import java.util.Scanner;

public class ÜsHesabıYapanProgram {

    /** Recursive Metotlar ile Üslü Sayı Hesaplama

     Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini "Recursive" metot kullanarak yapan programı yazınız.**/

    static int KuvvetAlma(int ust , int taban) {

        if (ust == 0){
            return 1 ;
        }else if (ust == 1){
            return taban;
        }

        return taban * KuvvetAlma(ust - 1, taban);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Taban değeri giriniz :");
        int taban = input.nextInt();
        System.out.print("Üs  değeri giriniz :");
        int ust = input.nextInt();

        int result =KuvvetAlma(ust,taban);
        System.out.println(result);

    }
}
