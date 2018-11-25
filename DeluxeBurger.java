package com.company;

public class DeluxeBurger extends BaseBurger {
    private double priceDeluxeBurger;
    private String meat;
    private String breadRoll;

    public DeluxeBurger() {
        this.priceDeluxeBurger = 3.65;
        this.meat = "base";
        this.breadRoll = "base";
    }


    public double getPriceDeluxeBurger() {
        return priceDeluxeBurger;
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
