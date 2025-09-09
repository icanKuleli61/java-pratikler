import java.util.ArrayList;
import java.util.Scanner;

public class DynamicMatrix {
/* Görev:

İlk olarak kullanıcıdan matriste kaç satır olacağını isteyin.

Her satır için önce kaç sütun olacağını sorun.

Kullanıcıdan girilen elemanları okuyup, o satıra ekleyin.

Her satırın sütun sayısı farklı olabilir.

Tüm satırlar girildikten sonra matrisi ekrana yazdırın. */
    static ArrayList<Integer> row;
    public  static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();

        System.out.print("Matriks'de kac satır eleman olacak : ");
        int rows = scan.nextInt();

        for(int i = 0; i < rows; i++) {
            System.out.print((i+1)+". Satırda kac sutun olsun :");
            int colm = scan.nextInt();
            row = new ArrayList<>();
            for(int j = 0; j < colm; j++) {
                System.out.print((i+1)+". satır "+(j+1)+". sutun elemeanını giriniz lütfen :");
                row.add(scan.nextInt());
            }
            matrix.add(row);
        }

        for(ArrayList<Integer> i : matrix){
            for (int j : i) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
