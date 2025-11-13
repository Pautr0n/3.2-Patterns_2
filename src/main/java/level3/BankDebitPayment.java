package level3;

public class BankDebitPayment implements PaymentMethod{
    @Override
    public void pay(double amount) throws Exception {
        System.out.println("Paid " + amount + "€ via Bank debit.");
        throw new Exception("Payment failure your bank denied the transaction");
    }
}
