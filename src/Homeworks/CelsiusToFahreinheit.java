package Homeworks;

import java.util.Scanner;

public class CelsiusToFahreinheit {
    public static void main(String[] args) {
        System.out.print("Input Celsius Degree : ");

        double cel = new Scanner(System.in).nextInt();

        double fah = 1.8 * cel + 32;

        System.out.println(fah);

    }
}
