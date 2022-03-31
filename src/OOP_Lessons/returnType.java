package OOP_Lessons;

public class returnType {

    int multiple (int num1, int num2) {
        System.out.println("This method is working " + (num1 + num2));
        return 0;
    }

    String msg () {
        return "Hello World";
    }

    //

    int multi (int aa, int bb){
        return aa * bb;     // nothing shall comes after return type.
    }

    String text () {
        return "Method text";
    }

    public static void main(String[] args) {
        returnType obj = new returnType();
        obj.msg();
        obj.multiple(22,44);

        // return values come out only when you output that method
        System.out.println(obj.multi(11,33));

        String last = obj.text();
        System.out.println(last);   // Method text
        System.out.println(obj.msg());  // Hello World


    }
}
