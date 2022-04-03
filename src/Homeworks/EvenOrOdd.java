package Homeworks;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        System.out.print("Insert your number : ");

        int num = new Scanner(System.in).nextInt();

        if (num % 2 == 0){
            System.out.println("Your number is Even");
        }else{
            System.out.println("Your number is Odd");
        }



    }
}
