import java.util.Scanner;

public class Arraynew2 {
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        System.out.print(" Enter the No of Rows : ");
        int rows = sc.nextInt();
        System.out.print(" Enter the No of colms : ");
        int colms = sc.nextInt();
        System.out.println(" Enter the rows and colms value :");
        // creation the array 
        int [][]arr = new int[rows][colms];
         arr[0][0]=1;
         arr[0][1]=2;       
         arr[1][0]=3;         
         arr[1][1]=4;  
                  
         


        for(int [] ar: arr){
            for(int a: ar){
                System.out.println(a);
            }
        }

    }
    
}
