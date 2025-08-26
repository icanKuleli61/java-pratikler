public class InsertionSort {
    //[7,3,5,8,2,9,4,15,6] dizisinin Selection Sort'a göre  sıralayınız

    public static void main(String[] args) {
        int kucukDeger = Integer.MAX_VALUE;
        int[] dizi = {7,3,5,8,2,9,4,15,6};

        for (int i = 0; i < dizi.length; i++){
            int minIndex = i;
            for (int j = i+1; j < dizi.length; j++){
                if (dizi[j]<dizi[minIndex]){
                     minIndex = j;
                }

            }
            if (minIndex != i) {
                int temp = dizi[minIndex];
                dizi[minIndex] = dizi[i];
                dizi[i] = temp;
            }
        }
        for (int i : dizi) {
            System.out.print(i + " ");
        }

    }
}
