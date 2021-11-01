package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double number1, number2;
        while (true) {
            try {
                System.out.println("Please, enter first double number: ");
                number1 = Double.parseDouble(in.nextLine().trim().replace(",", "."));
                System.out.println("Please, enter second double number: ");
                number2 = Double.parseDouble(in.nextLine().trim().replace(",", "."));
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input error! Please, enter only a DOUBLE number!");
            }
        }

        try {
            double result1 = div(number1, number2);
            System.out.println("The result of the division:  " + result1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        main();
    }
    static double div ( double number1, double number2) throws Exception {
        if (number1 / number2 == 4.0 / 0 || number1 / number2 == -4.0 / 0)
            throw new Exception("Error!!!  You divided by 0!!!");
        return number1 / number2;
    }

    static int readNumber ( int start, int end) throws Exception {
        int number;
        Scanner in = new Scanner(System.in);
        while (true) {
            try {
                System.out.println();
                System.out.println("Please, enter integer number: ");
                number = Integer.parseInt(in.nextLine().trim());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Input error! Please, enter only an INTEGER number!");
            }
        }
        if (number > end || number < start)
            throw new Exception("Entered number is not in the range [" + start + "-" + end + "]");
        return number;
    }

    static void main () {
        int number, nextnum = 1;
        int arr[] = new int[10];

        for (int i = 0; i < arr.length; ++i) {
            while (true) {
                try {
                    arr[i] = nextnum = readNumber(nextnum, 100);
                    break;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }

        }

        for (int j = 0; j < arr.length - 1; ++j) {
            System.out.print(arr[j] + " < ");
        }
        System.out.print(arr[9]);
    }
}