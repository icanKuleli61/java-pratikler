package PatikaStore;

public abstract class Products {
    private static int Id;
    private int urunId;
    private String productName;
    private String productCategory;
    private double price;
    private int stock;
    private MarkaClass brand;

    public Products(int urunId, String productName, String productCategory, double price, int stock, MarkaClass brand) {
        this.urunId = urunId;
        this.productName = productName;
        this.productCategory = productCategory;
        this.price = price;
        this.stock = stock;
        this.brand = brand;
    }

    public static int getId() {
        return Id;
    }

    public static void setId(int id) {
        Id = id;
    }

    public int getUrunId() {
        return urunId;
    }

    public void setUrunId(int urunId) {
        this.urunId = urunId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public MarkaClass getBrand() {
        return brand;
    }

    public void setBrand(MarkaClass brand) {
        this.brand = brand;
    }
}
