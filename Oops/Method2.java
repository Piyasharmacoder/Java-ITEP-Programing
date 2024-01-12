// cretion of methode in java
class Dog {
    String name;
    int license_ID;

    public void eat() { // methode
        System.out.println(name + " eats! ");

    }
}

public class Method2 {
    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.name = " Brunno";
        dog1.eat();
    }

}
