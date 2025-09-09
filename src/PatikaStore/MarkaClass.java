package PatikaStore;

import java.util.ArrayList;
import java.util.List;

public class MarkaClass implements Comparable<MarkaClass>{
    private  String markaName;
    private List<Products> products;
    private int id;
    private  static int markaId = 0;




    @Override
    public int compareTo(MarkaClass o) {
        return this.markaName.compareTo(o.markaName);
    }

    public MarkaClass(String markaName) {
        this.id = ++markaId;
        this.markaName = markaName;
        this.products = new ArrayList<>();
    }

    public String getMarkaName() {
        return markaName;
    }

    public void setMarkaName(String markaName) {
        this.markaName = markaName;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static int getMarkaId() {
        return markaId;
    }

    public static void setMarkaId(int markaId) {
        MarkaClass.markaId = markaId;
    }
}
