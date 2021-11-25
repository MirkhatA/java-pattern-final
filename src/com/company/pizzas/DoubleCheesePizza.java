package com.company.pizzas;

public class DoubleCheesePizza implements PizzaAction{
    private PizzaAction pizza;

    private String name = "Double Cheese Pizza";

    public DoubleCheesePizza(PizzaAction pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return pizza.getSize();
    }

    @Override
    public double getPrice() {
        return pizza.getPrice() + 100;
    }
}
