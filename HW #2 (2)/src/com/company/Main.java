package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number: ");
        int a = sc.nextInt();

        String myStr = String.valueOf(a * a);

        
        StringBuilder reversedInt = new StringBuilder();
        reversedInt.append(a);
        reversedInt.reverse();


        StringBuilder swapped = new StringBuilder();
        swapped.append(a);
        char first = swapped.charAt(0);
        swapped.setCharAt(0, swapped.charAt(swapped.length()-1));
        swapped.setCharAt(swapped.length()-1, first);


        StringBuilder addOne = new StringBuilder();
        addOne.append(a);
        addOne.insert(0, 1);
        addOne.insert(addOne.length(), 1);


        System.out.println(myStr.contains("3"));
        System.out.println(reversedInt);
        System.out.println(swapped);
        System.out.println(addOne);
    }
}
