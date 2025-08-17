import java.util.Scanner;

public class AsalSayıBulanProgram {

    /**

     * dilinde "Recursive" metot kullanarak, kullanıcıdan alınan sayının "Asal" sayı olup olmadığını bulan programı yazın.

     **/

    static boolean isAsal(int number,int i){
        if(number <= 2){
            return (number == 2);
        }

        if (number%i == 0){
            return false;
        }
        if (i * i > number){
            return true;
        }

        return isAsal(number,i+1);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Hangi sayıyı kontrol etmek istiyorsunuz :");
        int number = input.nextInt();
        int i = 2;

        boolean result = isAsal(number,i);
        if (result){
            System.out.println(number +" Bir asal sayıdır.");
        }else {
            System.out.println(number +" Bir asal sayı değildir.");
        }


    }
}
