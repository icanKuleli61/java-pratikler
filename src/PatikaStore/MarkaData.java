package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class MarkaData {


    public static List<MarkaClass> loadMarkaData = new ArrayList<>();

    static{
        loadMarkaData.add(new MarkaClass("Samsung"));
        loadMarkaData.add(new MarkaClass("Lenovo"));
        loadMarkaData.add(new MarkaClass("Apple"));
        loadMarkaData.add(new MarkaClass("Huawei"));
        loadMarkaData.add(new MarkaClass("Casper"));
        loadMarkaData.add(new MarkaClass("Asus"));
        loadMarkaData.add(new MarkaClass("HP"));
        loadMarkaData.add(new MarkaClass("Xiaomi"));
        loadMarkaData.add(new MarkaClass("Monster"));
    }

}
