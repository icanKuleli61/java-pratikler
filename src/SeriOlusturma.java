import java.util.Scanner;

public class SeriOlusturma {
    /**
     Soru: Seriler Oluşturma

     Senin görevin, kullanıcının girdiği değerleri kullanarak tam sayılardan oluşan seriler üretmek.

     Giriş Biçimi

     İlk satır, kaç tane sorgu (test case) olduğunu belirten bir tam sayı t.

     Sonraki t satırın her biri üç boşlukla ayrılmış tam sayı içerir: a b n

     Açıklama

     a → başlangıç değeri

     b → çarpan

     n → o sorgu için üretilmesi gereken terim sayısı

     Her sorgu için seri şu şekilde oluşturulur:
     */

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Kac tane sorgu var :");
        int sorgu = input.nextInt();

        for(int i=1 ; i<=sorgu ; i++){
            System.out.print(i+". sorgu icin Başlangıc değeri :");
            int a = input.nextInt();
            System.out.print(i+". sorgu icin carpan değeri :");
            int b = input.nextInt();
            System.out.print(i+". sorgu icin üretilecek terim sayısı :");
            int n = input.nextInt();
            int degerBaslangic = a;
            for (int j=0 ; j<n ; j++){

                degerBaslangic += (int) (b * Math.pow(2,j));
                System.out.print(degerBaslangic+" ");
            }
            System.out.println();
        }
    }


}
