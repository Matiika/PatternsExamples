package org.example.patterns.factoryMethod;

public class CreditCardPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата карточкой на сумму " + amount + "рублей.");
    }
}
