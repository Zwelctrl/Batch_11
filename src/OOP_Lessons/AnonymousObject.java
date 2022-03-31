package OOP_Lessons;

class employee{
    int id;
    String name;

    int e =3,r =2,t =5;
}

public class AnonymousObject {
    public static void main(String[] args) {

        // anonymous objects aint the same
        System.out.println(new employee()); // new employee() == Anonymous objects
        System.out.println(new employee()); // new employee() == Anonymous objects

        // declare multiple var in the same data type
        int a=1,b=2,c=3;

        // build multiple obj
        employee obj = new employee(), obj1 = new employee(),obj2 = new employee();

        System.out.println(obj1.t);
    }
}
