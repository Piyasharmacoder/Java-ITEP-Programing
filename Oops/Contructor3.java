class Coll_Sudent {
    int id;
    int age;
    String name;
    // constructor 1

    Coll_Sudent(int id, int age) {
        this.id = id;
        this.age = age;
        System.out.println("Paramiterzed Constructor ");
    }

    // constructor 2
    Coll_Sudent(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
        System.out.println("Paramiterzed Constructor 2");
    }

    // constructor 3
    Coll_Sudent() {
        System.out.println("Default Construtor ");
    }

    // public void displayDeatil(String name , int id , int age){
    // System.out.println("name : "+name +" Id : "+ id +"Age : "+ age);
    // }

}

public class Contructor3 {
    public static void main(String[] args) {
        // call defalut costructor
        Coll_Sudent S1 = new Coll_Sudent();

        // call peramiterazed constructor
        Coll_Sudent S2 = new Coll_Sudent(101, 17);

        // call peramiterazed constructor
        Coll_Sudent S3 = new Coll_Sudent("Piya", 101, 18);

        // Coll_Sudent S4 = new Coll_Sudent();
        // S4.displayDeatil( "piya" ,1001, 17);

    }

}
