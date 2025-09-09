package PatikaStore;

public class Notebook extends Products{
    private int ram;
    private int storage;
    private String screenSize;

    public Notebook(int urunId, String productName, String productCategory, double price, int stock, MarkaClass brand, int ram, int storage, String screenSize) {
        super(urunId, productName, productCategory, price, stock, brand);
        this.ram = ram;
        this.storage = storage;
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }
}
