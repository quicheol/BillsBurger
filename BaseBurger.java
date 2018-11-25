package com.company;

import java.util.Scanner;

public class BaseBurger {

    private double priceBaseBurger;
    private String meat;
    private String breadRoll;
    private double lettucePrice;
    private double tomatoPrice;
    private double picklePrice;
    private double cheesePrice;
    private double jalapenoPrice;
    private double olivesPrice;
    private double mushroomsPrice;

    public BaseBurger() {
        this.priceBaseBurger = 2.35;
        this.meat = "base";
        this.breadRoll = "base";
        this.lettucePrice = 0.20;
        this.tomatoPrice = 0.23;
        this.picklePrice = 0.17;
        this.cheesePrice = 0.45;
        this.jalapenoPrice = 0.33;
        this.olivesPrice = 0.27;
        this.mushroomsPrice = 0.30;

    }


    public double getPriceBaseBurger() {
        return priceBaseBurger;
    }

    public String getMeat() {
        return meat;
    }

    public String getBreadRoll() {
        return breadRoll;
    }

    public double getLettucePrice() {
        return lettucePrice;
    }

    public double getTomatoPrice() {
        return tomatoPrice;
    }

    public double getPicklePrice() {
        return picklePrice;
    }

    public double getCheesePrice() {
        return cheesePrice;
    }

    public double getJalapenoPrice() {
        return jalapenoPrice;
    }

    public double getOlivesPrice() {
        return olivesPrice;
    }

    public double getMushroomsPrice() {
        return mushroomsPrice;
    }

    public void chooseAdd(int maxAddValue, double BurgerPrice) {

        String theAdd;
        double AddPrice=0;
        double totalPrice = BurgerPrice + AddPrice;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Choose your " + maxAddValue + " add by putting number. You can choose from : " +
                "\n 1.Lettuce -" + getLettucePrice() + "$" +
                "\n 2.Tomato -" + getTomatoPrice() + "$" +
                "\n 3.Pickle -" + getPicklePrice() + "$" +
                "\n 4.Cheese -" + getCheesePrice() + "$" +
                "\n 5.Jalapeno -" + getJalapenoPrice() + "$" +
                "\n 6.Olives -" + getOlivesPrice() + "$" +
                "\n 7.Mushrooms -" + getMushroomsPrice() + "$");

        while (maxAddValue>0) {

            int add = scanner.nextInt();
            if (add > 0 && add < 8) {
                maxAddValue--;
                if (add == 1) { //może lepiej byłoby użyć switch?
                    theAdd = "lettuce";
                    AddPrice= getLettucePrice();
                    totalPrice += AddPrice; // jak zrobić żeby zamiast sout była jakaś standardowa wiadomość zapisana wyżej?
                    System.out.println("You choose - " + theAdd + ". Add price is " + AddPrice + "$. Total price of burger : " + String.format("%.2f",totalPrice) + ". You can choose "  + maxAddValue + " add more.");

                } else if (add == 2) {
                    theAdd = "tomato";
                    AddPrice = getTomatoPrice();
                    totalPrice += AddPrice;
                    System.out.println("You choose - " + theAdd + ". Add price is " + AddPrice + "$. Total price of burger : " + String.format("%.2f",totalPrice) + ". You can choose "  + maxAddValue + " add more.");

                } else if (add == 3) {
                    theAdd = "pickle";
                    AddPrice = getPicklePrice();
                    totalPrice += picklePrice;
                    System.out.println("You choose - " + theAdd + ". Add price is " + AddPrice + "$. Total price of burger : " + String.format("%.2f",totalPrice) + ". You can choose "  + maxAddValue + " add more.");

                } else if (add == 4) {
                    theAdd = "cheese";
                    AddPrice = getCheesePrice();
                    totalPrice += cheesePrice;
                    System.out.println("You choose - " + theAdd + ". Add price is " + AddPrice + "$. Total price of burger : " + String.format("%.2f",totalPrice) + ". You can choose "  + maxAddValue + " add more.");

                } else if (add == 5) {
                    theAdd = "Jalapeno";
                    AddPrice = getJalapenoPrice();
                    totalPrice += jalapenoPrice;
                    System.out.println("You choose - " + theAdd + ". Add price is " + AddPrice + "$. Total price of burger : " + String.format("%.2f",totalPrice) + ". You can choose "  + maxAddValue + " add more.");

                } else if (add == 6) {
                    theAdd = "olives";
                    AddPrice = getOlivesPrice();
                    totalPrice += olivesPrice;
                    System.out.println("You choose - " + theAdd + ". Add price is " + AddPrice + "$. Total price of burger : " + String.format("%.2f",totalPrice) + ". You can choose "  + maxAddValue + " add more.");

                } else if (add == 7) {
                    theAdd = "mushrooms";
                    AddPrice = getMushroomsPrice();
                    totalPrice += mushroomsPrice;
                    System.out.println("You choose - " + theAdd + ". Add price is " + AddPrice + "$. Total price of burger : " + String.format("%.2f",totalPrice) + ". You can choose "  + maxAddValue + " add more.");

                }
            } else {
                System.out.println("Invalid Value. Choose number between 1 and 7");
            }


        }
        System.out.println("Your burger is ready. Enjoy your meal :)");

    }

}

