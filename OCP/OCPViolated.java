package OCP;

import SRP.*;

public class OCPViolated {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Red Shirt", 100.00));
        cart.addProduct(new Product("White Shirt", 200.00));
        cart.addProduct(new Product("Black Shirt", 300.00));

        System.out.println(cart.getProducts());
        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoices();

        SaveToStorage db = new SaveToStorage(cart);
        db.saveToMongoDB();
        db.saveToRedis();
    }
}
