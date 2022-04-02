package OOP_Lessons;

public class BankingSystem {

    int id;
    String name;
    double amount;

    BankingSystem(int id,String name,double amount){
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

    void addmoney (double amt){
        //amount = amount + amt;
        // (or)
        amount += amt;
    }

    void withdraw (double a){
        if (a > amount){
            System.out.println("You dont have sufficent amount for withdrawal");
        } else {
            amount -= a;
            System.out.println("Your current balance is "+ amount);
        }
    }

    public static void main(String[] args) {

        // for user 1 ...
        BankingSystem user1 = new BankingSystem(1,"MgMg",10000);
        System.out.println(user1.amount);

        // adding amount
        user1.addmoney(40000.23);
        System.out.println(user1.amount);

        // withdraw amount
        user1.withdraw(20000);

        //for user 2 ...
        BankingSystem user2 = new BankingSystem(2,"KyawKyaw",300000);
        System.out.println(user2.amount);

        // adding amount
        user2.addmoney(3440000.23);
        System.out.println(user2.amount);

        // withdraw amount
        user2.withdraw(500000);


    }
}
