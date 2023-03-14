package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        bill="";
        if(isVeg) {
            this.price = 300;
            bill+="Base Price Of The Pizza: 300\n";
        }
        else {
            this.price = 400;
            bill+="Base Price Of The Pizza: 400\n";
        }

    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        this.bill+="Extra Cheese Added: 80\n";
        this.price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        if(isVeg) {
            this.price += 70;
            bill+="Extra Toppings Added: 70\n";
        }
        else {
            bill+="Extra Toppings Added: 120\n";
            this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        bill+="Paperbag Added: 20\n";
        //System.out.println();
        price+=20;
    }

    public String getBill(){
        // your code goes here
        bill+="Total Price: "+this.price+"\n";
        return this.bill;
    }
}
