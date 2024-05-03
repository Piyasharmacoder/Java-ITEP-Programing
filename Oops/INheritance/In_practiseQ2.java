package INheritance;
// Create a  class Rectangle and use inheritence to create another class cuboid .

//try to keep it as closed to real world  scenarios as possible 

class Rectangle2 {

    public int length;
    public int width;

    Rectangle2() {
        System.out.println("This is non paramiterazde constructor ");
    }

    // Create a pramertarzed constructor
    public Rectangle2(int l, int w) {
        System.out.println("This is paramiterazed constructor ");
        this.length = l;
        this.width = w;
    }

    // create a methode find the Area
    public int Area2() {
        return this.length * this.width;

    }
}

// create a class Cuboid extends Rectangle2
class Cuboid extends Rectangle2 {
    public int height;

    Cuboid(int l, int w, int h) {
        super(l, w);
        this.height = h;
    }

    public double TotalSurfaceArea() {
        return 2 * (this.length * this.width) + (this.length * this.height) + (this.width * this.height);

    }

}

public class In_practiseQ2 {
    public static void main(String[] args) {
        Rectangle2 rec = new Rectangle2(10 ,10);
        System.out.println("Total Area of Rectangle :  "+ rec.Area2()+"\n");

        Cuboid cuboid = new Cuboid(10, 10, 10);
        System.out.println("Total Surface Area of Cuboid : "+cuboid.TotalSurfaceArea());

    }

}
