package com.company;

public class HealthyBurger extends BaseBurger {

    private double priceHealthyBurger;
    private String meat;
    private String breadRoll;

    public HealthyBurger() {
        this.priceHealthyBurger = 3.15;
        this.meat = "low fat";
        this.breadRoll = "brown rye";

    }

    public double getPriceHealthyBurger() {
        return priceHealthyBurger;
    }

    @Override
    public String getMeat() {
        return meat;
    }

    @Override
    public String getBreadRoll() {
        return breadRoll;
    }


}

