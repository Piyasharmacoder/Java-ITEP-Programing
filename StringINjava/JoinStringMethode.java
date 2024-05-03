package StringINjava;
 // String joine methode  now join is static method
 // join()methode me do parameter hote hai =>join( CharSquence dalimtier, CharSequence elements) is the static methode which concatenates 
 // the  given elememts with  the delimiter and  returns the  concatenated string .
 // it was included in JDK1.8 version.
 //Note :  that if an element is null, then null  is added and  if dalimiter is  null then  it will throw "java.lang.NullPointerException"

public class JoinStringMethode {
    
    public static void main(String[] args) {
        String s1 = "priyanka ";
        String s2 = "Sharma ";

        // now using joinStringMethode
        // delimiter me hum null value provide nai kr skte becuse (java.lang.NullPointerException") error aayegi 
        // elemement me hum null value provide kr skte hai 
        

        System.out.println(String.join(": ", s1,s2)); 

                                          
        
        
        
    }
}
