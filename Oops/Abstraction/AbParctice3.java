package Abstraction;

// 4. Write a Java program to create an abstract class Animal with abstract methods eat() and sleep().
//  Create subclasses Lion, Tiger, and Deer that extend the Animal class and 
//  implement the eat() and sleep() methods differently based on their specific behavior.

abstract class Animals {
    abstract protected void eat();

    abstract protected void sleep();
}

// Subclass 1 lion
class Lione extends Animals {

    // override eat method
    @Override
    public void eat() {
        System.out.println("Lion is eating Meat ");
    }

    // override sleep method
    @Override
    public void sleep() {
        System.out.println("Lion is sleep on Grassland");
    }

}

// Subclass 2 Tiger
class Tiger extends Animals {
    // override eat method
    @Override
    public void eat() {
        System.out.println("Tiger eats meat and occasionally hunts in water.");

    }

    // override sleep method
    @Override
    public void sleep() {
        System.out.println("Tiger is sleeps in Hidden spots");
    }

}

// Subclass 3 Deer
class Deer extends Animals {
    // override eat method
    @Override
    public void eat() {
        System.out.println("Deer is eating Grass and leaves ");
    }

    // override sleep method
    @Override
    public void sleep() {
        System.out.println("Deer is sleeps on open Fildes");
    }

}

public class AbParctice3 {
    public static void main(String[] args) {
        System.out.println("About Lion");
        Lione l = new Lione();
        l.eat();
        l.sleep();

        System.out.println("\nAbout Tiger");
        Tiger t = new Tiger();
        t.eat();
        t.sleep();

        System.out.println("\nAbout Deer");
        Deer d = new Deer();
        d.eat();
        d.sleep();
    }

}
