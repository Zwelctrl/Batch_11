package Homeworks;

import java.util.Scanner;

public class PhoneBillPackage {
    public static void main(String[] args) {
        System.out.print("> ");
        String init = new Scanner(System.in).nextLine();
        System.out.println(init);

        if (init.equals("*106#")) {
            System.out.print(
                    "1.Voice\n" +
                    "2.Data\n" +
                    "3.အထူးလက်ဆောင်\n" +
                    "4.Htaw B\n" +
                    "5.စာရင်း\n" +
                    "6.Bal\n" +
                    "7.MPTClub\n" +
                    "8.VAS\n" +
                    "9.ဘာသာ\n" +
                    ">>: ");

            int option = new Scanner(System.in).nextInt();

            if (option == 1){
                System.out.print(
                        "1.619min == 3900Ks\n" +
                        "2.234min == 1500Ks\n" +
                        "3.132min = 850Ks\n" +
                        "4.50 min = 399Ks\n" +
                        "5.More"
                );
            } else if (option == 2){
                System.out.print(
                        "1.Daily\n" +
                                "2.DataCarry+\n" +
                                "3.Casual\n" +
                                "4.Night\n" +
                                "5.NightSafety\n" +
                                "6.Roaming\n" +
                                "7.Special\n" +
                                ">"
                );

                int dataOpt = new Scanner(System.in).nextInt();

                if (dataOpt == 1){
                    System.out.print(
                            "80MB Data Pack ကို 299 ကျပ်ဖြင့် တစ်ရက်စာ၀ယ်ယူမည်။\n" +
                                    "1. အတည်ပြုပါသည်။\n" +
                                    "0. နောက်သို့"
                    );
                }else if (dataOpt == 2) {
                    System.out.println(
                            "1.699Ks = 250MB\n" +
                            "2.799Ks=350MB\n" +
                            "3.979Ks/999Ks=470MB\n" +
                            "4 1279Ks/1299Ks=615MB"
                    );
                }
            }else if(option == 3){
                System.out.print("1.480MB=999Ks(30D)\n" +
                        "2.260MB=549Ks(30D)\n" +
                        "3.60Min(MPT)=399Ks(7D)\n" +
                        "4.40Min(A nn*3.nex)");

                int specGiftOpt = new Scanner(System.in).nextInt();
            }
        }else {
            System.out.println("Invalid Number");
        }

        // *106# to initiate
    }
}
