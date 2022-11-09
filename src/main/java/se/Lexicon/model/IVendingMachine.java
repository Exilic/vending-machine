package se.Lexicon.model;

public interface IVendingMachine {

    void addCurrency(int amount);
    int getBalance();
    Product request(int id);
    int endSession();
    String getDescription(int id);
    String[] getProducts();
}
