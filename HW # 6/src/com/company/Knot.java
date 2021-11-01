package com.company;

public class Knot extends Hierarchy {
    String month;
    public Knot (String month, int price, int quantity_of_product){
        super(quantity_of_product, price); // звернення до батьківського конструктора
        this.month = month;
    }
    //перевантаження оператора
    @Override
    public void info(){
        System.out.println("Date of manufacture of the product: "+month+"\nQuantity of product: "+getQuantity_of_product()+"\nPrice: "+getPrice());
    }
}
