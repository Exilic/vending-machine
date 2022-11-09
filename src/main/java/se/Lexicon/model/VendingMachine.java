package se.Lexicon.model;

public class VendingMachine implements IVendingMachine {

    private Product[] products;
    private int depositPool;

    public VendingMachine(Product[] products) {
        this.products = products;
    }

    @Override
    public void addCurrency(int amount) {

    }

    @Override
    public int getBalance() {
        return 0;
    }

    @Override
    public Product request(int id) {
        return null;
    }

    @Override
    public int endSession() {
        return 0;
    }

    @Override
    public String getDescription(int id) {
        return null;
    }

    @Override
    public String[] getProducts() {
        return new String[0];
    }
}
