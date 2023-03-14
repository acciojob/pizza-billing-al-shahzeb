package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;

    private Boolean extracheeseadded=false;
    private Boolean extratoppingadded=false;

    private Boolean takeaway=false;

    private boolean isdelux=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        // your code goes here
        bill="";
        if(isVeg) {
            this.price = 300;

        }
        else {
            this.price = 400;
        }

    }

    public void addPrice(int price) {
        isdelux=true;
        this.price += price;
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        extracheeseadded=true;
        this.price+=80;
    }

    public void addExtraToppings(){
        // your code goes here
        extratoppingadded=true;
        if(isVeg) {
            this.price += 70;
        }
        else {
            this.price += 120;
        }
    }

    public void addTakeaway(){
        // your code goes here
        takeaway=true;
        price+=20;
    }

    public String getBill(){
        // your code goes here
        if(isdelux){
            if(isVeg)   bill+="Base Price Of The Pizza: 450\n";
            else    bill+="Base Price Of The Pizza: 600\n";
        }
        else {
            if (isVeg) bill += "Base Price Of The Pizza: 300\n";
            else bill += "Base Price Of The Pizza: 400\n";
        }

        if(extracheeseadded)    bill+="Extra Cheese Added: 80\n";

        if(extratoppingadded){
            if(isVeg)
                bill+="Extra Toppings Added: 70\n";
            else
                bill+="Extra Toppings Added: 120\n";
        }

        if(takeaway)
            bill+="Paperbag Added: 20\n";

        bill+="Total Prise: "+this.price;
        return this.bill;
    }
}
