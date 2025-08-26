import java.util.Scanner;

public class DiziIleBbas {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        String[][] sekilOl = new String[6][3];

        for (int i = 0; i < sekilOl.length; i++){
            for (int j = 0; j < sekilOl[i].length; j++){
                if (i == 0 && j == 2 || i == 5 && j == 2){
                    sekilOl[i][j] = "  ";
                }else if (i == 0 || i == 2 || i == 3  || i == 5){
                    sekilOl[i][j] = " * ";
                }else if (j == 0 || j ==2) {
                    sekilOl[i][j] = " * ";

                }else {
                    sekilOl[i][j] = "   ";
                }
            }
        }

        for (String[] row : sekilOl){
            for (String s : row){
                System.out.print(s + " ");
            }
            System.out.println();
        }
    }
}
