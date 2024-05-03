package Abstraction;

// Write a Java program to create an abstract class Shape with abstract methods calculateArea() and calculatePerimeter(). 
//Create subclasses Circle and Triangle that extend the Shape class and
// implement the respective methods to calculate the area and perimeter of each shape.

// create a  abstractclass 
abstract class Shape {
    // now create a methode calculate area() and calculatePerimeter()
    abstract double calculateArea();

    abstract double calculatePerimeter();
}

// create a Subclass circale
class Circle extends Shape {
    // take instence variable
    private double radius;

    // create a  peramiterized contractor
    public Circle(double radius) {
        this.radius = radius;
    }

    // override calculate Area methode
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // override calculate Perimeter
    @Override
    double calculatePerimeter() {
        return 2 * Math.PI * radius;

    }

}

// create a Subclass Triangle
class Triangle extends Shape {

    private double side;
    private double side1;
    private double side2;

    // create a paramiterazide contractor
    public Triangle(double side, double side1, double side2) {
        this.side = side;
        this.side1 = side1;
        this.side2 = side2;
    }

    // override calculate Area methode
    @Override
    double calculateArea() {
        double s = (side + side1 + side2) / 2;
        return Math.sqrt(s * (s - side) * (s - side1) * (s - side2));
    }

    // override calculate Perimeter
    @Override
    double calculatePerimeter() {
        return side + side1 + side2;
    }

}

public class Abstracpreactic {
    public static void main(String[] args) {

        Circle c = new Circle(4);
        System.out.println("\nArea of Circle       : " +c.calculateArea());
        System.out.println("Paramiter of circle  : " +c.calculatePerimeter());
        System.out.println();
        Triangle t = new Triangle(3, 4, 5);
        System.out.println("Area of Triangle      : "+ t.calculateArea());
        System.out.println("Peramiter of Triangle : "+t.calculatePerimeter()+"\n");


    }

}
