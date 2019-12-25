package com.company;

public class HealtyBurger extends Hamburger {
    private String healthyBurgerItem1;
    private double healthyItem1price;

    private String healthyBurgerItem2;
    private double healthyItem2price;

    public HealtyBurger( String meat, double price) {
        super("Healthy Burger", meat, price, "brown rye bread");
    }

    public void setHealthyBurgerItem1(String name, double price) {
        this.healthyBurgerItem1 = name;
        this.healthyItem1price = price;
    }

    public void setHealthyBurgerItem2(String name, double price) {
        this.healthyBurgerItem2 = name;
        this.healthyItem2price = price;

    }

    @Override
    public double hamburgerPrice() {
        double burgerPrice = super.hamburgerPrice();
        if (healthyBurgerItem1 != null){
            System.out.println(healthyBurgerItem1 + " Added extra with " + healthyItem1price);
            burgerPrice += healthyItem1price;
        }
        if (healthyBurgerItem2 != null){
            System.out.println(healthyBurgerItem2 + " Added extra with " + healthyItem2price);
            burgerPrice += healthyItem2price;
        }
        return burgerPrice;
    }
}