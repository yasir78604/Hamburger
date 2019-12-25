package com.company;

import java.util.Scanner;

public class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String additionalitem1;
    private double additionalitem1Price;

    private String additionalitem2;
    private double additionalitem2Price;

    private String additionalitem3;
    private double additionalitem3Price;

    private String additionalitem4;
    private double additionalitem4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
    }

    public void setAdditionalitem1(String itemName , double price){
        this.additionalitem1 = itemName;
        this.additionalitem1Price = price;
    }

    public void setAdditionalitem2(String itemName , double price){
        this.additionalitem2 = itemName;
        this.additionalitem2Price = price;
    }

    public void setAdditionalitem3(String itemName , double price){
        this.additionalitem3 = itemName;
        this.additionalitem3Price = price;
    }

    public void setAdditionalitem4(String itemName , double price){
        this.additionalitem4 = itemName;
        this.additionalitem4Price = price;
    }

    public double hamburgerPrice(){
       double burgerPrice = this.price;
        System.out.println(this.name + " Hamburger rolled with " + this.breadRollType + " with " + this.meat + " in price " + this.price);
       if (this.additionalitem1 != null){
           burgerPrice += additionalitem1Price;
           System.out.println(this.additionalitem1 + " Added extra and price is " + this.additionalitem1Price);
       }
        if (this.additionalitem2 != null){
            burgerPrice += additionalitem2Price;
            System.out.println(this.additionalitem2 + " Added extra and price is " + this.additionalitem2Price);
        }
        if (this.additionalitem3 != null){
            burgerPrice += additionalitem3Price;
            System.out.println(this.additionalitem3 + " Added extra and price is " + this.additionalitem3Price);
        }
        if (this.additionalitem4 != null){
            burgerPrice += additionalitem4Price;
            System.out.println(this.additionalitem4 + " Added extra and price is " + this.additionalitem4Price);
        }

       return burgerPrice;
    }
}
