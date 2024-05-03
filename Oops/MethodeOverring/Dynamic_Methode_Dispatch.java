package MethodeOverring;

// create a new class and this is superclass
 class Phone{
    // create a methode1 
     public void greet(){
        System.out.println("Good Mornings");

     }
    // create a methode2 
    public void name(){
        System.out.println("My name is Piyanka");
    }
 }
// This  is a Subclass
 class SmartPhone extends Phone{

    // create a methode3
     public void Swagt(){
        System.out.println("Welcome guys ");
     }

     @Override
    // create a methode 4 
    public void name(){
        System.out.println("My name is Raj");
    }
 }

public class Dynamic_Methode_Dispatch {
    public static void main(String[] args) {
         //  create an  object
        //   Phone obj = new Phone();
        //   obj.name();
        //   obj.greet();
        //   System.out.println();

        //   SmartPhone obj2 = new SmartPhone();
        //   obj2.name();
        //   obj2.Swagt();
         

        // Dyanamic_Methode_Dispatch

        Phone obj =  new SmartPhone();  // ye possible hai  kuki new class me old class ki properties or functionality present ho sakti hai ye inherit kr sakta hai 
        obj.name();
        obj.greet();
        
        //  SmartPhone obj2 = new Phone();   // but ye nai becuse kuki old class kabhi bhi new class ki functionality ko inheret nai kr skati 
    }
}
