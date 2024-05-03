package Abstraction;
// create a class  monkey with the jump() and bite()methodes .Create a class Human  which inhertes 
// this monkey class and  impliments BasicAnimal interface with  eat() and sleep()methods 
// And Demonstrate polymorphism using  monkey  claass from 

// class monkey with jump() and bite() mmethods
 class Monkey{
    void  jump(){
        System.out.println("Monkey is jumping");
    }
    void  bite(){
        System.out.println("Monkey is biting");
    }

}
//create interface  BasicAnimal  naam ki uske 2 method  eat() and sleep() banya
interface BasicAnimal{
    void eat();
    void sleep();
}

// ek Human claas banya jo extends kerti hai Monkey class ko  or  implenment kerti hai BasicAnimal interface ko 
class Human extends Monkey implements BasicAnimal{
     void speak(){
        System.out.println("Human is speaking");
    }

    @Override 
    // interface methode ko hamesha public lagkr hi impliment kr skte hai 
      public void sleep(){
        System.out.println("Human is sleeping");
    }

    @Override
    public  void eat(){
        System.out.println("Human is eating");
    }

}

public class Abstract_Prectics1 {
    public static void main(String[] args) {
        Human  human = new Human();
        human.jump();
        human.bite();
        human.speak();
        human.eat();
        human.sleep();

        // Demomstrate polymorphism
        Monkey m = new Human();
        // m.speak();     --> Cannot  use  speak method because the refrence is monkey is which does not have speak method. 
        m.jump();
        m.bite(); 
    }

    
}
