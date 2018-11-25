package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        BaseBurger baseBurger = new BaseBurger();
        HealthyBurger healthyBurger = new HealthyBurger();
        DeluxeBurger deluxeBurger = new DeluxeBurger();

        int maxAddValue;
        double burgerPrice = 0;


        System.out.println("Welcome in Bills Burgers. Choose your order by putting number :  " +
                "\n 1. Base Burger - " + baseBurger.getPriceBaseBurger() + "$" +
                "\n - " + (baseBurger.getMeat()) + " meat " +
                "\n - " + baseBurger.getBreadRoll() + " bread roll" +
                "\n - 4 adds to choose" +
                "\n" +
                "\n 2. Healthy Burger -" + healthyBurger.getPriceHealthyBurger() + "$" +
                "\n - " + healthyBurger.getMeat() + " meat " +
                "\n - " + healthyBurger.getBreadRoll() + " bread roll" +
                "\n - 6 adds to choose" +
                "\n" +
                "\n 3. Deluxe Burger -" + deluxeBurger.getPriceDeluxeBurger() + "$" +
                "\n - " + deluxeBurger.getMeat() + " meat " +
                "\n - " + deluxeBurger.getBreadRoll() + " bread roll" +
                "\n - 2 adds to choose" +
                "\n - chips" +
                "\n - soda");

        Scanner scanner = new Scanner(System.in);


        while (true) {

            int orderNumber = scanner.nextInt();

            if (orderNumber > 0 && orderNumber < 4) {

                if (orderNumber == 1) {
                    System.out.println("You choose Base Burger.");
                    maxAddValue = 4;
                    burgerPrice = baseBurger.getPriceBaseBurger();
                    baseBurger.chooseAdd(maxAddValue, burgerPrice);
                } else if (orderNumber == 2) {
                    System.out.println("You choose Healthy Burger.");
                    maxAddValue = 6;
                    burgerPrice = healthyBurger.getPriceHealthyBurger();
                    healthyBurger.chooseAdd(maxAddValue, burgerPrice);
                } else if (orderNumber == 3) {
                    System.out.println("You choose Deluxe Burger");
                    maxAddValue = 2;
                    burgerPrice = deluxeBurger.getPriceDeluxeBurger();
                    deluxeBurger.chooseAdd(maxAddValue, burgerPrice);
                }
            } else {
                System.out.println("Invalid number of Meal. Please choose 1, 2 or 3.");
            }
        }
    }
}
