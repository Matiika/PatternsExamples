package org.example.patterns.factoryMethod;

public class FactoryMethodExample {
    public static void main(String[] args) {
        PaymentMethodFactory paymentMethodFactory = new CreditCardPaymentFactory();
        PaymentMethod paymentMethod = paymentMethodFactory.createPaymentMethod();
        paymentMethod.pay(1000);

        paymentMethodFactory = new CashPaymentFactory();
        paymentMethod = paymentMethodFactory.createPaymentMethod();
        paymentMethod.pay(300);

        paymentMethodFactory = new PayPalPaymentFactory();
        paymentMethod = paymentMethodFactory.createPaymentMethod();
        paymentMethod.pay(500);
    }
}
