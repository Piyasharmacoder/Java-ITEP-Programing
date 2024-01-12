package Assingment3;

public class prten20 { 
    public static void main(String[] args) {
       int i,j;
       for( i=1; i<=5; i++){
        for( j=1; j<=i; j++){  
            if( i==5||j==1||i==j)
            System.out.print(j);
            else
            System.out.print(" ");
        }   
        System.out.println();
       }
}
}
