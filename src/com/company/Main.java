package com.company;
public class Main {
    public static void main(String[] args) {
        Cart cart =new Cart(10);
        Item item=new Item("macintosh",1500);
        Item item2=new Item("HP",2500);
        Item item3=new Item("Dell",3500);
        Item item4=new Item("Samsung",4500);
        Item item5=new Item("Sony",5500);

        cart.addItem(item);
        cart.addItem(item2);
        cart.addItem(item3);
        cart.addItem(item4);
        cart.addItem(item5);
        cart.showInfo();
        System.out.println();
        cart.increaseAllPrices(15);
        cart.showInfo();
        System.out.println();
        System.out.println("Total sum of prices: "+cart.countPrices());
        cart.decreaseAllPrices(30);
        System.out.println();
        cart.showInfo();
        System.out.println();
        System.out.println("Total sum of prices: "+cart.countPrices());
        //cart.showInfo();

    }
}