import java.util.Scanner;

// 1)  wap to print cube of number serise 1,8,27,,64,125,------------------------------------------n.//
// 2) wap to sum of the serise 1+8+27+64+125+------------------------------------------n.//

public class Progmse8 {
    public static void main(String args[]) {
        Scanner Sc = new Scanner(System.in);
        System.out.print(" Enter the number :");
        int n = Sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++) {    // int cube=i*i*i;
            sum = sum + i * i * i;     // sum =sum+cube;
            System.out.println(Math.pow(i, 3));

            // System.out.print(i * i * i + " +" );
        }
        System.out.println("\nSum of the serise =  " + sum);
    }

}
