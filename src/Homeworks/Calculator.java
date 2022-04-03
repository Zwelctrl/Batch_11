package Homeworks;

import java.util.Scanner;

public class Calculator {

    void add (int num1, int num2){
        System.out.println(num1 + num2);
    }

    void subtract(int num1, int num2){
        System.out.println(num1 - num2);
    }

    void multiply (int num1, int num2){
        System.out.println(num1 * num2);
    }

    void division (int num1, int num2) {
        System.out.println(num1 / num2);
    }


    public static void main(String[] args) {

        Calculator obj = new Calculator();

        //num1
        System.out.print("Enter first number : ");
        int a = new Scanner(System.in).nextInt();

        //operators
        System.out.print("1 for Add\n" +
                "2 for substract\n" +
                "3 for multiply\n" +
                "4 for division\n");

        int operators = new Scanner(System.in).nextInt();

        //num2
        System.out.print("Enter Second Number : ");
        int b = new Scanner(System.in).nextInt();

        if (operators == 1){
            obj.add(a,b);
        } else if ( operators == 2){
            obj.subtract(a,b);
        } else if ( operators == 3) {
            obj.multiply(a,b);
        } else if ( operators == 4) {
            obj.division(a,b);
        }
    }
}
