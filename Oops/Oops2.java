
// using  methode   
public class Oops2 {

    String name;
    int age;

    // create a new methode
    void intOBJ(String n, int a) {
        name = n;
        age = a;
    }

    // metthode 2
    void display() {
        System.out.println(name + "" + age);

    }

    public static void main(String[] args) {
        Oops2 obj = new Oops2();
        obj.intOBJ(" green ",   10);
        obj.display();
    }

}
