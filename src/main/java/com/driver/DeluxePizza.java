package com.driver;

public class DeluxePizza extends Pizza {



    public DeluxePizza(Boolean isVeg) {
        super(isVeg);
        // your code goes here
        //super.addPrice(80);
        super.addExtraCheese();
        super.addExtraToppings();

//        if(isVeg)
//            super.addPrice(70);
//        else
//            super.addPrice(120);
    }
}
