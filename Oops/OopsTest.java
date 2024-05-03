
//Q.7 Create a class MathOperation with two data member X and Y to store the operand and third data member R to store result of operation.Create method members
// init - to input X and Y from user
// add - to add X and Y and store in R
// multiply - to multiply X and Y and store in R
// power - to calculate X Y and store in R
// display- to display Result R

import java.util.Scanner;

class MathOperation {
    private double x;
    private double y;
    private double R;

    // methode1 user se input lene ke liye init methode

    public void init() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of X  :  ");
        this.x = sc.nextDouble();
        System.out.print("Enter the value of y  :  ");
        this.y = sc.nextDouble();
    }

    // methode 2 for addition
    public void add() {
        this.R = this.x + this.y;
    }

    // methode 3 for Substraction
    public void sub() {
        this.R = this.x - this.y;
    }

    // methode 4 for Multipliction
    public void multi() {
        this.R = this.x * this.y;
    }

    // methode 5 for Division
    public void div() {
        this.R = this.x / this.y;
    }
    // methode 6 for power

    public void power() {
        this.R = Math.pow(this.x, this.y);
    }
    // methode 7 for Display all opreations

    public void display() {
        System.out.println("Result R : " + this.R);
    }

}

public class OopsTest {
    public static void main(String[] args) {
        MathOperation ans = new MathOperation();
        System.out.println("\n\n_________Addtion_________\n ");
        ans.init();
        ans.add();
        ans.display();

        System.out.println("\n\n_______Substractions_______\n");
        ans.init();
        ans.sub();
        ans.display();

        System.out.println("\n\n_______ Multiplies_________\n");
        ans.init();
        ans.multi();
        ans.display();

        System.out.println("\n\n________Divisions__________\n");
        ans.init();
        ans.div();
        ans.display();

        System.out.println("\n\n__________Powers___________\n");
        ans.init();
        ans.power();
        ans.display();

    }

}
