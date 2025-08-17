import java.util.Scanner;

public class FaktoriyelHesaplama {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        /*Java ile faktöriyel hesaplayan program yazıyoruz.

        boolean isPozitif = false;
        int  number = 1;
        int faktoriyel = 1;
        while (!isPozitif){
            System.out.print("Hangi sayının faktoriyelini almak istiyorsunuz lütfen pozitif değer giriniz :");
            number = input.nextInt();
            if (number>0) isPozitif = true;
        }

        for(int i=number; 1<i ;i--){
            faktoriyel *=i;
        }
        System.out.print(number +" Sayısının faktoriyeli :" + faktoriyel);

         */

        /**
         N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların sayısı n’in r’li kombinasyonu olarak adlandırılır.
         N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.

         Java ile kombinasyon hesaplayan program yazınız.

         Kombinasyon formülü
         C(n,r) = n! / (r! * (n-r)!)
         **/

        System.out.println("Kombinasyon bu formul ile hepsaplanır. C(n,r) = n! / (r! * (n-r)!)   n sayısı r'den büyük olmak zorun'Da ");
        System.out.println("Pozitif bir n sayısı giriniz : ");
        int n = input.nextInt();
        System.out.println("Pozitif bir r sayısı giriniz :");
        int r = input.nextInt();

        int kombinasyon = FaktoriyelHesapla(n) / (FaktoriyelHesapla(r) * (FaktoriyelHesapla(n-r)));
        System.out.print("Kombinasyon Sonucu :" + kombinasyon);



    }

    public static int FaktoriyelHesapla(int number) {
        int deger =1;
        for (int i = 1; i <= number; i++){
            deger *= i;
        }
        return deger;
    }


}

