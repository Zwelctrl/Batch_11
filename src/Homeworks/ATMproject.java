package Homeworks;


import java.util.Scanner;

public class ATMproject {

    static void rewind () {
        System.out.print("Press 1 to check your balance : \n" +
                "Press 2 to withdraw cash : \n" +
                "Press 3 to Add cash : \n" +
                " =>>> : ");

        int func = new Scanner(System.in).nextInt();
    }

    static void checkbalance (int bal) {
        System.out.println("Your remaining balance = " + bal + "MMK");
    }

    static void notice () {
        System.out.println("You dont have sufficient amount to withdraw");
    }

    public static void main(String[] args) {

        int balance = 100000;
        System.out.print("Your Balance is " + balance + "MMK\n" +
                "Press 1 to check your balance : \n" +
                "Press 2 to withdraw cash : \n" +
                "Press 3 to Add cash : \n" +
                " =>>> : "
                );

        int func = new Scanner(System.in).nextInt();

        if (func == 1){
            checkbalance(balance);
        } else if (func == 2){
            System.out.print("Type the amount you want to withdraw : ");
            int withdrawCash = new Scanner(System.in).nextInt();

            if (withdrawCash < balance){
                System.out.println("Here is your requested amount =" + withdrawCash + "MMK");
                checkbalance(balance - withdrawCash);
            } else if (withdrawCash > balance) {
                notice();
            }

        } else if (func == 3){
            System.out.print("Input the amount you want to add : ");
            int addCash = new Scanner(System.in).nextInt();

            checkbalance(balance + addCash);
        }

    }

}
