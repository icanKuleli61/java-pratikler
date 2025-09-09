package PatikaStore;

public class Phone extends Products{


    private String memory;
    private String screenSize;
    private int battery;
    private int ram;
    private int color;


    public Phone(int urunId, String productName, String productCategory, double price, int stock, MarkaClass brand, String memory, String screenSize, int battery, int ram, int color) {
        super(urunId, productName, productCategory, price, stock, brand);
        this.memory = memory;
        this.screenSize = screenSize;
        this.battery = battery;
        this.ram = ram;
        this.color = color;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public int getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
