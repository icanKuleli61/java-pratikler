package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class NotebookData {

    public static List<Notebook> notebookData = new ArrayList<>();

    static {
        notebookData.add(new Notebook(1, "MacBook Pro 16", "Notebook", 30000, 10, MarkaData.loadMarkaData.get(2), 16, 512, "16 inch"));
        notebookData.add(new Notebook(2, "Asus ROG Zephyrus", "Notebook", 25000, 5, MarkaData.loadMarkaData.get(5), 32, 1024, "15.6 inch"));
        notebookData.add(new Notebook(3, "HP Pavilion 15", "Notebook", 12000, 8, MarkaData.loadMarkaData.get(6), 16, 512, "15.6 inch"));
        notebookData.add(new Notebook(4, "Lenovo Legion 5", "Notebook", 18000, 6, MarkaData.loadMarkaData.get(1), 16, 512, "15.6 inch"));
        notebookData.add(new Notebook(5, "Monster Abra A5", "Notebook", 22000, 3, MarkaData.loadMarkaData.get(8), 32, 1024, "15.6 inch"));
        notebookData.add(new Notebook(6, "Casper Excalibur G900", "Notebook", 16000, 7, MarkaData.loadMarkaData.get(4), 16, 512, "15.6 inch"));
        notebookData.add(new Notebook(7, "Huawei MateBook D14", "Notebook", 13000, 12, MarkaData.loadMarkaData.get(3), 16, 512, "14 inch"));
        notebookData.add(new Notebook(8, "Apple MacBook Air", "Notebook", 25000, 9, MarkaData.loadMarkaData.get(2), 8, 256, "13.3 inch"));
        notebookData.add(new Notebook(9, "Samsung Galaxy Book3", "Notebook", 20000, 4, MarkaData.loadMarkaData.get(0), 16, 512, "15 inch"));
        notebookData.add(new Notebook(10, "Asus VivoBook S14", "Notebook", 12000, 15, MarkaData.loadMarkaData.get(5), 8, 256, "14 inch"));
    }

}
