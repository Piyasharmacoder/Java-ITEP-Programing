import java.util.Scanner;
// wap to sum of the number of the serise 1/2 + 2/3 + 3/4+ 4/5---------------------------------------n/n
public class Progmse13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int n = sc.nextInt();
       //double sum =0;
        for (int i = 1; i<= n; i=i+2 ) {
       // sum =sum +( i/( i+1));
       System.out.println(  i  );
        }
      // System.out.println("\nSum of the serise = "+ sum );
    }
    
}
