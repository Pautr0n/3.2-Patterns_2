package level3;

public class Main {

    public static void main(String[] args) {
        ShoeStore store = new ShoeStore();

        System.out.println("First Order: ");
        store.sellShoes(89.99, new PaypalPayment());

        System.out.println("");

        System.out.println("Second Order:");
        store.sellShoes(159.56, new CreditCardPayment());

        System.out.println("");

        System.out.println("Third Order:");
        store.sellShoes(250.60, new BankDebitPayment());

    }
}
