package com.company;

import com.company.order.*;
import com.company.order.adapter.CardImplementation;
import com.company.order.adapter.CardToCashAdapter;
import com.company.order.card.Card;
import com.company.order.cash.Cash;
import com.company.pizzas.DoubleCheesePizza;
import com.company.pizzas.SimplePizza;
import com.company.pizzas.VeganPizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
                System.out.println("Continue? Y/N");
                message = reader.readLine();
            } while (message.equalsIgnoreCase("Y"));

            System.out.println("Your total price - " + order.getPrice());



            Card card = new CardImplementation();


            do {
                System.out.println("Please choose payment method: \n" +
                        "1. Card \n" +
                        "2. Cash \n");
                int num = Integer.parseInt(reader.readLine());

                if (num == 1) {
                    System.out.println("Enter card No");
                    String cardNo = reader.readLine();

                    card.setPrice(order.getPrice());

                    Cash cash = new CardToCashAdapter(card);

                    System.out.println("Payment of " +
                            + cash.getTotalPrice()
                            + " successful!");
                }

                if (num == 2) {
                    System.out.println("Success");
                }

                message = reader.readLine();
            } while (message.equalsIgnoreCase("Y"));
            break;
        }

        System.out.println("Thank you! Enjoy your meal!");
    }
}
