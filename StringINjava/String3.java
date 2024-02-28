package StringINjava;
// convertion of char array to string 
public class String3 {
    public static void main(String[] args) {
        // creating string by litreral 
        String S1 ="P i y a";

        char[] ch = {'P','R','I','Y','A','N','K','A'};
        String s =new String(ch);

        //creating java string by new keyword 

        String s2 =new String("Sharma ");

        System.out.println(s);
        System.out.println(S1);
        System.out.println(s2);

    }
    
}
