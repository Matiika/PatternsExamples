package org.example.patterns.factoryMethod;

public class CashPayment implements PaymentMethod{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата наличными на сумму " + amount + "рублей.");
    }
}
