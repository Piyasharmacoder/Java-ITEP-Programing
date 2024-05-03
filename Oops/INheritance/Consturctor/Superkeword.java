package INheritance.Consturctor;
// Superkeword -: superkeword ek  refrence variable hai jo  ki use hota hai  immediate present class ke boject ko refer krne ke liye 

// now we can say that "A super keword is a reference  variable used to refer  immediate present class object"
// * use of superkeword : - 1 . present class  me koi instance variable hai or hum usko access krna chate hai tab 
//                              (can be used to refer immediate present class instance variable)

//                          2.  can be used to  inobke present class methode 

//                           3. can be used to inobke present class constructors

class DoClass extends EkClass {
    // create a constructor
    DoClass(int b) {
        super(b);
        System.out.println("I'm a constructor");
    }

}

public class Superkeword {
    public static void main(String[] args) {
        // create and call object
        DoClass d = new DoClass(5);

    }

}
