public class BinarySearchTree {

    //Binary Search Tree Projesi
    //Proje 3
    //
    //[7, 5, 1, 8, 3, 6, 0, 9, 4, 2] dizisinin Binary-Search-Tree aşamalarını yazınız.
    //
    //Örnek: root x'dir. root'un sağından y bulunur. Solunda z bulunur vb.

    public static void main(String[] args) {
        int[] dizi = {7, 5, 1, 8, 3, 6, 0, 9, 4, 2};
        int[] yeniDizi = new int[dizi.length];
        int j = 0;
        for (int i = 0; i < dizi.length; i++) {

            if (i == 0){
                System.out.println("ROOT : " + dizi[i]);
                yeniDizi[j++] = dizi[i];
            }
            if (yeniDizi[j-1] < dizi[i]){
                System.out.println(dizi[i] +" "+ yeniDizi[j-1]+" nin sağında bulunur.");
                yeniDizi[j++] = dizi[i];
            }else if (yeniDizi[j-1] > dizi[i]){
                System.out.println(dizi[i] +" "+ yeniDizi[j-1]+" nin solunda bulunur.");
                yeniDizi[j++] = dizi[i];
            }

        }
    }
}
