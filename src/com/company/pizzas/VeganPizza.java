package com.company.pizzas;

public class VeganPizza implements PizzaAction {
    private PizzaAction pizza;

    private String name = "Vegan pizza";

    public VeganPizza(PizzaAction pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.pizza.getSize();
    }

    @Override
    public double getPrice() {
        return this.pizza.getPrice() - 200;
    }
}
