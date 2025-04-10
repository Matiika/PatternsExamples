package org.example.patterns.factoryMethod;

public class CashPaymentFactory implements PaymentMethodFactory{
    @Override
    public PaymentMethod createPaymentMethod() {
        return new CashPayment();
    }
}
