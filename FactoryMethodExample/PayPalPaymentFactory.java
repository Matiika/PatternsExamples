package org.example.patterns.factoryMethod;

public class PayPalPaymentFactory  implements PaymentMethodFactory{
    @Override
    public PaymentMethod createPaymentMethod() {
        return new PayPalPayment();
    }
}
