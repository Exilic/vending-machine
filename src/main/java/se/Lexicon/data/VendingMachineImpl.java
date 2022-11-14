package se.Lexicon.data;

import se.Lexicon.model.IVendingMachine;
import se.Lexicon.model.Product;

public class VendingMachineImpl implements IVendingMachine {

    private Product[] products;
    private int depositPool;

    private int[] denominations = {1,2,5,10,20,50,100,200,500,1000};

    public VendingMachineImpl(Product[] products) {
        this.products = products;
        this.depositPool = 0;
    }

    @Override
    public void addCurrency(int amount) {
        for(int validAmount : denominations) {
            if (validAmount == amount) depositPool += amount;
        }
    }

    @Override
    public int getBalance() {
        return depositPool;
    }

    @Override
    public Product request(int id) {
        for(Product product : products){
            if(product.getId() == id && depositPool > product.getPrice()){
                depositPool -= product.getPrice();
                return product;
            }
        }
        return null;
    }

    @Override
    public int endSession() {
        int change = 0;
        change = depositPool;
        depositPool = 0;
        return change;
    }

    @Override
    public String getDescription(int id) {
        for(Product product : products) {
            if(product.getId() == id) return product.toString();
        }
        return null;
    }

    @Override
    public String[] getProducts() {
        String[] productDescriptions = new String[products.length];
        for(int i = 0; i < products.length; i++) {
            productDescriptions[i] = products[i].toString();
        }
        return productDescriptions;
    }
}
