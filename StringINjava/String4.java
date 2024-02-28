package StringINjava;
//immutable string exmple immutable means unchangeable or unmodifiable

public class String4 {
    public static void main(String[] args) {
        String s1 = "priyanka";
        s1.concat(" sharma"); // yaha concat() methode append the string at  the end  
        System.out.println("\n"+s1); // wil only print Priyanka because String are immutable objects 
        System.out.println("\n_____________________________________________________________");
        
        String s2 = "priyanka";
        s2 =s2.concat(" Sharma");
        System.out.println("\n"+s2);

        
    }
    
}
