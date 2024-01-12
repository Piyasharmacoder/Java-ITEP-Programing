import java.util.Scanner;
// wap to print the number of serise 1,2,3,4,5,6,7,8-------------------------------------------------------------n//
public class Progm3 {
    /*public static void main(String args[]){
        Scanner Sc = new Scanner( System .in );
        System.out.print(" Enter the number :");
        int n = Sc.nextInt();
        for(  int i=1; i<=n ; i++){
            System.out.println(  i+ " ");
        }
    } */
    
// 3)  wap to print sum of n serise number 1+2+3+4+5+6+7+8+9+---------------------till n trem.

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)  
        {  
            sum = sum + i;
            System.out.print(i + " + ");
        }
        System.out.print("\nsum of the serise= " + sum );
    }

} 

