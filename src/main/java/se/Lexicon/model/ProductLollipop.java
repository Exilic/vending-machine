package se.Lexicon.model;

public class ProductLollipop extends Product {

    private Material stickMaterial;

    public enum Material {
        PLASTIC,
        PAPER
    }

    public ProductLollipop(double price, String productName, Material stickMaterial){
        super(price, productName);
        this.stickMaterial = stickMaterial;
    }

    public Material getStickMaterial() {
        return stickMaterial;
    }

    public void setStickMaterial(Material stickMaterial) {
        this.stickMaterial = stickMaterial;
    }

    public String use() {
        return "Take this " + super.getProductName() + " and solve the case";
    }

    public String examine() {
        return "Long lasting";
    }
}
