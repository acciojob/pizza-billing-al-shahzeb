package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here

        if(isVeg)
            this.price=300;
        else
            this.price=400;

        System.out.println("Base Price Of The Pizza: "+this.price);
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        System.out.println("Extra Cheese Added: 80");
        price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg) {
            this.price += 70;
            System.out.println("Extra Toppings Added: 70");
        }
        else {
            System.out.println("Extra Toppings Added: 120");
            this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        System.out.println("Paperbag Added: 20");
        price+=20;
    }

    public String getBill(){
        // your code goes here
        bill="Total Price: "+getPrice()+"\n";
        return this.bill;
    }
}
