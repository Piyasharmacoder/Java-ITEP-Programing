package KEywords;

// parent class 
class A {
    int a =10;

}
class B extends A {
    int a = 20;
    //cerate methode 
    void display( int a){
        System.out.println(this.a); // its print class B function  ye current classs ke object ko call karega //
        System.out.println(super.a); // ye parent class object ko print raha hai
    }

}

public class SupwerKeyword {
    public static void main(String[] args) {
        
        B b = new B();
        b.display(30);

    }
    
}
