package Trickyprogma;

public class T3 {
    public static void main(String[] args) {
        int n = 4; 
        for( int i=1; i<n;i++){
            int x=1; 
            System.out.print((n-i)*2+" ");
            for( int j=1; j<=i; j++){
                System.out.print(x+" ");
                x=x*(i-j)/(j+1);
            } 
            System.out.println();
        }
    }
    
}
