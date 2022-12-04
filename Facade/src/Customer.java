import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Customer {
    String product;
    CreditCard card;
    String delieveryData;

    public Customer() {
        card = new CreditCard();
    }

    public String getProduct() {
        return product;
    }

    void chooseProduct() throws InterruptedException {
        System.out.println("Покупатель выбирает товар");
        ArrayList<String> catalog = new ArrayList<>();
        catalog.add("Milk");
        catalog.add("Bread");
        catalog.add("Eggs");

        Random rand = new Random();
        product = catalog.get(rand.nextInt(2));
        Thread.sleep(1000);
    };

    void inputCardData() throws InterruptedException {
        System.out.println("Введите номер карты");
        Scanner scanner = new Scanner(System.in);
        card.setNumber(scanner.nextInt());
        Random rand = new Random();
        card.setBalance(rand.nextInt(3000 - 1000) + 1000);

    };

    void inputDiliveryData() throws InterruptedException {
        System.out.println("Введите данные для доставки");
        Scanner scanner = new Scanner(System.in);
        delieveryData = scanner.next();
    };
}
