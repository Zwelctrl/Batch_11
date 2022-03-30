package OOP_Lessons;

public class testing {

    public static void main(String[] args) {

       int num[] = {1,23,44,64,6656,35};

       int current = 0;

        for (int i = 0; i < num.length; i++) {
            if(num[i]>current){
                current = num[i];
            }
        }

        System.out.println(current);

}
}
