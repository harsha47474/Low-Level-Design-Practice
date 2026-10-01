package SRP;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SaveToStorage {
    private ShoppingCart cart;

    public SaveToStorage(ShoppingCart cart) {
        this.cart = cart;
    }

    public void SaveToMySQL() {
        System.out.println("Saving to MySQL...");
        savingDelay();
    }

    public void saveToMongoDB() {
        System.out.println("Saving to MongoDB...");
        savingDelay();
    }

    public void saveToRedis() {
        System.out.println("Saving to Redis...");
        savingDelay();
    }

    private void savingDelay() {
        ScheduledExecutorService scheduler = Executors.newSingleThreadScheduledExecutor();
        scheduler.schedule(() -> {
            System.out.println("Saved succesfully!");
        }, 6, TimeUnit.SECONDS);
    }
}
