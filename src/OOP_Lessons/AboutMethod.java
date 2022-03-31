package OOP_Lessons;

public class AboutMethod {

    // instance method
    void math(){
        int a = 23;
        int b = 44;
        int c = a + b;
        System.out.println(c);
    }

    // Static method
    static void walk(){
        for (int i = 0; i < 30; i++) {
            System.out.println("I am coding " + i);
        }
    }


    // parameters usage
    void calculate (int num1, int num2){  // int num1, int num2 are parameters
        System.out.println(num1 + num2);
    }


    public static void main(String[] args) {

        // creating obj for instance method
        AboutMethod obj = new AboutMethod();
        obj.math();
        obj.math();

        //
        obj.calculate(22,33);   // 55   (22,33) are arguments
        obj.calculate(101,333); // 434

        //trigger
        walk();



    }
}

/**
 *  Syntax of methods
 *
 *  access-modifier  non-access-modifier  return-type  method-Name  (Parameter)  =>  Method head
 *  { implementations } => method body
 *
 */


/**
 * Two types of methods
 *
 * 1) Pre-defined method  ( methods include in JDK files )
 * 2) User Defined method ( methods created by users )
 */
