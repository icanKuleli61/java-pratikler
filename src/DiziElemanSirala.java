import java.util.Arrays;
import java.util.Scanner;

public class DiziElemanSirala {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dizinin boyutu kac olacak : ");
        int boyut = input.nextInt();

        int[] list = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.print((i + 1) + ". elemanı giriniz  : ");
            list[i] = input.nextInt();
        }

        for (int i = 0; i < list.length -1 ; i++) {
            int minIndex =i;
            for (int j = i+1; j < list.length; j++) {
                if (list[j] < list[minIndex]){
                    minIndex = j;
                }
            }

            int tutucu =  list[i];
            list[i] = list[minIndex];
            list[minIndex] = tutucu;
        }

        System.out.print(Arrays.toString(list));

    }

}
