package OOP_Lessons;

public class ObjectandClass {

        /**
         *   Class has
         *
         *  1) fields (known as variables)
         *  2) methods
        */

        //Global variable

        int globe = 33; // Instance var

        static int gg = 20; // Static var

    public static void main(String[] args) {

        /**
         *  Objects
         *
         *  Objects contain
         *
         *  1) State
         *  2) Behaviour
         *
         *   State
         *   - car =>  has 4 wheels, 4 windows, 1 engines ( these are states )
         *
         *   Behaviour ( also known as method, function )
         *   - human => can eat, can talk, can walk, can run ( these are methods )
         */


        /**
         * Variables
         *
         * variables can be dividend into two
         *
         * 1) Local Variable  ( if a variable is used in local, standard doesn't matter )
         * 2) Global Variable ( if a variable is used in Global, standard is vital )        // exist at the same level as main methods
         *
         *  Global Variables
         *
         *  1) Instance var
         *  2) Static var
         */

        creatingObject obj = new creatingObject();
        System.out.println(obj.a);

        System.out.println(creatingObject.s);
    }
}
