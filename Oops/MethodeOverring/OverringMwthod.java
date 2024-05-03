package MethodeOverring;

//  if  the  chlid class is implements the sama  methode present in the  parent class again  it  is  know as  methode Overriding 
// Redefining  the methode of Super class 



class A{
    public int x;
    // create a methode 1
    public int meth1(){
        return 4;
    }
        
    // create a methode 2
    public void  meth2( ){
    System.out.println("I am a methode 2 of class A  ");
    } 
}
    //now create a class 2
    class B extends A{
        @Override
        // create a methode 3
        public void meth2(){
            System.out.println( "I am a methode 2 of class B");
        }
        // create a methode 4
        public void meth3(){
            System.out.println( "I am a methode 3 of class B");
        }

    }
public class OverringMwthod {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b  = new B();
        b.meth2();
        
        
        
    }
    
}
