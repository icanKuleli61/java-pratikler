import java.util.Scanner;

public class ArmstrongSayı {
    /**
     Armstrong Sayı Nedir ?
     N haneli bir sayının basamaklarının n’inci üstlerinin toplamı, sayının kendisine eşitse, böyle sayılara Armstrong sayı denir.

     Örneğin 407 sayısını ele alalım. (4^3)+ (0^3)+(7^3) = 64+0+343 = 407 sonucunu verir. Bu da 407 sayısının armstrong bir sayı olduğunu gösterir.

     1342 sayısına da bakalım. (1^4)+(3^4)+(4^4)+(2^4) =1+81+256+16=354 sayısı 1342’ye eşit olmadığı için armstrong sayı olmaz.

     1634=1^4+6^4+3^4+4^4=1+1296+81+256=1634

     54748=5^5+4^5+7^5+4^5+8^5=3125+1024+16807+1024+32768=54748
     */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int numberLegth ,numberResult=0,sayiBasamak,toIntnumber,basamakDegeri=1;
        System.out.print("Armastrong Sayı olup olmadığını kontrol etmek icin sayı giriniz :");
        String number = input.nextLine();
        numberLegth = number.length();
        toIntnumber = Integer.parseInt(number.trim());
        if (numberLegth == 1){
            System.out.println(number+" Bir Armastrog sayıdır." );
            return;
        }
        for (int i=1 ; i<=numberLegth ; i++){
            basamakDegeri =1 ;
            sayiBasamak = toIntnumber % 10;
            toIntnumber = toIntnumber /10;
            for (int j=1 ; j<=numberLegth ; j++){
                basamakDegeri *= sayiBasamak;
            }
            numberResult += basamakDegeri;
        }
        if (numberResult == Integer.parseInt(number)){
            System.out.println(numberResult+" Bir Armastrog sayıdır." );
        }else System.out.println(numberResult+" Bir Armastrog sayı değildir..." );
    }
}
