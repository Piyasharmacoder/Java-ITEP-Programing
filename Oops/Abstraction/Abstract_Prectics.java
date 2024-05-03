package Abstraction;
// 1. Create a abstract class pen with  methodes  write()and refill() as the abstract methodes.
//2. Use  the  pen class  from Q1. to create a concrete  class  fountain pen with additional methode changeNil()  

// Create a abstract class  pen 
abstract class Pen {
    // create methodes write() and refill()
    abstract void write();

    abstract void refill();
    abstract void typeofPen();

}

class fountainPen extends Pen {

    void write() {
        System.out.println("\nI am writing");
    }

    void refill() {
        System.out.println("I am refilling the Pen ");
    }
    void typeofPen(){
        System.out.println("Type of Pen : Boll pen");
    }

    // create a methode changeNib()
    void changeNib() {
        System.out.println("I am changing the nil of Pen\n");
    }

}

public class Abstract_Prectics {
    public static void main(String[] args) {
        fountainPen fp = new fountainPen();
        fp.write();
        fp.refill();
        fp.typeofPen();
        fp.changeNib();

    }

}
