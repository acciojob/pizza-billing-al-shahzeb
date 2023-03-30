package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean extracheeseadded=false;
    private Boolean extratoppingadded=false;

    private Boolean billgen=false;

    private Boolean takeaway=false;

    private int basePrice;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        bill="";
        if(isVeg) {
            this.price = 300;
            basePrice = 300;
        }
        else {
            this.price = 400;
            basePrice = price;
        }

    }



    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(!extracheeseadded) {
            extracheeseadded = true;
            this.price += 80;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(!extratoppingadded) {
            extratoppingadded = true;
            if (isVeg) {
                this.price += 70;
            } else {
                this.price += 120;
            }
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(!takeaway) {
            takeaway = true;
            price += 20;
        }
    }

    public String getBill(){
        // your code goes here
        if(!billgen) {
            billgen=true;

            bill += "Base Price Of The Pizza: " + this.basePrice + "\n";

            if (extracheeseadded) bill += "Extra Cheese Added: 80\n";

            if (extratoppingadded) {
                if (isVeg)
                    bill += "Extra Toppings Added: 70\n";
                else
                    bill += "Extra Toppings Added: 120\n";
            }

            if (takeaway)
                bill += "Paperbag Added: 20\n";

            bill += "Total Price: " + this.price+"\n";
            return this.bill;
        }
        return "";
    }
}
