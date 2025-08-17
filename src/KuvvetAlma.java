import java.util.Scanner;

public class KuvvetAlma {

    public static void main(String[] args){
        //Java döngüler ile girilen sayıya kadar olan 2'nin kuvvetlerini ekrana yazdıran programı yazıyoruz.
        Scanner input = new Scanner(System.in);


        System.out.print("Sınır sayısı giriniz :");
        int number = input.nextInt();
        /*
        int i =1;

        while (i<number){
            System.out.print(i+" ,");
            i *=2;
        }

         */

        //Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

        for (int i = 1, j =1 ; i <= number || j <= number; i *= 4 , j *=5){
            if (i == j){
                System.out.print(i+" ");
            }else System.out.print(i+" "+j+" ");
        }



    }
}
