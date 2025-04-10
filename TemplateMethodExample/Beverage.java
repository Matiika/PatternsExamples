package org.example.patterns.templateMethod;

public abstract class Beverage {
    public final void preparedRecipe() {
        boilWater();
        brew();
        addCondiments();
        pourInCup();
    }

    //Методы, которые могут быть реализованы по разному в подклассах
    protected abstract void brew();
    protected abstract void addCondiments();

    //Шаги, которые одинаковы для всех напитаков
    private void boilWater() {
        System.out.println("Кипячение воды...");
    }

    private void pourInCup() {
        System.out.println("Наливание в чашку...");
    }
}
