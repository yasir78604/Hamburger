package com.company;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("DeluxeBurger", "chicken", 250, "whiteBread");
        super.setAdditionalitem1("chips",50);
        super.setAdditionalitem2("cold Drinks",100);
    }

    @Override
    public void setAdditionalitem1(String itemName, double price) {
        System.out.println("sorry in Deluxe burger you cannot added items");
    }

    @Override
    public void setAdditionalitem2(String itemName, double price) {
        System.out.println("sorry in Deluxe burger you cannot added items");
    }

    @Override
    public void setAdditionalitem3(String itemName, double price) {
        System.out.println("sorry in Deluxe burger you cannot added items");
    }

    @Override
    public void setAdditionalitem4(String itemName, double price) {
        System.out.println("sorry in Deluxe burger you cannot added items");
    }
}
