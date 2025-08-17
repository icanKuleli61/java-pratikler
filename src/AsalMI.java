public class AsalMI {


    /** Ödev - 1-100 Arasındaki Asal Sayıları Bulan Program
     Java ile 1 - 100 arasındaki asal sayıları ekrana yazdıran programı yazınız.
     **/
    public static void main(String[] args){

        for (int i =2 ; i <=100 ; i++){
            boolean isAsalmi = true;
            for (int j =2 ; j <=i/2 ; j++){
                if (i%j == 0){
                    isAsalmi = false;
                    break;
                }
            }

            if (isAsalmi){
                System.out.print(i +",");
            }
        }
    }
}
