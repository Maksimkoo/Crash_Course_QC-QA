package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Roaming in the Poland is:  ");
        float c1 = in.nextFloat();
        c1 = check_number_greater_then_zero(c1);

        System.out.print("Roaming in the Ukraine is:  ");
        float c2 = in.nextFloat();
        c2 = check_number_greater_then_zero(c2);

        System.out.print("Roaming in the Kanada is:  ");
        float c3 = in.nextFloat();
        c3 = check_number_greater_then_zero(c3);
/////////////////////////////////////////////////////////////////////
        System.out.print("Time of the first(Poland) call is:  ");
        float t1 = in.nextFloat();
        t1 = check_number_greater_then_zero(t1);

        System.out.print("Time of the first(Ukraine) call is:  ");
        float t2 = in.nextFloat();
        t2 = check_number_greater_then_zero(t2);

        System.out.print("Time of the first(Kanada) call is:  ");
        float t3 = in.nextFloat();
        t3 = check_number_greater_then_zero(t3);

        float result_1 = c1 * t1;
        float result_2 = c2 * t2;
        float result_3 = c3 * t3;
        float resultAll = result_1 + result_2 + result_3;

        System.out.println("The cost of the first(Poland) call is: " + result_1);
        System.out.println("The cost of the second(Ukraine) call is: " + result_2);
        System.out.println("The cost of the third(Kanada) call is: " + result_3);
        System.out.println("The cost of all calls are: " + resultAll);
        in.close();
    }

    static float check_number_greater_then_zero(float number) {
        Scanner in_temp = new Scanner(System.in);
        while(number <= 0) {
            System.out.println("Value must be positive");
            System.out.println("Input positive value: ");
            number = in_temp.nextFloat();
        }
        return number;
    }
}
