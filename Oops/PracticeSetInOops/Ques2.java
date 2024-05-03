package PracticeSetInOops;
// Question 2 same but use constructor 

class Q2cylinder {
    private int radius;
    private int hight;

    // create a constructoor
    public Q2cylinder(int radius, int hight) {
        this.radius = radius;
        this.hight = hight;
    }

    public int getRadius1() {
        return radius;
    }

    public void setRadius1(int radius) {
        this.radius = radius;
    }

    public int getHight1() {
        return hight;

    }

    public void setHight1(int hight) {
        this.hight = hight;
    }

    // methode to find surface area of the clylindre
    public double SurfaceArea1() {
        return 2 * Math.PI * radius * radius + 2 * Math.PI * radius * hight; // fromula of the surface area =
        // (2*3.14*radius*radius+2*3.14*radius*hight)
    }

    // methode 2 to find the volume
    public double volume1() {
        return Math.PI * radius * radius * hight;
    }

}

public class Ques2 {
    public static void main(String[] args) {
        Q2cylinder mycylinder = new Q2cylinder(9, 12);
        System.out.println("Radius :  " + mycylinder.getRadius1());
        System.out.println("Hight  :  " + mycylinder.getHight1());

        System.out.println("SurfaceArea : " + mycylinder.SurfaceArea1());
        System.out.println("Volume : " + mycylinder.volume1());

    }

}
