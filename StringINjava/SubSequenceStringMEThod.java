package StringINjava;
// SubSequence  methodes = >the subSequence method(int beignIndex,int endIndex) methode return a CharSequence.
//                          the subSequence  starts with the char value at the end of the Specified index and
//                          ends with the char value at (end -1).
// It throw (java.lang.StringIdexOutOfBoundsException )if  any  index  position  value is negative .                         

public class SubSequenceStringMEThod {
    public static void main(String[] args) {
        
    String str = "This is a Demo";
    System.out.println(str.subSequence(0,8));  // this is 
    System.out.println(str.substring(5));
    System.out.println(str.substring(2, 4));
    System.out.println();


    }
    
}
