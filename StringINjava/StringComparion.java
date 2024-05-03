package StringINjava;

// String compairson Methodes exmples 
// they are mainly three  comparison methodes 

import javax.print.DocFlavor.STRING;

public class StringComparion {
    public static void main(String[] args) {

        // By using equals()method
        // equals() method alawys returns boolen value like true or false.
        // equals() method --> The equles method compares the contents of given two string . if any chatracter is not matched, it return false
        // if all charcters are matched, it return true.
        // hum equals() method ke through bhi ye check kr skate hai ki humeri sting
        // empty hai ki nai

        System.out.println("________________________________________________________________");
        System.out.println("               By using equals()method                  ");
        String s1 = "piya";
        String s2 = "piya";
        String s3 = new String("piya");
        String s4 = "siya";
        String s5 = new String("Ram");

        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s4.equals(s2));
        System.out.println(s4.equals(s5));
        System.out.println(s2.equals(s5));

        System.out.println("_______________________________________________________");

        if (s1.equals("")) { // cheack string Empty or not
            System.out.println("name can not be empty");

        } else {
            System.out.println("valid name ");
        }

        // ------------------------------------------------------------------------------------------------------------------------------------------

        // Now by using equalsignoreCase()methode
        // this methode is compare to string to another string ignoring case

        System.out.println();

        System.out.println("             By using equalsignoreCase()methode               ");
        String new_s1 = "piya";
        String new_s2 = "piya";
        String new_s3 = new String("PIYA");
        String new_s4 = "siya";
        String new_s5 = new String("Ram");

        System.out.println(new_s1.equalsIgnoreCase(new_s2));
        System.out.println(new_s3.equalsIgnoreCase(new_s2));
        System.out.println(new_s4.equalsIgnoreCase(new_s3));
        System.out.println(new_s1.equalsIgnoreCase(new_s2));

        System.out.println("_______________________________________________________");

        // ___________________________________________________________________________________________________________________________________________

        // By using == operator
        // now operator compares olny reference not values.

        System.out.println();

        System.out.println("            By using == operators methodes             ");

        String B1 = " Siya";
        String B2 = " Siya";
        String B3 = new String(" Siya");

        System.out.println(B1 == B2); // true ( because both refer to same instance)
        System.out.println(B2 == B3);
        System.out.println(B1 == B3);

        System.out.println("_______________________________________________________");

        // _________________________________________________________________________________________________________________________________

        // String is compare by compareTo() method
        // copmareTo() and compareToIgnorence() methods is used for comparing two strings lexicographically . Each character of both string is
        // converted into a Unicode value for comparison. if both strings are equle than
        // this methode return 0 else it retruns positive or nagetive value   

        // Suppose s1 and s2 are two String objects. If:
        // s1 == s2 : The method returns 0.
        // s1 > s2 : The method returns a positive value.
        // s1 < s2 : The method returns a negative value.

        System.out.println();
        System.out.println("             compare by compareTo() method                  ");

        String c1 = " Raj Thakur ";
        String c2 = " Siya Thakur";
        String c3 = " Raj Thakur ";
        String c4 = "piya" + "Raj";
        String c5 = "piya Raj";

        System.out.println(c1.compareTo(c2)); // 1 because c1 > c2>
        System.out.println(c2.compareTo(c3)); // -1 because c2<c3
        System.out.println(c3.compareTo(c1)); // c1==c3 = 0
        System.out.println(c4.compareTo(c5));

    }

}
