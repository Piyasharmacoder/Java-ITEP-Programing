package StringINjava;

// using  string methode from find string length ( .length()methode

// .lenght()Methode =  The String length()methode count  the number of charactersint the string  and returns it in integer. This methode  returns the 
//                     the  legnth of any string  which is  equal  to the number of  16-bit Unicode characters in the String .


public class String11 {
    public static void main(String[] args) {
    String name = "Piya";
    String Eamil = "Abc@gamail.com";
    String password = " abcd1234";
    System.out.println("Name : "+name.length()+"\nEmail : " + Eamil.length()+
    "\nPassword : " + password.length() );
    int i = name.length();
    if (i==0) {
    System.out.println("Name is empty .");

    }
    else{
    System.out.println("valid name : ");
    }

    }


    
    /// is Empty method


    // ** isEmpty method()  is also return the boolean value true or false

    //  *isEmpty method()  = The isEmpty methodof string  class is inculded in  java   string  since JDK 1.6  this methode  returns true  if the 
    //                       given  string is empty , esle it return false , or can  say that  this method returns true if the  length  of  string  is 0.
    

    // public static void main(String[] args) {
    //     String name = null;
    //     String password = "1234adc";
    //     String Email = "google.com";
    //     boolean b = name.isEmpty();

    //     if (b == true) {
    //         System.out.println("Name is empty : ");

    //     } else {
    //         System.out.println("Name is valid  : ");
    //     }

    // }

}
