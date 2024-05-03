package INheritance;
class Base{ 
    public  int x;


    //gette methode 
    public int getX(){
        return x;
    }
    // setter methode 
    public void setX(int x){
        System.out.println("I'm in base  class and Set X now .");
        this.x =x;
    }
    // create a costeuctor
    public void printDeatial(){
        System.out.println("Print constructor : ");

    }

}
 // class 2  inherited the Base class all data 
class Derived extends Base{
     public int y;

    //gette methode 
    public int getY(){ 
        return y;
    }
    // setter methode 
    public void setY(int y){
        System.out.println("I'm in child class and Set Y now .");
        this.y =y; 
    }
}


public class Inheritance_Demo {
    public static void main(String[] args) {
        // creating a object of Basse class 
        Base  b = new Base();
        b.setX(5);
        System.out.println(  "X : "+b.getX());
  

        System.out.println("______________________________________________________\n");
        // creating a object  of Derived class 
        Derived d = new Derived();
        d.setX(6);
        System.out.println(  "X : " + d.getX());
        d.setY(7);
        System.out.println(  "Y : " +d.getY());
        
    
    }
    
}
