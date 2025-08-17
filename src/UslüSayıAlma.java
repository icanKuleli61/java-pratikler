import java.util.Scanner;

public class UslüSayıAlma {
    /** Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı yazıyoruz.

     Ödev
     Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı "For Döngüsü" kullanarak yapını
     */
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("----Üslü sayı alma programına hoş geldiniz----");
        double altSayi = 0,ustSayi = 0;
        double sResult =1;
        boolean isSayiKontrol = false;


        while(!isSayiKontrol){
            System.out.print("Üssü alınacak sayıyı giriniz  :");
            altSayi = input.nextInt();
            System.out.print("Üst olacak sayıyı giriniz  :");
            ustSayi = input.nextInt();
            if (ustSayi ==0 && altSayi ==0){
                System.out.println("Üst sayı ve alt sayı 0 olduğun'da tanımsızlık iceriyor.Lütfen farklı değerler veriniz");
                continue;
            } else if (altSayi == 0) {
                System.out.println("Sonuc :" +0);
                return;
            }
            isSayiKontrol = true;
        }
        if (ustSayi < 0){
            ustSayi *=-1;
            for (int i = 1; i <= ustSayi; i++) {
                sResult *= 1.0/altSayi;
            }
        }else {
            for (int i = 1; i <= ustSayi; i++) {
                sResult *= altSayi;
            }
        }

        System.out.println("Sonuc :" + sResult);
    }
}
