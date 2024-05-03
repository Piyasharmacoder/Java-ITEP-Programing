package INheritance;
//Write a Java program to create a class called Shape with a method called getArea(). 
//Create a subclass called Rectangle that overrides the getArea() method to calculate the area of a rectangle.

class Shape{
    //Create a method called getArea
    public double getArea(){
        return 0;
    }

}
//create a subcclass 
class Rectangle extends Shape{
 
    // find area of the rectangle
    private double  length;
    private double width;
    // create a paramiterize constructor
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    // override the getArea() method
    @Override
    public double getArea() {
        return this.length * this.width;
    }
} 

// create a class to find the area  circle
class circle extends Shape{
    // create a metheed 
    private double radius;
    // create a paramiterize constructor
    public circle ( double radius){
        this.radius = radius;

    }
    // override the getArea() method 
    @Override
    public double getArea(){
        return Math.PI*radius*radius;

    }
}




public class FindAeraInshape {
    public static void main(String[] args) {
        // Create a object called
        Shape shape = new Shape();
        Rectangle rectangle = new Rectangle(10, 10);
        double Area = rectangle.getArea();
        System.out.println(" \nThe Area of Rectangle is : " + Area+"\n");
        
        // call a circle mrthode
        circle Cr = new circle(5);
        double area = Cr.getArea();
        System.out.println("The Area of Circle is : "+ area+"\n");


    }
    
}
