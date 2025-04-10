package org.example.patterns.templateMethod;

public class TemplateMethodExample {
    public static void main(String[] args) {
        Beverage coffee = new Coffee();
        System.out.println("\nПриготовление кофе");
        coffee.preparedRecipe();

        Beverage tea = new Tea();
        System.out.println("\nПриготовление чая");
        tea.preparedRecipe();
    }
}
