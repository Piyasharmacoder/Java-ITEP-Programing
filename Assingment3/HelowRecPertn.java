package Assingment3;

import java.util.Scanner;

class HelowRecPertn {
public static void main(String[] args) {
        Scanner sc = new Scanner ( System .in);
        System.out.print(" Enter the no of row  : ");
        int n= sc.nextInt();
        System.out.print(" Enter the no of colum : "); 
        int m = sc.nextInt();
        int row , cloum ;
        for (row =0; row <n; row++ )
        {
            for ( cloum=0; cloum<m; cloum++ )
            {
                if( row==0||row==n-1)
                {
                    System.out.print(" *");
                }
                else{
                    if( cloum==0||cloum==m-1)
                    {
                        System.out.print(" *");
                    }
                    else
                    {
                        System.out.print( "  ");
                    }
                }
            }
            System.out.println();
        }
        
}  }
     






























