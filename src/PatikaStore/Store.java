package PatikaStore;

import java.util.Scanner;

public class Store {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("PatikaStore Ürün Yönetim Paneli ! \n"
                + " 1 - Notebook ürünleri \n"
                + " 2 - Cep Telefonu ürünleri \n"
                + " 3 - Marka Listele \n"
                + " 0 - Çıkış Yap");
        System.out.print("Tercihiniz :");
        int tercihiniz;
        while (true) {
            tercihiniz = scan.nextInt();
            if (tercihiniz < 0 || tercihiniz > 3) {
                System.out.print("Secim yaptığınız menü yok tekrar deneyiniz :");
            } else break;
        }
        System.out.println();


        switch (tercihiniz) {
            case 0:
                System.out.println("Çıkış yapılıyor...");
                break;
            case 1:
                for (Notebook n : NotebookData.notebookData) {
                    System.out.println(n.getProductName() + " - " + n.getBrand().getMarkaName());
                }
                break;
            case 2:
                for (Phone p : PhoneData.phoneData) {
                    System.out.println(p.getProductName() + " - " + p.getBrand().getMarkaName());
                }
                break;
            case 3:
                for (MarkaClass m : MarkaData.loadMarkaData) {
                System.out.println(m.getMarkaName());
            }
                break;
            default:
                break;
        }


    }
}
