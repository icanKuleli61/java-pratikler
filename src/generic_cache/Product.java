package generic_cache;

public class Product {

    private Long productId;

    private String productName;

    private double productPrice;

    private int productStockQuantity;

    private String productKategory;

    public Product(Long productId, String productName, double productPrice, int productStockQuantity, String productKategory) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
        this.productStockQuantity = productStockQuantity;
        this.productKategory = productKategory;
    }

    public Long getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductStockQuantity() {
        return productStockQuantity;
    }

    public void setProductStockQuantity(int productStockQuantity) {
        this.productStockQuantity = productStockQuantity;
    }

    public String getProductKategory() {
        return productKategory;
    }

    public void setProductKategory(String productKategory) {
        this.productKategory = productKategory;
    }

    @Override
    public String toString() {
        return productName + "\n" + productPrice + "\n" + productStockQuantity + "\n" + productKategory +"\n";
    }
}
