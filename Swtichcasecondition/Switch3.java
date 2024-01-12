package Swtichcasecondition;

import java.util.Scanner;

public class Switch3 {
    public static void main ( String[] agrs ){
        Scanner sc = new Scanner( System.in);
        System.out.print(" Enter the number :");
        int day = sc. nextInt();
        switch(day){
            case 1: 
            System.out.println(" Monday ");
            break;
            case 2:
            System.out.println(" Tuesday ");
            break;
            case 3:
            System.out.println(" Wendnesday ");
            break;
            case 4:
            System.out.println(" Thursday ");
            break;
            case 5:
            System.out.println(" Friday ");
            break;
            case 6: 
            System.out.println(" Saturday");
            break;
            case 7: 
            System.out.println(" Sunday ");
            break;
            default:
            System.out.println(" invaild number  ");
            break;
            
            }
        }
    }
    
