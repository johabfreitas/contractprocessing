package model.services;


public class PaypalService implements OnlinePaymentService {

    @Override
    public double paymentFee(double amount) {
        return amount * 2 / 100;
    }

    @Override
    public double interest(double amount, int months) {
        return amount * months / 100;
    }
    
}
