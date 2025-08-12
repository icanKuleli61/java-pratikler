import java.util.Scanner;

public class KullanıcıGirisi {

    /*Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun, eğer kullanıcı sıfırlamak isterse
     yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip, şifreler aynı ise ekrana "Şifre oluşturulamadı
     , lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String kName = "ilyas",kPasword ="Can123456",iName,iPasword;

        System.out.println("----Hoşgeldiniz---\nGiriş icin");
        System.out.print("Kullanıcı adınızı giriniz :");
        iName = input.nextLine();
        System.out.print("Şifrenizi giriniz :");
        iPasword = input.nextLine();


        if (kName.equals(iName) ) {

            if (kPasword.equals(iPasword)) {
                System.out.println("Başarı ile giriş yaptınız");
            }else {
                System.out.println("Şifrenizi yanlış girdiniz");
            }
        }else {
            System.out.println("Kullanıcı Adınızı Yanlış Girdiniz.");
        }

    }
}
