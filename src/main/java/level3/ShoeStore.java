package level3;

public class ShoeStore {
    private PaymentGateway paymentGateway = new PaymentGateway();

    public void sellShoes(double price, PaymentMethod paymentMethod) {
        System.out.println("Processing shoes sales for " + price + " €...");
        paymentGateway.processPayment(paymentMethod, price, success -> {
            if (success) {
                System.out.println("Payment Complete");
            } else {
                System.out.println("Payment failure, try again");
            }
        });

        System.out.println("Payment Transaction finished");

    }
}
