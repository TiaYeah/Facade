public class Store {
    Bank bank = new Bank();
    Customer customer = new Customer();
    StoreHouse storeHouse = new StoreHouse();
    Delivery delivery = new Delivery();
    Seller seller = new Seller();

    void doSale() throws InterruptedException {
        customer.chooseProduct();
        customer.inputCardData();
        customer.inputDiliveryData();

        if(!storeHouse.checkAvailablilityOfProduct(customer.product)){
            System.out.println("Товар отсутствует");
            return;
        }

        if(!bank.checkCardData(customer.card)) {
            System.out.println("Неверные данные");
            return;
        }
        if(!bank.checkCardBalance(customer.card)){
            System.out.println("Недостаточно средств");
            return;
        }
        bank.makeTransaction(customer, seller);

        storeHouse.writeOffProduct(customer.product);
        storeHouse.transferToDelivery();

        delivery.transferToCustomer();
    }
}
