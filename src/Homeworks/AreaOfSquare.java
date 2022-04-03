package Homeworks;

import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        System.out.print("Input Side of sqaure : ");

        float side = new Scanner(System.in).nextFloat();

        float area = side * side;
        System.out.println(area);
    }
}
