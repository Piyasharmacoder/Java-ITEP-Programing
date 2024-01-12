package Assingment3;

import javax.xml.transform.Source;

public class prten24 {
    public static void main(String[] args) {
        int i,j;
          for( i=1; i<=5; i++){
            for( j=1; j<=i ;j++){  
                if( i==5||j==1||i==j) 
                 System.out.print("* " );
                 else
                 System.out.print("@ ");
            }
            System.out.println();
          }
    
    }
    
}
