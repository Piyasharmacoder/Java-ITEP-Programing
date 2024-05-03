package StringINjava;
// String Concatenation by + (String concatenation) operator
// Java String concatenation operator (+) is used to add strings

public class String10 {
    public static void main(String[] args) {
        String S = "Piya"+"Raj";
        System.out.println(S);

        System.out.println("___________________________________________________");
       
        System.out.println();
        String a = 50+30+"piya"+40+40;
        System.out.println(a);

        System.out.println("\n----------------------------------------------------------------------------------------");
         String s1= "Piyanka";
         String s2= "Sharma ";

         System.out.println(s1+s2);     // priyankaSharma 
         System.out.println(s1+20+10);  // priyanka2010
         System.out.println(10+s1+s2);  // 10priyankaSharma
         System.out.println(s2+20+s1);  //sharma20priyanka
         System.out.println(10+20+s1);  // 30priyanka
         System.out.println(s1+20+10+s2); //priyanka2010sharma


         System.out.println(s1+40/2);   // priyanka2
         System.out.println(s2+2*3);
         System.out.println(40-30+s2);
        //  System.out.println(s1+30-10);     provide error becuse  (s1 and 30 is concat => priyanka30 - 10 )is not possible 
    
        
    }
    
}
