import java.util.Scanner;

public class FibonacciSerisi {

    /** Fibonacci Serisi Nedir ?
     Fibonacci serisi, her sayının kendinden önceki ile toplanması sonucu oluşan bir sayı dizisidir. Bu şekilde devam eden bu dizide
     sayılar birbirleriyle oranlandığında altın oran ortaya çıkar, yani bir sayı kendisinden önceki sayıya bölündüğünde altın orana gittikçe yaklaşan bir dizi elde edilir.

     Fibonacci dizisi, 0'dan başlar ve sonsuza kadar. Her rakam, bir önceki rakamla toplanır. Elde edilen sonuç rakamın sağ tarafına
     yazılır. Fibonacci dizisinin ilk on sayısı şu şekildedir:

     9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34
     **/
    public static void main(String[] args){
        System.out.print("Kac elemanlı dizi istiyorsunuz :");
        int elemanSayi= new Scanner(System.in).nextInt();
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        for (int i = 1; i <= elemanSayi; i++) {
            int sum = a + b;
            System.out.print(sum + " ");
            a =b ;
            b =sum;
        }

    }
}
