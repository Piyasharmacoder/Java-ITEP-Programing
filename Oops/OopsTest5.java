//Create a class Tommyvecettil for Rocster games capblie to hitting ( print hittig , running , fringing  ects )

class Tommy {
    // methode 1 hitting
    public void hit() {
        System.out.println("Hiting the Enemies ");
    }

    // methode 2 runing
    public void run() {
        System.out.println("Running from the Enemies ");
    }

    // methode 3 Fire
    public void fire() {
        System.out.println("Fireing on the  Enemies ");
    }

}

public class OopsTest5 {
    public static void main(String[] args) {
        Tommy tom = new Tommy();
        tom.hit();
        tom.run();
        tom.fire();

    }
}
