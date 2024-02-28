import java.util.Scanner;
// wap to print the serise 1,2,9,28,65,126--------------------------------------------------n//
//And wap to print sum of the serise 1+2+9+28+65+126--------------------------------------------n+n///
public class Progmse14 {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the number : ");
        int n = sc.nextInt();
       int sum =0;
        for (int i = 0; i<= n; i++) {
           sum = sum + i *i*i+1;
            System.out.print(i * i * i + 1 + " + ");
        }
       System.out.println("\nSum of the serise = "+ sum );
    }
    
}
