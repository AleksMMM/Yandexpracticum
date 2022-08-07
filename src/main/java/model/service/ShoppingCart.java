package model.service;

import model.Food;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ShoppingCart {

    private Food[] foods;

    public double summPrice(Food[] foods) {

        double price = 0;

        for (Food food : foods) {
            price = price + food.getPrice();
        }
        return price;
    }

    public double summDiscount(Food[] foods) {

        double price = 0;
        for (Food food : foods) {
            if (food.getDiscount() == 0) {
                price = price + food.getPrice();
            } else {
                price = price + food.getPrice() / 100 * food.getDiscount();
            }
        }
        return price;
    }

    public double summVegatirans(Food[] foods) {

        double price = 0;

        for (Food food : foods) {

            if (food.isVegetarian()) {

                price = price + food.getPrice();
            }
        }
        return price;

    }
}
