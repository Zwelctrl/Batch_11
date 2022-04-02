package OOP_Lessons;

public class testing {

    int a;
    String b;

    testing (int a, String b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {

        testing obj = new testing(22,"Tun");



        System.out.println(obj.a);
        System.out.println(obj.b);


    }
}
