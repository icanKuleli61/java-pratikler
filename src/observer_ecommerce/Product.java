package observer_ecommerce;

import java.util.ArrayList;
import java.util.List;

public  class Product {

    private List<Observer> observers = new ArrayList<>();

    private String productCode;

    private String productName;

    private double productPrice;

    private int quantity;

    private String prudateDescription;

    private String productKategori;

    public Product(String productCode, String productName, double productPrice, int quantity, String prudateDescription, String productKategori) {
        this.productCode = productCode;
        this.productName = productName;
        this.productPrice = productPrice;
        this.quantity = quantity;
        this.prudateDescription = prudateDescription;
        this.productKategori = productKategori;
    }

    public void addObserver(Observer observer){
        observers.add(observer);
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void setPrice(double productPrice){
        double oldPrice = this.productPrice;
        if (oldPrice == productPrice) {
            return;
        }
        this.productPrice = productPrice;
        pushlisherAbsorver(oldPrice, productPrice);


    }

    private void pushlisherAbsorver(double oldPrice, double newPrice){
        for(Observer observer : observers){
            if (observer != null){
                observer.handler(urunBilgileri(oldPrice,newPrice));
            }
        }
    }


    public String urunBilgileri(double oldPrice, double newPrice){
        String message = "";
        if (oldPrice > newPrice) {
            message = "indirim uygulanmıştır";
        }else if (oldPrice < newPrice) {
            message = "zam gelmişdir.";
        }
        return this.productCode + " numaralı " + this.productName + " " + this.prudateDescription + " ürüne " + message+" ürünün yeni fiyatı "
                + this.productPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getPrudateDescription() {
        return prudateDescription;
    }

    public void setPrudateDescription(String prudateDescription) {
        this.prudateDescription = prudateDescription;
    }

    public String getProductKategori() {
        return productKategori;
    }

    public void setProductKategori(String productKategori) {
        this.productKategori = productKategori;
    }




}
