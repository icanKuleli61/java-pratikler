import java.util.Scanner;

public class UcgenHipotenus {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        int aKenari , bKenari;
        double hipotenus;

        KullaniciMesaj("Ücgen'de birinci kenarı giriniz : ");
        aKenari = input.nextInt();
        KullaniciMesaj("Ücgen'de ikinci kenarı giriniz : ");
        bKenari = input.nextInt();

        hipotenus = Math.sqrt(aKenari*aKenari + bKenari*bKenari);
        KullaniciMesaj("Dik ücgeninin Hipotenüsü  : " + hipotenus);
    }

    public static void KullaniciMesaj(String mesaj){
        System.out.print(mesaj);
    }
}
