package OOP_Lessons;

public class creatingObject {

    int a = 11;

    static int s = 22;

    public static void main(String[] args) {

        /**
         * Objects can be created only in main methods.
         *
         *  ClassName objName = new Constructor();
         */

        // You have to build an object to output an instance var
        creatingObject object1 = new creatingObject();
        System.out.println(object1.a);

        // (or)

        // another way to output an instance var
        System.out.println(new creatingObject().a);

        /////////////////////////

        //No need an object to output a static var
        System.out.println(creatingObject.s);

        // (or)

        // this way only works in its parent class
        System.out.println(s);

    }
}



