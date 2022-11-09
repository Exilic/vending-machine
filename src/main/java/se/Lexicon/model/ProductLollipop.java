package se.Lexicon.model;

public class ProductLollipop extends Product {

    public ProductLollipop(double price, String productName){
        super(price, productName);
    }

    public String use() {
        return "test";
    }

    public String examine() {
        return "test";
    }
}
