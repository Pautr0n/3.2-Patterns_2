package level3.payment;

public class CreditCardPayment implements PaymentMethod {

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "€ with credit card.");
    }
}
