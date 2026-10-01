package SRP;

public class ShoppingCartPrinter {
    private ShoppingCart cart;

    public ShoppingCartPrinter(ShoppingCart cart) {
        this.cart = cart;
    }

    public void printInvoices() {
        System.out.println("Shopping Cart Invoices");
        for (Product p : cart.getProducts()) {
            System.out.println(p.name + " - Rs " + p.price);
        }
        System.out.println("Total: Rs " + cart.calculateTotalPrice());
    }
}
