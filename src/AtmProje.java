import java.util.Scanner;

public class AtmProje {

    public static void main(String[] args) {

        String usernameK = "ilyas", passwordK = "can";
        int yanlisDeneme = 3, bHesabiTutar = 10000;
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.print("Kullanıcı Adınız :");
            String username = input.nextLine().trim();
            System.out.print("Parolanız : ");
            String password = input.nextLine().trim();
            if (usernameK.equals(username) && passwordK.equals(password)) {
                int islemTutari;
                int yapilacakIslem;
                do {
                    System.out.println("----Merhaba,Bankaya Hoşgeldiniz!--------------");
                    System.out.println("""
                            Atm'de Yapmak istediğiniz işlemi seciniz
                            1-Para yatırma
                            2-Para Çekme
                            3-Bakiye Sorgula
                            4-Çıkış Yap""");
                    yapilacakIslem = input.nextInt();
                    if (!(yapilacakIslem >= 1 && yapilacakIslem <= 4)) {
                        System.out.println("Hatalı işlem secimi");
                        continue;
                    }
                    switch (yapilacakIslem) {
                        case 1:
                            System.out.print("Para miktarı : ");
                            islemTutari = input.nextInt();
                            bHesabiTutar += islemTutari;
                            System.out.println("Güncel Bakiyeniz : "+bHesabiTutar);
                            break;
                        case 2:
                            System.out.print("Cekmek istediğin miktar : ");
                            islemTutari = input.nextInt();
                            if (bHesabiTutar >= islemTutari) {
                                bHesabiTutar -= islemTutari;
                                System.out.println("İşleminiz Başarı ile gercekleşti Kalan tutar :" + bHesabiTutar);
                            } else {
                                System.out.println("Bakiyeniz mevcut değil bir daha deneyiniz Hesanınızdaki güncell bakiye :" + bHesabiTutar);
                                continue;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz : " + bHesabiTutar);
                            break;
                    }

                } while (yapilacakIslem != 4);
                System.out.println("Tekrar görüşmek üzere.");
                break;
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre. Tekrar deneyiniz.");
                yanlisDeneme--;

                if (yanlisDeneme == 0) {
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");
                }else {
                    System.out.println("Kalan Hakkınız : " + yanlisDeneme);
                }
            }
        }
    }
}
