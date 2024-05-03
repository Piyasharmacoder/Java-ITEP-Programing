package INheritance.Consturctor;

// Ager variable ka name same hai methode ke ander to hume use access  kerne ke liye  this keword ka use krna padega
//and this is a way for us to refrence an object of the class which  is  being created  refrenced 

class EkClass {
    int a;

    // use getter
    public int getA() {
        return a;
    }

    // now create a constructor
    EkClass(int a) {
        this.a = a; // this is a reference to the constructor
    }

    // create a methoode
    public int returnOne() {
        return 1;
    }
}

public class thisKeyword {
    public static void main(String[] args) {
        // create a an object
        EkClass e = new EkClass(85);
        System.out.println(e.getA());
    }

}
