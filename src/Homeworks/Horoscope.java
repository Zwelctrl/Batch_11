package Homeworks;

import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        System.out.print("Enter your Birthmonth : ");
        String month = new Scanner(System.in).nextLine();

        System.out.print("Enter your Birthday : ");
        int day = new Scanner(System.in).nextInt();


        if (month.equals("January")) {
            if (day < 20)
                System.out.println("Capricorn");
            else
                System.out.println("Aquarius");
        }
        else if (month.equals("February")) {
            if (day < 19)
                System.out.println("Aquarius");
            else
                System.out.println("Pisces");
        }
        else if(month.equals("March")) {
            if (day < 21)
                System.out.println("Pisces");
            else
                System.out.println("Aries");
        }
        else if (month.equals("April")) {
            if (day < 20)
                System.out.println("Aries");
            else
                System.out.println("Taurus");
        }
        else if (month.equals("May") ) {
            if (day < 21)
                System.out.println("Taurus");
            else
                System.out.println("Gemini");
        }
        else if( month.equals("June")) {
            if (day < 21)
                System.out.println("Gemini");
            else
                System.out.println("Cancer");
        }
        else if (month.equals("July")) {
            if (day < 23)
                System.out.println("Cancer");
            else
                System.out.println("Leo");
        }
        else if( month.equals("August")) {
            if (day < 23)
                System.out.println("Leo");
            else
                System.out.println("Virgo");
        }
        else if (month.equals("September")) {
            if (day < 23)
                System.out.println("Virgo");
            else
                System.out.println("Libra");
        }
        else if (month.equals("October")) {
            if (day < 23)
                System.out.println("Libra");
            else
                System.out.println("Scorpio");
        }
        else if (month.equals("November")) {
            if (day < 22)
                System.out.println("scorpio");
            else
                System.out.println("Sagittarius");
        }
        else if (month.equals("December")) {
            if (day < 22)
                System.out.println("Sagittarius");
            else
                System.out.println("Capricorn");
        }
    }
}
