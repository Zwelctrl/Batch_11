package Homeworks;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        System.out.print("Enter a number to find its factorial : ");

        long fac = new Scanner(System.in).nextInt();
        long a = 1;

        for (long i = 1; i <= fac; i++) {
            a = a * i;
        }

        System.out.println(a);

        //
        System.out.print("Enter a number to find its factorial : ");

        int fact = new Scanner(System.in).nextInt();
        int b = 1;

        for (int i = 1; i <= fact; i++) {
            b = b * i;
        }

        System.out.println(b); // input = 5 , output = 120

    }
}
