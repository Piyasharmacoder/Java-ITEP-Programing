// Q.3 Create a class Squar  with a methode to print the incilizale its  side , calculating area  peramiter etc  

class Square {
    int side;

    // methode 1
    public int area() {
        return side * side;
    }

    // methode 2
    public int peramiter() {
        return 4 * side;
    }

}
// Q .4 create a class Rectangle with a methode to incilize its leght and breth
// and calculate area or peramiter ect

class Rectangle {
    int length;
    int width;

    // methode 1
    public int Rect_area() {
        return length * width;
    }

    // methode 2
    public int Rect_peramiter() {
        return 2 * (length + width);
    }

}

// Q.6 Create a class Circle and calculate area or peramiter ect
class Circle {
    int radius;

    // methode 1 find area
    public double OFarea() {
        return 3.14 * radius * radius;
    }

    // methode 2 find perimeter yaa ( Circumference)
    public double Circumference() {
        return 2 * 3.14 * radius;
    }

}

public class OopsTest3 {
    public static void main(String[] args) {
        Square s = new Square();
        s.side = 3;
        System.out.println("Area of Square : " + s.area());
        System.out.println("Peramiter of Square : " + s.peramiter());

        System.out.println("___________________________________________________________________\n");
        // methode calling Question 4
        Rectangle r = new Rectangle();
        r.length = 4;
        r.width = 8;
        System.out.println("Area of Rectangle is : " + r.Rect_area());
        System.out.println("Peramiter of Rectangle is : " + r.Rect_peramiter());

        System.out.println("________________________________________________________________________\n");
        // methode calling question 6
        Circle c = new Circle();
        c.radius = 5;
        System.out.println(" Area of Circle is : " + c.OFarea());
        System.out.println(" Circumferen of circle is : " + c.Circumference());

    }

}
