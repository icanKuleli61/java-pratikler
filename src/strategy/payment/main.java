package strategy.payment;

import java.util.Scanner;

public class main {

    /*
    Açıklama:
    Bir ödeme sistemi geliştirilmektedir. Kullanıcılar farklı ödeme
    yöntemleri ile ödeme yapabilmelidir.
    Desteklenen ödeme türleri şunlardır:

    - Credit Card
    - PayPal
    - Crypto

    Program çalıştığında kullanıcı ödeme yöntemini seçer ve ödeme işlemi
    seçilen yönteme göre gerçekleştirilir.

    Önemli:

    Ödeme yöntemleri arasında seçim yapılırken if-else veya switch-case
    kullanılmamalıdır.

    Bunun yerine her ödeme yöntemi ayrı bir algoritma olarak tasarlanmalı
    ve çalışma zamanında (runtime) seçilebilmelidir.

    Bu problemde Strategy Pattern kullanılması beklenmektedir.

    Amaç:

    Farklı ödeme algoritmalarını birbirinden ayırarak
    esnek ve genişletilebilir bir sistem tasarlamak.

    Örnek:

    Input:
    paymentType = "credit"
    amount = 100

    Output:
    Credit Card ile 100 TL ödeme yapıldı.


    Input:
    paymentType = "paypal"
    amount = 250

    Output:
    PayPal ile 250 TL ödeme yapıldı.


    Input:
    paymentType = "crypto"
    amount = 500

    Output:
    Crypto ile 500 TL ödeme yapıldı.


    Beklenen:

    Program yeni bir ödeme yöntemi eklendiğinde
    mevcut kodu değiştirmeden genişletilebilmelidir.

    Sana Bir Seviye Üstü Challenge

    Şu switch’i kaldırabilir misin?

    switch(secim)

    yerine şu yapı:

    Map<Integer, IPayment>

    mesela:

    1 → CreditCard
    2 → Crypto
    3 → PayPal

    ve sonra:

    strategy = map.get(secim)

    Bu seni bir üst seviyeye çıkarır.

    */
    private static int checkPay(boolean flag){
        Scanner input = new Scanner(System.in);
        int secim;
        do {
            if (!flag){
                System.out.println("Ödeme tipini seciniz\n 1-Kredi kartı\n 2-Kripto\n 3-Paypay");
                flag = true;
            }else {
                System.out.println("Hatalı bir değer girdiniz lütfen tekrar deneyiniz");
                System.out.println("Ödeme tipini seciniz\n 1-Kredi kartı\n 2-Kripto\n 3-Paypay");
            }
            System.out.print("Secim : ");
            secim = input.nextInt();
        }while (secim <= 0 || secim >=4 );
        return secim;
    }

    private static int checkAmount(boolean flag){
        Scanner input = new Scanner(System.in);
        int amount;
        do {
            if (!flag){
                System.out.print("Para yatırma miktarını giriniz : ");
                flag = true;
            }else {
                System.out.print("Para yatırma miktarını 0'dan büyük bir değer olmalı.Lütfen tekrar deneyiniz :");
            }
            amount = input.nextInt();
        }while (amount <0);
        return amount;
    }

    public static void main(String[] args){

        System.out.println("Ödeme ekranı'na hoşgeldiniz");
        boolean flag = false;
        int secim = checkPay(flag);
        flag = false;
        int amount = checkAmount(flag);
        switch (secim) {
            case 1:
                new PaymentService(new CreditCard()).pay(amount);
                break;
                case 2:
                    new PaymentService(new Crypto()).pay(amount);
                    break;
                    case 3:
                        new PaymentService(new PayPal()).pay(amount);
                        break;
        }


    }
}
