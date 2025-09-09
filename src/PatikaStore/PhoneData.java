package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class PhoneData {

    // Mutable liste
    public static List<Phone> phoneData = new ArrayList<>();

    static {
        // Başlangıç ürünlerini ekle
        phoneData.add(new Phone(1, "iPhone 14", "Phone", 14000, 50, MarkaData.loadMarkaData.get(2), "128 GB", "6.1", 4000, 6, 1));
        phoneData.add(new Phone(2, "Samsung Galaxy S23", "Phone", 12000, 40, MarkaData.loadMarkaData.get(0), "256 GB", "6.2", 4500, 8, 2));
        phoneData.add(new Phone(3, "Huawei P50", "Phone", 11000, 30, MarkaData.loadMarkaData.get(3), "128 GB", "6.1", 4100, 8, 3));
        phoneData.add(new Phone(4, "Xiaomi Mi 13", "Phone", 9500, 25, MarkaData.loadMarkaData.get(7), "256 GB", "6.3", 4500, 12, 4));
        phoneData.add(new Phone(5, "Asus Zenfone 9", "Phone", 10500, 20, MarkaData.loadMarkaData.get(5), "128 GB", "6.0", 4300, 8, 5));
        phoneData.add(new Phone(6, "Casper VIA V20", "Phone", 7000, 35, MarkaData.loadMarkaData.get(4), "64 GB", "6.1", 4000, 6, 6));
        phoneData.add(new Phone(7, "HP Elite X3", "Phone", 8000, 15, MarkaData.loadMarkaData.get(6), "128 GB", "6.0", 4000, 8, 1));
        phoneData.add(new Phone(8, "Lenovo Legion Phone", "Phone", 9000, 10, MarkaData.loadMarkaData.get(1), "256 GB", "6.5", 5000, 12, 2));
        phoneData.add(new Phone(9, "Monster Cep X", "Phone", 12000, 5, MarkaData.loadMarkaData.get(8), "512 GB", "6.4", 5000, 16, 3));
        phoneData.add(new Phone(10, "Samsung Galaxy Note 20", "Phone", 13000, 18, MarkaData.loadMarkaData.get(0), "256 GB", "6.7", 4300, 12, 4));
    }
}
