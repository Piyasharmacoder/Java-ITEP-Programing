package PracticeSetInOops;

import java.util.Scanner;

//Q.1 Create a class cylinder and use getter and setter to set its radius and hight  
// and  find surface area of clylinder and volume of he clylinder 
class Q1cylinder {
    private int radius;
    private int hight;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHight() {
        return hight;

    }

    public void setHight(int hight) {
        this.hight = hight;
    }

    // methode to find surface area of the clylindre
    public double SurfaceArea() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI* radius * hight; // fromula of the surface area =
                                                                       // (2*3.14*radius*radius+2*3.14*radius*hight)
    }
    // methode 2 to find the  volume 
    public double volume(){
        return Math.PI*radius*radius*hight;
    }

}

public class Ques1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Q1cylinder c = new Q1cylinder();
        System.out.print("Enter the hight of the clylindr : ");
        int h = sc.nextInt();
        c.setHight(h);

        System.out.print("Enter the radius of the clyinder : ");
        int r = sc.nextInt();
        c.setRadius(r);
        System.out.println("\n\n___________________________output__________________________________");

        // now displye the radius and hight of the clyinder
        System.out.println("\nRadius of the clyinder :  " + c.getRadius());
        System.out.println("Hight of the clyinder : " + c.getHight());

        System.out.println("\n Surface Area of the clylinder  :  "+ c.SurfaceArea());
        System.out.println(" Volume of the clylinder  :  " + c.volume());

    }

}
