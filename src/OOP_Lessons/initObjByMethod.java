package OOP_Lessons;

public class initObjByMethod {

    int id;
    String name;

    void identity (int num, String text) {
        this.id = num;
        this.name = text;
    }

    public static void main(String[] args) {
        initObjByMethod obj = new initObjByMethod();
        obj.identity(22,"Thura Soe");

        System.out.println(obj.id);     // 22
        System.out.println(obj.name);   // Thura Soe
    }

}

