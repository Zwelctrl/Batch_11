package OOP_Lessons;

class thirdparty{
    public static void main(String[] args) {
        AccessModifier object = new AccessModifier();
        System.out.println(object.b);
        object.random();
    }
}

public class AccessModifier {   // only an original class can have a public modifier

    //fields
    public int a = 22;      // can output both in & out of the package. see:Arrays/testing

    int b = 33;             // can output only in local package

    protected int c = 44;   // can output only in local package

    private int d = 55;     // can output only in it's original class


    /**
     *     Access-modifier are used the same way in fields, methods, constructors
     */


    //methods
    public void random () {
        System.out.println("Random");
    }

    //constructor
    public AccessModifier () {          // if a constructor is in private, the mother can't be accessible from both local & global packages
        System.out.println("Just show something");
    }


    public static void main(String[] args) {

        AccessModifier obj = new AccessModifier();
        System.out.println(obj.d);

        /**
         * Access Modifier
         *
         * used at ,
         *
         * - fields
         * - class
         * - methods
         * - constructor
         */

        /**
         *  Modifier
         *
         *  Access Modifier     =>   public private protected default
         *  Non-access Modifier =>   final abstract static transient synchronized volatile
         */

        /**
         * Access modifier of a class
         *
         * - public
         * - default
         */

        /**
         * Non-access modifier of a class
         *
         * - final
         * - abstract
         */

        /**
         * A .java file has
         *
         *  - class
         *  - fields
         *  - methods
         *  - constructors
         */
    }
}
