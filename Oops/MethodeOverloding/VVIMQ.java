package MethodeOverloding;
// Q . Can be ovrload java main() methode ....?
// Ans =  yes we can have 

public class VVIMQ {

     // now ovrload main method in java
    public static void main(String[] args) {
        System.out.println("1");
        VVIMQ t = new VVIMQ();
        t.main(20);
        
    }
    public static void main(int a ) {
        System.out.println("3");
        
        
    }

}
