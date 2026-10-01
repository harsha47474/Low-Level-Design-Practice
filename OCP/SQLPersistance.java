package OCP;

import SRP.ShoppingCart;

public class SQLPersistance implements Persistance {
    @Override
    public void save(ShoppingCart cart) {
        System.out.println("Saving shopping cart to SQL DB...");
    }
}
