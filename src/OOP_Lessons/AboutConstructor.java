package OOP_Lessons;

public class AboutConstructor {

    // 0 argument constructor (work at the same time when the object is built)
    AboutConstructor(){
        System.out.println("Nice to meet you Constructor");
    }

    int b;
    String name;

    // intialize the object using constructor
    AboutConstructor(int in,String input){  // parameterized constructor
        this.b = in;
        this.name = input;
    }

    // built-in constructor
//    public AboutConstructor(int a, String name) {
//        this.a = a;
//        this.name = name;
//    }
    // see testing.java

    public static void main(String[] args) {

        AboutConstructor obj = new AboutConstructor(22,"Kyaw Kyaw");    // fancy aint it?
        System.out.println(obj.b);
        System.out.println(obj.name);




        /**
         *  Syntax
         *
         *  Classname(){}       // should use accurate class name
         *
         *  no argument constructor exits even if you dont build one, JVM builds it by default
         */

        /**
         *  Difference between Constructor & Method
         *
         *  - Constructor uses accurate same name as Classname
         *  - Method name is flexible but only in small letter
         *  - Constructor works as the object is initialized
         *  - Methods work only when they are used.
         */
    }
}
