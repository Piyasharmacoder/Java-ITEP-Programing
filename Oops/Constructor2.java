
class Student2{
    String name;
    int age;


     //  methode 1 print infromation
      public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
      }
      // contructor peramiterized constructor 
      Student2(String name, int age )
      {
        this.name = name;
        this.age = age;
      }

      // copy constructor

      Student2(Student2 S3 )
      {
        this.name = S3.name;
        this.age =  S3 .age;
      }
    }


public class Constructor2 {
    public static void main(String[] args) {
        System.out.println("_______peramiterized construtor________");
        Student2 S2= new Student2("piya",19);
        S2.printInfo();


        System.out.println(" __________Copy constuctor ____________");
        S2.name="piya";
        S2.age =20;
        Student2 S3 = new Student2(S2);
        S3.printInfo();
    }
    
}
