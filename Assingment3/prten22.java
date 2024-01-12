package Assingment3;

public class prten22 {
    public static void main ( String []arg){
        char i,j;
        for( i=69; i>=65; i--){
            for ( j=65 ; j<=i; j++ ){
                if( i==69 ||j== 65||i==j)
                System.out.print(j);
                else
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    
}
