package com.company.pizzas;

public class SimplePizza implements PizzaAction{
    private String name = "Simple pizza";
    private int size = 20;
    private double price = 2000;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public double getPrice() {
        return this.price;
    }


}
