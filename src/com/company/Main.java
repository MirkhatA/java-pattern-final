package com.company;

import com.company.order.Order;
import com.company.pizzas.DoubleCheesePizza;
import com.company.pizzas.SimplePizza;
import com.company.pizzas.VeganPizza;

import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Main {

    private static Map<Integer, Double> priceList = new HashMap<>();
    private static Order order = new Order();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        System.out.println("Make order");

        SimplePizza simplePizza = new SimplePizza();
        VeganPizza veganPizza = new VeganPizza(simplePizza);
        DoubleCheesePizza doubleCheesePizza = new DoubleCheesePizza(simplePizza);

        priceList.put(1, simplePizza.getPrice());
        priceList.put(2, veganPizza.getPrice());
        priceList.put(3, doubleCheesePizza.getPrice());

        boolean active;
        String message;

        while (true) {
            do {
                System.out.println("Please choose pizza you want to add: \n" +
                        "1." + simplePizza.getName() + " - " + simplePizza.getPrice() + "\n" +
                        "2." + veganPizza.getName() + " - " + veganPizza.getPrice() + "\n" +
                        "3." + doubleCheesePizza.getName() + " - " + doubleCheesePizza.getPrice() + "\n");
                int num = Integer.parseInt(reader.readLine());
                double cost = priceList.get(num);
                order.setPrice(order.getPrice() + cost);
                System.out.println("Your total price is : " + order.getPrice());
                System.out.println("Continue?");
                message = reader.readLine();
            } while (message.equalsIgnoreCase("Y"));

            break;
        }

        System.out.println("Your total price - " + order.getPrice());
    }
}
