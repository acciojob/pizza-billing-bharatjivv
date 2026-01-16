package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private Boolean extraCheeseAdded = false;
    private Boolean extraToppingsAdded = false;
    private Boolean takeawayAdded = false;
    private String bill = "";

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;

        if(isVeg){
            this.price = 300;
        } else {
            this.price = 400;
        }

        bill += "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(!extraCheeseAdded){
            price += 80;
            bill += "Extra Cheese Added: 80\n";
            extraCheeseAdded = true;
        }
    }

    public void addExtraToppings(){
        if(!extraToppingsAdded){
            if(isVeg){
                price += 70;
                bill += "Extra Toppings Added: 70\n";
            } else {
                price += 120;
                bill += "Extra Toppings Added: 120\n";
            }
            extraToppingsAdded = true;
        }
    }

    public void addTakeaway(){
        if(!takeawayAdded){
            price += 20;
            bill += "Paperbag Added: 20\n";
            takeawayAdded = true;
        }
    }

    public String getBill(){
        bill += "Total Price: " + price + "\n";
        return bill;
    }
}
