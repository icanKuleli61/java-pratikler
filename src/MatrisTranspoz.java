import java.util.Scanner;

    public class MatrisTranspoz {


    /** Matris Transpozunu Bulma
     Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

     Matrisin transpozunu (devriğini) almak, matrisin aynı numaralı satırları ile sütunlarının yer değiştirmesi demektir.
     Bu işlem sonucu elde edilen matris, başlangıçtaki matrisin transpozudur (devriğidir). Bu aşamada kxn’lik bir matrisin transpozu
     (devriği) nxk’lik bir matris olur. Örneğin bir A matrisimiz olsun. Bu A matrisinin transpozu (devriği), A^T (A üzeri T) ile gösterilir.

     Örneğin aşağıdaki 2x3’lik A matrisinin transpozu (devriği), 2x3’lük bir A^T matrisidir.**/
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.print("Matris satır sayısını giriniz : ");
        int n = input.nextInt();
        System.out.print("Matrisin sutun sayısını giriniz : ");
        int m = input.nextInt();
        int[][] matriss = new int[n][m];
        int[][] transpose = new int[m][n];

        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                System.out.print("Matrisin " +i+ ". satır "+j +" sutun elemanını giriniz : ");
                matriss[i][j] = input.nextInt();
            }
        }
        for(int[] satir : matriss){
            for(int row : satir){
                System.out.print(row + " ");
            }
            System.out.println();
        }


        System.out.println();
        System.out.println("---------------------------");
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                transpose[j][i] = matriss[i][j];
            }
        }

        for(int[] satir1 : transpose){
            for(int row1 : satir1){
                System.out.print(row1 + " ");
            }
            System.out.println();
        }

    }
}
