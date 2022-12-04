import java.util.HashMap;

public class StoreHouse {
    HashMap<String, Integer> catalog;

    public StoreHouse() {
        catalog = new HashMap<>();
        catalog.put("Milk", 5);
        catalog.put("Bread", 10);
        catalog.put("Eggs", 20);
    }

    void writeOffProduct(String str) throws InterruptedException {
        catalog.put(str, catalog.get(str) - 1);
        Thread.sleep(1000);
    };
    boolean checkAvailablilityOfProduct(String str) throws InterruptedException {
        Thread.sleep(1000);
        return (!(catalog.get(str) == 0));
    };

    void transferToDelivery() throws InterruptedException {
        System.out.println("Склад передает товар в доставку");
        Thread.sleep(1000);
    };
}
