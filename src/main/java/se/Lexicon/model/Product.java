package se.Lexicon.model;

public abstract class Product {
    private int id;
    private double price;
    private String productName;

    public Product(double price, String productName){
        this.price = price;
        this.productName = productName;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public abstract String use();

    public abstract String examine();
}
