package com.company;

public class Cart  {
    private static Item[] stack;
    private static int topIndex;

    public Cart(int capacity){
        this.stack = new Item[capacity];
        this.topIndex=-1;
    }
    public void addItem(Item item){
        push(item);
    }
    public void push(Item item){
        this.topIndex++;
        this.stack[topIndex]=item;

    }

    public Item deleteLastItem(){
    return pop();
    }

    public float countPrices(){
        float sum=0;
        for(int index = 0; index <= this.topIndex; index++)
            sum += this.stack[index].getPrice();

        return sum;
    }

    public void increaseAllPrices(float percent){
        for(int index = 0; index <= this.topIndex; index++) {
            this.stack[index].increasePrice(percent);
        }


    }

    public void decreaseAllPrices(float percent){
        for (int index = 0; index <= this.topIndex; index++)
            this.stack[index].decreasePrice(percent);
    }


    public void showInfo(){
        for(int index = 0; index <= this.topIndex; index++){
            System.out.println("Item has name: "+ this.stack[index].getName()+" and costs: "+ this.stack[index].getPrice());}
    }

    private Item pop() {
        return new Item();
    }

}
