package OOP_Lessons;

class house {
    int doors = 3;

    void multiLevel () {
        System.out.println("Multi Level inheritance");
    }
}

class garage extends house{
    int key = 5;

    void fuel(){
        System.out.println("consume feuls");
    }
}

class kitchen extends house{    // garage & kitchen inherited from the same class "house", that is hierchical inheritance.
    int oven = 4;

    void fridge () {
        System.out.println("So cool");
    }
}

class car extends garage{   // inherited
    int hp;

    void drive(){
        System.out.println("Driving");
    }
}

class bike extends garage{   // inherited
    int wheels;

    void speed() {
        System.out.println("Faster than any vehicles");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        garage obj0 = new garage();
        System.out.println(obj0.doors);

        car obj1 = new car();
        obj1.fuel();
        System.out.println(obj1.key);   // single inheritance
        obj1.multiLevel();          // multi level inheritance

        bike obj2 = new bike();
        obj2.key=1;     // value changed
        System.out.println(obj2.key);   // single inheritance
        System.out.println(obj2.doors); // multi level inheritance

        kitchen obj3 = new kitchen();
        obj3.fridge();

    }
}

/**
 * 5 types of Inheritance
 *
 * 1) Single            // parents > child
 * 2) multi level       // grand parents > parents > child
 * 3) hierarchical      // multiple child objects inherited from the same parent
 * 4) multiple
 * 5) hybrid
 */
