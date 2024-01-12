package Assingment3;
 // print Fullpyramind even  triangle ............................
public class Numprten5 {
    public static void main(String[] args) {
        int even = 2;
        int n = 5;
        int i,j,sp;
        for ( i=1 ; i<=n;i++ ){
            // for space print
            for( sp=1; sp<=n-i; sp++){
                System.out.print(" ");
            }
            // for print star
            for( j=1; j<=even; j++){
                 System.out.print(j);
            }
             System.out.println();
             even =even+2;
        }
}}
