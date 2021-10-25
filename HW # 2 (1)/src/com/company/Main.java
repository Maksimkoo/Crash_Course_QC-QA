package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter X value :");
        int x = sc.nextInt();
        System.out.println("Enter Y value :");
        int y = sc.nextInt();

        System.out.println("Enter A value :");
        int a = sc.nextInt();
        System.out.println("Enter B value :");
        int b = sc.nextInt();
        System.out.println("Enter C value :");
        int c = sc.nextInt();

        int hole_area = x * y;
        int bc_area = b * c;
        int ca_area = c * a;
        int ba_area = b * a;

        if (hole_area >= bc_area){
            System.out.println("The brick will pass !");
        }
        else if (hole_area >= ca_area){
            System.out.println("The brick will pass !");
        }
        else if (hole_area >= ba_area){
            System.out.println("The brick will pass !");
        }
        else {
            System.out.println("The brick will NOT pass !");
        }
    }
}
