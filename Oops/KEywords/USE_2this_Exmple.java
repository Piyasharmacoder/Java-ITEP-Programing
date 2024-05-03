package KEywords;
//use  : 2 use of this keyword practicaly exmple

//2. this keyword can be used to invoke the current class methode ( implicitly). 

class Exmple2This {
    // crate a methode
    void display() {
        System.out.println("Hello");
    }

    // crate a methode2
    void print() {
        // now call methode1
        // ager hum yaha this.kryword ka nai krte hai to complier by default use this keword
        // this.display(); or display() dono same hai or same hi output provide karega 

         display(); // output : Hello


        this.display();   // output : Hello

    }

}

public class USE_2this_Exmple {
    public static void main(String[] args) {

        Exmple2This obj = new Exmple2This();
        obj.print();

    }

}
