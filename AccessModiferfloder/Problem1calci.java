package AccessModiferfloder;


class calculater{
    public void calculate(int x, int y){
        System.out.println("Your result is  : " + x +y);
    }
}
class Scientificalculater{
    public void calculate(int x, int y){
        System.out.println("Your result is  : " +Math.sin(x +y));
    }
}
class MyCalculator{
    public void calculate(int x, int y){
        System.out.println("Your result is  : " + x +y);
        System.out.println("Your result is  : " +Math.sin(x +y));
    }
}

// find the Area of rectangle  in using getter and setter methods
class rectangle{
    private int length;
    private int breadth;

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }
    public int getBreadth() {
        return breadth;
    }
    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }
    public int area(){
        return length * breadth;
    }
}

public class Problem1calci { 
    public static void main(String[] args) {
        System.out.println("im a main class :  ");
        calculater calc = new calculater();
        calc.calculate(10, 20);

        Scientificalculater sci = new Scientificalculater();
        sci.calculate(10, 20);

        MyCalculator mycalc = new MyCalculator();
        mycalc.calculate(10, 20);

        rectangle rec = new rectangle();
        rec.setLength(10);
        rec.setBreadth(20);
        System.out.println("Area of rectangale : "+rec.area());

    }
    
}
