package Assingment3;

public class prten23 { 
    public static void main(String[] args) {
        int i,j;
        char a= 'a';
        for( i=1; i<=5; i++){
            for( j=1; j<=i; j++){
                if( i==5||j==1||i==j)
                System.out.print(a);
               else
                System.out.print(" ");
                a++;
              }
            System.out.println();
        }
    }
    
}
