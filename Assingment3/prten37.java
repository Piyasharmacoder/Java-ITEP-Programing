package Assingment3;

public class prten37 {
    public static void main(String[] args) {
        int i,j; 
        for( i=5;i>=1; i--){
            for( j=1; j<=5; j++){
                if(i==5||j==1||i==j)
                System.out.print(i);
                else
                System.out.print( " ");
            }
            System.out.println();
        }
    }
    
}
