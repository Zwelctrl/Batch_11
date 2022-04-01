package OOP_Lessons;

import java.sql.SQLOutput;
import java.util.Scanner;

public class scannerInput {

    public static void main(String[] args) {
        // Usage of predefined methods


        System.out.print("Enter your name : ");

        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        System.out.println(name + " is taken.");

        //
        System.out.println("<<<<>>>>");
        //

        //
        System.out.print("Enter your Age : ");

        Scanner putin = new Scanner(System.in);
        int num = putin.nextInt();

        if ( num%2 == 0){
            System.out.println("Your num is even");
        } else {
            System.out.println("Your num is odd");
        }

        // Login example

        System.out.print("Enter Your Password :");

        Scanner input1 = new Scanner(System.in);
        String key = input1.nextLine();

        if (key == "kyaw"){
            System.out.println(key == "kyaw");
            System.out.println("Correct");
        } else {
            System.out.println(key == "kyaw");
            System.out.println("Incorrect");
        }

    }
}
