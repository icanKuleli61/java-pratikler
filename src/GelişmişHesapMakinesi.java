import java.util.Scanner;

public class GelişmişHesapMakinesi {
    static Scanner input = new Scanner(System.in);

    static int plus() {
        int number, toplama = 0;
        while (true) {
            System.out.print("0 girince işlemi bitirmiş olursunuz.Şimdi Toplamak istediğiniz sayıyı giriniz :");
            number = input.nextInt();
            if (number != 0) {
                toplama += number;
            } else {
                break;
            }
        }
        return toplama;
    }

    static int minus() {
        int number, cikarma = 0;
        while (true) {
            System.out.print("0 girince işlemi bitirmiş olursunuz.Şimdi cıkarmak istediğiniz  sayıyı giriniz :");
            number = input.nextInt();
            if (number != 0) {
                cikarma -= number;
            } else {
                break;
            }
        }
        return cikarma;
    }
    static int multiplication(){
        int number, carpma =1 ;
        while (true) {
            System.out.print("0 girince işlemi bitirmiş olursunuz.Şimdi carpmak istediğiniz  sayıyı giriniz :");
            number = input.nextInt();
            if (number != 0) {
                carpma *= number;
            }else  {
                break;
            }
        }
        return carpma;
    }
    static double divide(){
        int number ,i=1;
        double bolme = 1;
        while (true) {
            System.out.print("0 girince işlemi bitirmiş olursunuz.Şimdi bölmek istediğiniz  sayıyı giriniz :");
            number = input.nextInt();
            if (number != 0) {
                if (i==1){
                    i++;
                    bolme = number;
                }else {
                    bolme /= number;
                }
            }else  {
                break;
            }
        }
        return bolme;
    }
    static int UstAlma(){
        System.out.print("Üstünü almak istediğiniz sayıyı giriniz :");
        int taban = input.nextInt();
        System.out.print("üsttünüz giriniz :");
        int ust = input.nextInt();
        int result =1;
        for (int i = 1; i < ust; i++) {
            result *= taban;
        }
        return result;

    }

    static int FaktoriyelHesapla(int b) {
        if (b == 1) {
            return 1;
        }
        return b*FaktoriyelHesapla(b-1);
    }
    static int ModAlma() {
        System.out.print("Mod almak istediğiniz sayıyı giriniz :");
        int modSayi = input.nextInt();
        System.out.print("Hangi sayıyı göre modu alınacak :");
        int hangiMod  = input.nextInt();
        return modSayi%hangiMod;
    }

    static void DiktortgenAlanCevre(){
        System.out.print("Dikdörtgenin uzun kenarı :");
        int uzunKenar = input.nextInt();
        System.out.print("Dikdörtgenin kısa kenarı :");
        int kisa = input.nextInt();

        System.out.println("Dikdörtgenin alanı :" + (kisa*uzunKenar) + " Çevresi :" + ((uzunKenar*2)+(kisa*2)));

    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int result;
        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme işlemi
                5- Üslü Sayı Hesaplama
                6- Faktoriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap
                Menu Secimi yapınız :""";
        boolean isMenu = false;
        while (!isMenu) {
            System.out.print(menu);
            int menuSecimi = input.nextInt();
            if (menuSecimi >= 0 && menuSecimi <= 8) {
                switch (menuSecimi) {
                    case 0:
                        System.out.println("Cıkış yaptınız , görüşürüz.");
                        isMenu = true;
                        break;
                    case 1:
                        result = plus();
                        System.out.println("Sonuc : " + result);
                        break;
                    case 2:
                        result = minus();
                        System.out.println("Sonuc : " + result);
                        break;
                    case 3:
                        result = multiplication();
                        System.out.println("Sonuc : " + result);
                        break;
                    case 4:
                        Double sonuc = divide();
                        System.out.println("Sonuc : " + sonuc);
                        break;
                    case 5:
                        result = UstAlma();
                        System.out.println("Sonuc : " + result);
                        break;
                    case 6:
                        System.out.print("Hangi sayının faktoriyelini hesaplamak istiyorsunuz :");
                        int n = input.nextInt();
                        result = FaktoriyelHesapla(n);
                        System.out.println("Sonuc : " + result);
                        break;
                    case 7:
                        result = ModAlma();
                        System.out.println("Sonuc : " + result);
                        break;
                    case 8:
                        DiktortgenAlanCevre();
                        break;

                }
            } else {
                System.out.print("Doğru menu secimi yapılmadı tekrar deneyiniz");

            }

        }
    }
}