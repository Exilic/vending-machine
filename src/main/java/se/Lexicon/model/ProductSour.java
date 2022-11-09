package se.Lexicon.model;

public class ProductSour extends Product {

    public ProductSour(double price, String productName){
        super(price, productName);
    }

    public String use() {
        return "test";
    }

    public String examine() {
        return "test";
    }
}
