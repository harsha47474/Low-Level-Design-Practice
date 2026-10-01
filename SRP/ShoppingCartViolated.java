package SRP;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ShoppingCartViolated {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public List<Product> getProducts() {
        return products;
    }

    public double calculateTotalPrice() {
        double totalPrice = 0;
        for (Product product : products) {
            totalPrice += product.price;
        }
        return totalPrice;
    }

    public void printInvoice() {
        System.out.println("Shopping Cart Invoice");
        for (Product p : products) {
            System.out.println(p.name + " - Rs " + p.price);
        }
        System.out.println("Total - Rs " + calculateTotalPrice());
    }

    public void saveToDB() {
        System.out.println("Saving shopping cart to database...");
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.schedule(() -> {
            System.out.println("Saved succesfully!");
        }, 3, TimeUnit.SECONDS);

        scheduler.shutdown();
    }
}
