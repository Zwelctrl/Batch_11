package OOP_Lessons;

public class testing {

    int num = 22;
    String name = "KyawKyaw";
    static String title = "Navy";

    public static void main(String[] args) {
        testing obj = new testing();
        System.out.println(obj.name);

        System.out.println(new testing().num);

        /// output from student class
        System.out.println(new student().id);
    }
}
