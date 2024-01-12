package Assingment3;

import java.util.Scanner;

public class Fancyperten {
    public static void main(String[] args) {
        Scanner Sc =  new Scanner (System.in);
        System.out.print("enter any number :");
        int n = Sc.nextInt();
        for( int i= 0; i<n; i++){
            int start_num_index=8-i;
            int num = i+1;
            int  count_num= num;
            for(int  j=0; j<17; j++ ){
                if( j==start_num_index && count_num>0){
                    System.out.print(num);
                    start_num_index+=2;
                    count_num--;
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    } 
}