package Trickyprogma;

public class T8 { 
    public static void main(String[] args) {
        int n=528;
        int a;
        int s=1;  
        int r=0;
        while(n!=0){
            a=n%10;
            n=n/10;
            s=s*10+a;
        } 
        while( s!=1){
            a=s%10; 
            s=s/10;
            r=r*10+a;
        }
        System.out.println("\n\n"+r);
    } 
}
