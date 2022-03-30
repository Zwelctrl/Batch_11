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

        creatingObject object1 = new creatingObject();
        System.out.println(object1.a);

    }
}



