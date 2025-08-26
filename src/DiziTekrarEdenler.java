import java.util.Arrays;

public class DiziTekrarEdenler {

   //Şimdi sıra sende! Bir sayı dizisindeki tekrar eden çift sayıları belirten bir program yaz.
    static boolean isBulundumu(int[] arr , int value){
        for(int k : arr){
            if (value == k){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args){


        int[] list = {1,3,44,5,6,4,5,12,3,2,8,9,8,1,4,5,55,44,6};
        int[] yeniList = new int[list.length];
        int starIndex = 0;
        for(int i = 0; i < list.length; i++){

            for(int j = 0; j < list.length; j++){
                if (i != j && list[i] == list[j] && list[j] %2 == 0){
                    if (!isBulundumu(yeniList, list[j])){
                        yeniList[starIndex++] = list[j];
                        break;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(yeniList));
    }
}
