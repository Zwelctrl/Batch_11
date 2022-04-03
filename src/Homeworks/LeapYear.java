package Homeworks;

import javax.xml.transform.Source;
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        System.out.print("Enter Year : ");

        int year = new Scanner(System.in).nextInt();

        if (year % 4 == 0) {
            System.out.println("Your year is a Leap Year");
        } else {
            System.out.println("Your year is not a leap year");
        }


    }
}
