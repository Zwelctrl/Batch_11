package OOP_Lessons;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        System.out.print("Enter your first number : ");
        int input1 = new Scanner(System.in).nextInt(); // cooler way of building Scanner obj

        System.out.print("Enter your second number : ");
        int input2 = new Scanner(System.in).nextInt();

        System.out.print("Choose one operator \" + - * / \" : ");
        String input3 = new Scanner(System.in).nextLine();  // operators are string

        if(input3.equals("+")){
            System.out.println(input1+input2);
        }else if(input3.equals("-")){
            System.out.println(input1-input2);
        }else if(input3.equals("*")){
            System.out.println(input1*input2);
        }else if(input3.equals("/")){
            System.out.println(input1/input2);
        }
    }
}
