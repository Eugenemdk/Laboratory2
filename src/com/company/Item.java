package com.company;

public class Item {
    private String name;
    private float price;


    public Item(String name, float price) {
        this.name = name;
        this.price = price;
    }

    public Item() {

    }

    public float getPrice() {
        return this.price;
    }

    public String getName() {
        return this.name;
    }


    public float decreasePrice(float percent){
        price=(price-percent*(price/100));
        return price;
    }
    public float increasePrice(float percent){
        float res;
        price=price+(percent*(price/100));
        return price;
    }
}
