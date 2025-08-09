import java.util.Scanner;

public class KdvHesaplama {

    public  static float KDV_ORANİ = 0.18f;
    public static float kdvTutar,kdvToplamTutar;
    public static int ücret;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        KullaniciMesaj("Kdv'sini hesaplamak istediğiniz ücret tutarını giriniz  :");

        ücret = input.nextInt();
        KullaniciMesaj("Kdv oranınız " + KDV_ORANİ +  "\n Kdv Oranını değiştirmek isterseniz 1 " +
                "Oranı değiştirmeden devam etmek icin 2  :");

        int secim = input.nextInt();

        if(secim==1){
            KullaniciMesaj("Kdv oranı'nı giriniz :  örneğin = 0,24 ");
            KDV_ORANİ = input.nextFloat();
        }

        kdvTutar = ücret * KDV_ORANİ;
        kdvToplamTutar = kdvTutar + ücret;

        KullaniciMesaj("Kdv oranı : " + KDV_ORANİ +"\n ücretinizin kdv tutarı :"+ kdvTutar +"\n KDV'li tutarınız : " + kdvToplamTutar);


    }

    public static void KullaniciMesaj(String mesaj){
        System.out.print(mesaj);
    }


}
