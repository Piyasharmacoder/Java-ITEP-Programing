import java.util.Scanner;

import javax.xml.transform.Source;

public class Progmse17 {
    public static void main( String []args ){
        Scanner sc= new Scanner( System.in);
        System.out.print("Enter the  number! :" );
        int n = sc.nextInt();
        int fact =1;
        for(int i=1;i<=n;i++ ){
            fact= fact*i;
            System.out.print(i+" * ");
        }
        System.out.println("\nfactorial " + fact);
    }
    
























































     
}
