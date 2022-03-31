package OOP_Lessons;

class student{
    int id;
    String name;
}

public class ObjectInit {

    static int ip ;
    public static void main(String[] args) {
        student stu = new student();
        System.out.println(stu.id);     // 0
        System.out.println(stu.name);   //null

        //
        System.out.println(ip);


        stu.id = 223;
        stu.name = "Kyaw Kyaw";

        System.out.println(stu.id);     // Assignment of values to it's fields is called initializing that object
        System.out.println(stu.name);   // Assignment of values to it's fields is called initializing that object

        student student1 = new student();   // build another obj
        student1.id = 969;
        student1.name = "Wiyathu";

        System.out.println(student1.name);
        System.out.println(student1.id);

        /**
         * three ways to initialize an object
         *
         * 1) attributes(fields) => values  // assigning directly to an object's attributes(fields)
         * 2) method =>
         * 3) constructor =>
         *
         */
    }
}
