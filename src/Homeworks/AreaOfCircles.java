package Homeworks;

import java.util.Scanner;

public class AreaOfCircles {
    public static void main(String[] args) {
        System.out.print("Input the radius of the circle :  ");
        float radius = new Scanner(System.in).nextFloat();
        float pi = 3.145f;

        float area = pi * radius * radius;
        System.out.println("The Area of circle is " + area + "meters");
    }
}
