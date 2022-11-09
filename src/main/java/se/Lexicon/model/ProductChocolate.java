package se.Lexicon.model;

public class ProductChocolate extends Product {

    public ProductChocolate(double price, String productName){
        super(price, productName);
    }

    public String use() {
        return "test";
    }

    public String examine() {
        return "test";
    }
}
