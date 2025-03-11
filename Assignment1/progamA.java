//3. Write a program to declare two variables num and n and take an input during compilation time to check whether the nth bit of the given number is set (1) or not (0).

package Assignment1;

public class progamA {
    public static void main(String[] args) {
        int num = 10; // Replace with the actual number
        int n = 3; // Replace with the bit position
        int mask = 1 << n;
        boolean isBitSet = (num & mask)!=0;
        System.out.println("The "+n+"th bit of "+num+" is set: "+isBitSet);


    }  
} 
