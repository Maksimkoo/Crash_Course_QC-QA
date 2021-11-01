package com.company;

public class Main {

    public static void main(String[] args) {
        // Створення об'єктів батьківського класу
        Hierarchy t1,t2,t3,t4;

        //створення об'єктів дочірніх класів і надання їм параметрів
        t1 = new Details("Oleg", 5000,3);
        t2 = new Mechanism("Denis", 1300,25);
        t3 = new Product("05.10.2001",4100,2);
        t4 = new Knot("16.06.2010",500,4);
        t1.info();
        System.out.println("\n");
        t2.info();
        System.out.println("\n");
        t3.info();
        System.out.println("\n");
        t4.info();
    }
}


