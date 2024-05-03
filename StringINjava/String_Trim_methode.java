
package StringINjava;

// Now  using Trim() Methode 

// .Trim() method => trim() method  of String class  eliminates only leading and  trailing whitespace. the Unicode  value  of  space  characters is 
//                   "\u0020." the  trim()  method in java checks  this  Unicode value before  and after the string , if  it exists then  remove  the 
//                      space  and return  omitted string .
 


public class String_Trim_methode {

    public static void main(String[] args) {
        String name = "  Priyanka  Sharma  ";
        System.out.println("Name : "+ name.trim());
        if (name.trim().length() == 0) {
            System.out.println("name is empty");

        } else {
            System.out.println(" valid name ");
        }
    }
}