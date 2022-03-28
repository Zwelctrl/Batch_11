package OOP_Lessons;

public class testing {

    public static void main(String[] args) {

       int num[] = {11,44,21,678,2,48989,33};

       int current = 0;

        for (int i = 0; i < num.length; i++) {
            for (int i1 = i + 1; i1 < num.length; i1++) {
                if (num[i]>num[i1]){
                    current = num[i];
                    num[i] = num[i1];
                    num[i1] = current;
                }
            }
        }

        for (int i = num.length - 1; i >= 0; i--) {
            System.out.println(num[i]);
        }

}
}
