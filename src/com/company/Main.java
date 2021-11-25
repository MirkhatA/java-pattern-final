package com.company;

import com.company.pizzas.DoubleCheesePizza;
import com.company.pizzas.SimplePizza;
import com.company.pizzas.VeganPizza;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<String, Double> priceList = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Make order");

        SimplePizza simplePizza = new SimplePizza();
        VeganPizza veganPizza = new VeganPizza(simplePizza);
        DoubleCheesePizza doubleCheesePizza = new DoubleCheesePizza(simplePizza);

        priceList.put(simplePizza.getName(), simplePizza.getPrice());
        priceList.put(veganPizza.getName(), veganPizza.getPrice());
        priceList.put(doubleCheesePizza.getName(), doubleCheesePizza.getPrice());

        System.out.println(Arrays.asList(priceList));
    }
}
