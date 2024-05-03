package KEywords;
//5. this keyword can be used to pass as argument in the  constructor call.
class test{
    
    // create a constructor
    test( Demothis5 td){
        System.out.println("Hello constructor");
    }
}

class Demothis5{

    void m1(){
        test t = new test(this);
        System.out.println("Methode 1");
    }

}
public class Use5_Example {
    public static void main(String[] args) {
        
        Demothis5 td = new Demothis5();
        td.m1();
    }
    
}
