import java.util.Scanner;

public class Fibonacci {


    //Java'da recursive metotlar ile fibonacci serisi bulan program yapıyoruz.

    static int fibonacci(int n){
        if (n == 0 ){
            return 0;
        }else if (n == 1){
            return 1;
        }

        return fibonacci(n-1) + fibonacci(n-2);
    }
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("fabonacci'sini bulmak istediğiniz sayıyı giriniz :");
        int number = input.nextInt();
        int b = fibonacci(number);
        System.out.println("Sonuc : " + b);
    }
}
