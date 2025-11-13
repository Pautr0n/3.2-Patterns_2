package level3;

import level3.payment.BankDebitPayment;
import level3.payment.CreditCardPayment;
import level3.payment.PaypalPayment;
import level3.store.ShoeStore;

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
