package OOP_Lessons;

class test {
    public static void main(String[] args) {
        NonAccessModifier object = new NonAccessModifier();

//       object.a = 55;                 // cannot assign a value to final variable

        System.out.println(object.a);
    }
};


public class NonAccessModifier {
    final int a = 33;           // cannot assign a value to final variable

    public static void main(String[] args) {
        NonAccessModifier obj = new NonAccessModifier();

    }
}

/**
 * Non- Access modifier
 *
 * Used at,
 *
 * - fields
 * - class
 * - methods
 */

/**
 *  Modifier
    *
    *  Access Modifier     =>   public private protected default
    *  Non-access Modifier =>   final abstract static transient synchronized volatile
    */

    /**
    * A .java file has
    *
    *  - class
    *  - fields
    *  - methods
    *  - constructors
    */

    /**
     * Non-access modifier of a class
     *
     * - final
     * - abstract
     */
