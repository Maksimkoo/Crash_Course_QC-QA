package com.company;

public class Mechanism extends Hierarchy {
    String seller;
    public Mechanism(String seller, int price, int quantity_of_product){
        super(quantity_of_product,price);
        this.seller = seller;
    }
    @Override
    public void info(){
        System.out.println("Seller: "+seller+"\nQuantity of product: "+getQuantity_of_product()+"\nPrice: "+getPrice());
    }
}
