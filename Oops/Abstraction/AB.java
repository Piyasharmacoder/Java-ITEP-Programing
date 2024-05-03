package Abstraction;

// ctrate a  a abstrac class 
 abstract class perents {
    // ctrate a constructor
     public perents() {
        System.out.println("Im a constructor of perenst class");
    }

    // ctrate a method
    public void sayHellow() {
        System.out.println("Hellow ");
    }

    // create a abstract method
    abstract public void greet2();

}
class child1 extends perents{
    @Override
    public void greet2(){
        System.out.println("Good Morninig");
    }

}
class  child2 extends perents{
    @Override
    public void greet2(){
        System.out.println("Suwagtam");
    }
}

public class AB {
    public static void main(String[] args) {

        child1 ch1 = new child1();
        ch1.greet2();
        System.out.println("\n");
        child2 ch2 = new child2();
        ch2.greet2();
    }  

}
