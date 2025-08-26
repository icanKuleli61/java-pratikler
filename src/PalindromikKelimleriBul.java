import java.util.Scanner;

public class PalindromikKelimleriBul {

    /**
     Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".
     Örnek : abba , asa , kavak, kayak
     **/
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Palindrom kelime kontrolü icin bir kelime giriniz :");

        String kelime =input.nextLine().trim();
        String yeniKelime = "";

        for (int i = kelime.length()-1; 0<=i; i--){
            yeniKelime += kelime.charAt(i);
        }

        if (kelime.equals(yeniKelime)){
            System.out.println("Girilen " + kelime +" bir palindromik kelimedir.");
        }else {
            System.out.println("Girilen '" + kelime +"' bir palindromik kelime değildir.");
        }
    }
}
