package se.Lexicon.model;

public class ProductChocolate extends Product {

    private Purity purity;
    public enum Purity {
        LOW(50), MEDIUM(72), HIGH(85);

        private int value;
        private Purity(int value) {
            this.value = value;
        }

    }

    public ProductChocolate(double price, String productName, Purity purity){
        super(price, productName);
        this.purity = purity;
    }

    public Purity getPurity() {
        return purity;
    }

    public void setPurity(Purity purity) {
        this.purity = purity;
    }

    public String use() {
        return "Enjoy this smooth " + super.getProductName();
    }

    public String examine() {
        return "Contains " + purity.value + "% of cocoa";
    }
}
