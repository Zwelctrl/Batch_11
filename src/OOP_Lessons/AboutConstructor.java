package OOP_Lessons;

public class AboutConstructor {

    // 0 argument constructor (work at the sme time when the object is built)
    AboutConstructor(){
        System.out.println("Nice to meet you Constructor");
    }

    public static void main(String[] args) {

        new AboutConstructor();
        new AboutConstructor();
        new AboutConstructor();


        /**
         *  Syntax
         *
         *  Classname(){}
         */
    }
}
