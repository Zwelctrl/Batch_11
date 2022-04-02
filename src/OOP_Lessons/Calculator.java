package OOP_Lessons;


import java.util.Scanner;

public class Calculator {

    static void sum (int num1, int num2, String operation){
        System.out.println("Your first number "+num1);
        System.out.println("Your second number "+num2);
        System.out.println("Your chose operation == "+operation);
        System.out.println(num1 + num2);
    }

    static void multiply (int num1, int num2,String operation){
        System.out.println("Your first number "+num1);
        System.out.println("Your second number "+num2);
        System.out.println("Your chose operation == "+operation);
        System.out.println(num1 * num2);
    }

    static void subtract (int num1, int num2){
        System.out.println(num1 - num2);
    }

    static void division (int num1, int num2){
        System.out.println(num1 * num2);
    }

    public static void main(String[] args) {

        //

        System.out.print("Enter a number\n" +
                "1 for add\n" +
                "2 for subtract\n" +
                "3 for multiply\n" +
                "4 for division\n :: ");
        int operator = new Scanner(System.in).nextInt();

        System.out.print("Enter First Number : ");
        int first = new Scanner(System.in).nextInt();

        System.out.print("Enter Second Number : ");
        int second = new Scanner(System.in).nextInt();

        if (operator == 1){
            sum(first,second,"sum operation");
        }else if(operator == 2){
            subtract(first,second);
        }else if(operator == 3){
            multiply(first,second,"Multiply Operation");
        }else if(operator == 4){
            division(first,second);
        }

        /////

        //        System.out.print("Enter First Number : ");
//        int input1 = new Scanner(System.in).nextInt();  // cooler way of building Scanner obj
//
//        System.out.print("Enter Operator : \" + - * / \"");
//        String input2 = new Scanner(System.in).nextLine();
//
//        System.out.print("Enter Second Number : ");
//        int input3 = new Scanner(System.in).nextInt();
//
//
//        if (input2.equals("+")){                    // equals() is same as ==
//            System.out.println(input1 + input3);
//        }else if (input2.equals("-")){
//            System.out.println(input1 - input3);
//        }else if (input2.equals("*")){
//            System.out.println( input1 * input3);
//        }else if (input2.equals("/")){
//            System.out.println(input1 / input3);
//        }


    }
}
