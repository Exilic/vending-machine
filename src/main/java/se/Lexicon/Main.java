package se.Lexicon;

import se.Lexicon.data.VendingMachineImpl;
import se.Lexicon.model.Product;
import se.Lexicon.model.ProductChocolate;
import se.Lexicon.model.ProductLollipop;
import se.Lexicon.model.ProductSour;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        VendingMachineImpl vm = new VendingMachineImpl(getNewProducts());
        Boolean sessionActive = true;
        while(sessionActive) {
            printFirstMenu(vm.getBalance());
            int userInput = getUserInput();
            switch (userInput){
                case 1:
                    vm.addCurrency(enterMoney());
                    break;
                case 2:
                    printProductMenu(vm.getProducts());
                    Product product = vm.request(getUserInput());
                    if(product != null){
                        System.out.println(product.use());
                    }
                    break;
                case 3:
                    System.out.println("Returned balance: " + vm.endSession());
                    sessionActive = false;
                    break;
            }
        }
    }

    public static void printFirstMenu(int balance){
        System.out.println("Vending Machine – Current credit:" + balance);
        System.out.println("Choose action:");
        System.out.println("1. Enter money");
        System.out.println("2. Buy product");
        System.out.println("3. End session");
    }

    public static void printProductMenu(String[] descriptions) {
        System.out.println("Pick a product:");
        for(String description : descriptions) {
            System.out.println(description);
        }
    }

    public static int getUserInput() {
        Scanner userInput = new Scanner(System.in);
        String choice = userInput.nextLine();
        return Integer.parseInt(choice);
    }

    public static int enterMoney() {
        System.out.println("Enter an amount in one of the following denominations – 1,2,5,10,20,50,100,200,500,1000");
        return getUserInput();
    }

    public static Product[] getNewProducts(){
        Product[] products = new Product[9];
        products[0] = new ProductChocolate(12.50, "Toblerone", ProductChocolate.Purity.LOW);
        products[1] = new ProductChocolate(8.50, "Dajm", ProductChocolate.Purity.LOW);
        products[2] = new ProductChocolate(19.50, "Anton Berg", ProductChocolate.Purity.MEDIUM);
        products[3] = new ProductLollipop(6.50, "Tootsie Pops", ProductLollipop.Material.PLASTIC);
        products[4] = new ProductLollipop(7.50, "Suger Daddy", ProductLollipop.Material.PAPER);
        products[5] = new ProductLollipop(9.50, "Lollies", ProductLollipop.Material.PLASTIC);
        products[6] = new ProductSour(11.50, "Gold Bears", ProductSour.Texture.HARD);
        products[7] = new ProductSour(13.50, "Sour Patch", ProductSour.Texture.HARD);
        products[8] = new ProductSour(14.50, "Twizzlers", ProductSour.Texture.SOFT);
        return products;
    }
}