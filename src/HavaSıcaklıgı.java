import java.util.Scanner;

public class HavaSıcaklıgı {

    /* Koşullar :

    Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
    Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
    Sıcaklık 10 ve 25 arasında ise "Piknik" etkinliğini öner.
    Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.
 */


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Bugünün Sıcaklığını giriniz :");
        int cDeger = input.nextInt();

        if (cDeger < 5) {
            System.out.println("Bugün kayak yapmalısınız.");
        } else if (cDeger <25) {
            if (cDeger < 15) System.out.println("Bugün Sinemaya gitmelisiniz.");
            if (cDeger >10) System.out.println("Bugün pinik yapmalısınız");

        }else System.out.println("Bugün yüzmeye gitmelisiniz.");

    }
}
