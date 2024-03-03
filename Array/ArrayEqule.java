import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqule {
    // compair array are equle or not using equle.methode
     public static void main(String[] args) {
        int []a1 = new int[5];
        int []a2 = new int[5];
        Scanner sc = new Scanner(System .in);
        System.out.println("Enter the array1 data .");
        for (int i = 0; i < a1.length; i++) {
            a1[i]=sc.nextInt();
            
        }

        System.out.println("Enter the array2 data .");
        for (int i = 0; i < a2.length; i++) {
            a2[i]=sc.nextInt();
            
        }
        boolean b = Arrays.equals(a1, a2);
        System.out.println(" Arrays are equls : "+ b);

     }
    
}
