package OCP;

import SRP.Product;
import SRP.ShoppingCart;
import SRP.ShoppingCartPrinter;

public class OCPFollowed extends Thread {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addProduct(new Product("Red Shirt", 100.00));
        cart.addProduct(new Product("White Shirt", 200.00));
        cart.addProduct(new Product("Black Shirt", 300.00));

        System.out.println(cart.getProducts());
        ShoppingCartPrinter printer = new ShoppingCartPrinter(cart);
        printer.printInvoices();

        Persistance p1 = new SQLPersistance();
        Persistance p2 = new RedisPersistance();
        Persistance p3 = new MongoPersistance();

        p1.save(cart);
        p2.save(cart);
        p3.save(cart);
    }
}
