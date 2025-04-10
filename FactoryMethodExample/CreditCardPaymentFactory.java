package org.example.patterns.factoryMethod;

public class CreditCardPaymentFactory implements PaymentMethodFactory{
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CreditCardPayment();
    }
}
