package Abstraction;

 
 
 abstract class vehicle2{
    abstract void start();

    }
    class Car2 extends vehicle2{
        void start(){
            System.out.println("Car Start With key . ");
        }

    }
    class Truck2 extends vehicle2{
        void start(){
            System.out.println("Truck Start With key . ");
        }
    }
    class Bike extends vehicle2{
        void start(){
            System.out.println("Bike Start With kick . ");
        }
    }
public class Ab2 {
    // create call methode 
    public static void main(String[] args) {

    Car2 car = new Car2();
    car.start();

    Truck2 truck = new Truck2();
    truck.start();

    Bike bike = new Bike();
    bike.start();

    }
    
}
