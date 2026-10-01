package SRP;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class SRPViolated {
    public static void main(String args[]) {
        ShoppingCartViolated cart = new ShoppingCartViolated();
        cart.addProduct(new Product("Laptop", 500000));
        cart.addProduct(new Product("Mouse", 2000));

        cart.printInvoice();
        cart.saveToDB();
    }
}