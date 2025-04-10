package org.example.patterns.factoryMethod;

public class PayPalPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата через PayPal на сумму " + amount + "рублей.");
    }
}
