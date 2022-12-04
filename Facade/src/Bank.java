public class Bank {
    boolean checkCardData(CreditCard card) throws InterruptedException {
        System.out.println("Банк проверяет данные карты покупателя");
        Thread.sleep(1000);
        return (card.number == 1234);
    };

    boolean checkCardBalance(CreditCard card) throws InterruptedException {
        System.out.println("Банк проверяет баланс карты покупателя");
        Thread.sleep(1000);
        return (card.balance > 100);
    };

    void makeTransaction(Customer cust, Seller seller) throws InterruptedException {
        System.out.println("Банк осуществляет транзакцию");
        cust.card.balance -= 50;
        seller.card.balance += 50;
        Thread.sleep(1000);
    };
}
