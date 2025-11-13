package level3.payment;

public class BankDebitPayment implements PaymentMethod {
    @Override
    public void pay(double amount) throws Exception {
        System.out.println("Paid " + amount + "€ via Bank debit.");
        throw new Exception("Payment failure your bank denied the transaction");
    }
}
