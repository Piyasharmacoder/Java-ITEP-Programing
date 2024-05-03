package INheritance.Consturctor;
//importent Note :-  Now Constructs are always excuted in the TOP to BOTTOM order like ->
//                                              C1
//                                               |
//                                              C2
//                                               |
//                                              C3

// Constructors During constructor overloading :- when there are multiple constructors in the parent class the constructor without any  parameters
//                                               is  calling from the chilld class.  if we want to call the constructor with parameters from 
//                                            the parent class ,we can use the (Super keyword) 



class Base1 {
    // constructor1
    Base1() {
        System.out.println("I'm an a Constructor");
    }

    // constructor overloding
    Base1(int x) {
        System.out.println("I'm an a overloaded Constructor with value  of x  as : " + x);
    }

    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I'm in base class and Set X now .");
        this.x = x;
    }
}
// __________________________________________________________________________________________________________________________________

class Derrive1 extends Base1 {
    Derrive1() {

        // super(0);

        System.out.println("I'm an a Derrive Constructor");
    }

    Derrive1(int x, int y) {
        super(x);
        System.out.println("I'm an a overloaded Constructor  of Derrived with value  of  y  : " + y);

    }

    public int y;

    public int getX() {
        return y;
    }

    public void set(int y) {
        System.out.println("I'm in Derrive Base1 class and Set y now .");
        this.y = y;
    }

}

// __________________________________________________________________________________________________________________________________

// create a new Derrive
class childOfDerrived extends Derrive1 {
    childOfDerrived() {
        System.out.println("I'm an a child Of Derrived Constructor");
    }

    // now overload constructor
    childOfDerrived(int x, int y, int z) {
        super(x, y);
        System.out.println("I'm an a overloaded Constructor  of Derrived with value  of  z as   : " + z);
    }
}

// __________________________________________________________________________________________________________________________________

class Derrive2 extends Derrive1 {
    Derrive2() {
        System.out.println("I'm an a Derrive2 Constructor");

    }

    public int z;

    public int getX() {
        return z;
    }

    public void set(int z) {
        System.out.println("I'm in Derrive2 Base1 class and Set z now .");
        this.z = z;
    }
}

// __________________________________________________________________________________________________________________________________

public class C1 {

    public static void main(String[] args) {

        System.out.println("\n__________________________Base1 class ________________________________");
        Base1 obj = new Base1();

        System.out.println("\n__________________________Derrived1 class ________________________________");
        Derrive1 d = new Derrive1(8, 8);

        System.out.println("\n__________________________childOfDerrived class ________________________________");
        childOfDerrived cd = new childOfDerrived(12,23,25);

        System.out.println("\n______________________________Derrived2 class________________________________________");
        Derrive2 z = new Derrive2();

    }
}
