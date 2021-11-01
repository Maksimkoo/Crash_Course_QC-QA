package com.company;

public abstract class Hierarchy {

    private int quantity_of_product;
    private int price;

    public Hierarchy(int quantity_of_product, int price){
        this.quantity_of_product = quantity_of_product;
        this.price = price;
    }
    public int getPrice() {
        return price;
    }
    public int getQuantity_of_product() {
        return quantity_of_product;
    }
    public abstract void info();
}
