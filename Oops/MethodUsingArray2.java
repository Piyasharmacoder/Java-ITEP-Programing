import java.util.Scanner;

public class MethodUsingArray2 {
    public static void findMaximun( int a ,int b, int c, int d ){
         int []array = new int[]{a,b,c,d }; 
         int max =array[0];
         for( int i=0; i< array.length; i++){
            if(max<array[i]){
                max  = array[i];
            }
         }
         System.out.println(" THe Maximum value is : " + max);

    }
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        System.out.print(" Enter the value of a : ");
        int a = Sc.nextInt();
        
        System.out.print(" Enter the value of b : ");
        int b = Sc.nextInt();
         
        System.out.print(" Enter the value of c : ");
        int c = Sc.nextInt();

        System.out.print(" Enter the value of d : ");
        int d = Sc.nextInt();

         // now calling the methode 
         findMaximun(a, b, c, d);
    }
    
}
