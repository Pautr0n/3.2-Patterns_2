package level3.payment;

import level3.callback.PaymentCallback;

public class PaymentGateway{

    public void processPayment(PaymentMethod method, double amount, PaymentCallback callback) {
        boolean success = false;
        try {
            method.pay(amount);
            success = true;
        } catch (Exception e) {
            System.out.println("Error while processing the payment: " + e.getMessage());
        }
        if(callback != null){
            callback.call(success);
        }
    }
}
