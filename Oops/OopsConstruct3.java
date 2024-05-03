
// constructor ctreated 
class Student {
     private int age;
     private String name;

    void ditails(int A, String N) {
        A = age;
        N = name;
    }

    void display() {
        System.out.println("name of student\n Name : " + name + " and age is :" + age);
    }
}

public class OopsConstruct3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.ditails(18, "priyanka");
        s1.display();

    }
}
