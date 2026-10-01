package OCP;

import SRP.ShoppingCart;

public class MongoPersistance implements Persistance {
    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to MongoDB...");
    }
}
