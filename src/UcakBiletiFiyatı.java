import java.util.Scanner;

public class UcakBiletiFiyatı {


    /**
     Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın. Kullanıcıdan Mesafe (KM), yaşı
    ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın. Mesafe başına ücret 0,10 TL / km olarak alın.
     İlk olarak uçuşun toplam fiyatını hesaplayın ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;

    Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde kullanıcıya
    Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
    Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
    Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
    Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
    Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.**/

    public static void main(String[] args){

        int mesafeKm,yolculukTipi,yas;
        float mesafeBasıUcret =0.10f,biletIndirim,yasIndirimOrani=1f,normalTutar,yasIndirimi,toplamTutar,indirimTuyar;

        Scanner input = new Scanner(System.in);

        System.out.println("Havalima ücret tarifesi hesaplama programına Hoşgeldiniz");
        System.out.println("-----Tarife Ücretleri Hesaplanışı-----");
        System.out.println("* Mesafe başına ücret 0,10 TL / km\n*Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.\n*Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.\n*Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.\n*Kişi \"Yolculuk Tipini\" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.\n-------------------");


        do {

            System.out.print("Gitmez istediğiniz yerin Km'sini giriniz :");
            mesafeKm = input.nextInt();
            if (mesafeKm <= 0)System.out.println("Mesafe negatif olamaz tekrar deneyiniz");

        } while (mesafeKm <= 0);
        do {
            System.out.print("Bilet Almak istediğiniz kişinin Yaşını giriniz :");
            yas = input.nextInt();
            if (yas <= 0){
                System.out.println("Yaş değeri pozitif olmalıdır tekrar deneyiniz");
            }
        }while (yas <= 0);
        do {
            System.out.print("Yolculuk tipi --Gidiş icin ---->1 --Gidiş-Geliş icin ----->2 giriniz   :");
            yolculukTipi = input.nextInt();
            if (yolculukTipi <=0 || yolculukTipi >2 ){
                System.out.println("Yolculuk Tipi 1 veya 2 değerini alabilir lütfen tekrar deneyiniz");
            }
        }while (yolculukTipi <=0 || yolculukTipi >2 );

        if (yas <12){
            yasIndirimOrani = 0.50f;
        }else if (yas > 12 && yas <= 24) {
            yasIndirimOrani = 0.10f;}
        else if (yas >=64)
        { yasIndirimOrani = 0.30f;}



        normalTutar = mesafeKm * mesafeBasıUcret;
        yasIndirimi = normalTutar * yasIndirimOrani;
        indirimTuyar = normalTutar - yasIndirimi;
        if (yolculukTipi == 2 ) {
            biletIndirim = indirimTuyar * 0.20f;
            toplamTutar = normalTutar - indirimTuyar;
            System.out.println("İndirimsiz tutar :" +normalTutar+"TL\nYaş indirimi :" +yasIndirimi+
                    "TL\nGidiş dönüş sebebi ile uygulanan indirim :"+biletIndirim+"TL\nToplam Tutar : " + toplamTutar+"TL");
        }else{
            toplamTutar = indirimTuyar;
            System.out.println("İndirimsiz tutar :" +normalTutar+"TL\nYaş indirimi :" +yasIndirimi+"TL\nToplam Tutar : " + toplamTutar+"TL");
        }


    }
}
