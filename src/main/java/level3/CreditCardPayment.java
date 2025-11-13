package level3;

public class CreditCardPayment implements PaymentMethod{

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + "€ with credit card.");
    }
}
