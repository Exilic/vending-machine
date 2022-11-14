package se.Lexicon.model;


public class ProductSour extends Product {

    private Texture texture;

    public enum Texture {
        HARD,
        SOFT
    }

    public ProductSour(double price, String productName, Texture texture){
        super(price, productName);
        this.texture = texture;
    }

    public Texture getTexture() {
        return texture;
    }

    public void setTexture(Texture texture) {
        this.texture = texture;
    }

    public String use() {
        return "Taste " + super.getProductName() + " and smile";
    }

    public String examine() {
        return "Candy of " + texture + " resistance";
    }
}
