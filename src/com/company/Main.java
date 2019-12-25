package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hamburger burger = new Hamburger("burger" , "Chicken" , 150,"white");
        double price = burger.hamburgerPrice();
        burger.setAdditionalitem1("cheeze",120);
        burger.setAdditionalitem2("cream",100);
        System.out.println("Total price is : " + burger.hamburgerPrice());

        HealtyBurger healtyBurger = new HealtyBurger("chicken",250);
        healtyBurger.setAdditionalitem2("sauce",20);
        healtyBurger.setHealthyBurgerItem2("masala",50);
        System.out.println("Total cost is : " + healtyBurger.hamburgerPrice());


        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.setAdditionalitem1("sauce",15);
        System.out.println("total cost is : " + deluxeBurger.hamburgerPrice());
    }
}
