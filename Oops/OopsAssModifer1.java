// use private aacsse modifire 
class DemoEmployee {
    private int id;
    private String name;
    private int age;

    // now use getter and Setter methode
    // methode 1 getter
    public String getName() {
        return name;

    }

    public void setName(String n) {
        name = n;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getId() {
        return id;

    }

    public void setId(int i) {
        id = i;
    }

}

public class OopsAssModifer1 {
    public static void main(String[] args) {
        DemoEmployee obj = new DemoEmployee();
        DemoEmployee obj1 = new DemoEmployee();
        // obj.id = 101;
        // obj.name = " Raj Thakur "; // hum yaha private ascsse modifire ko directely
        // access nai kr sakate hai error ayegi
        // obj.age = 21; // esko hum methoed ke throgh accsse kr sakte hai

        // calling by methode
        obj.setId(1001);
        System.out.println("Empioye id : " + obj.getId());
        obj.setName("Priyanka");
        System.out.println("Name : " + obj.getName());
        obj.setAge(19);
        System.out.println("Age : " + obj.getAge());
        System.out.println("_______________________________Employe 2 infromation_____________________________\n");

        obj1.setId(1002);
        System.out.println("Empioye id : " + obj1.getId());
        obj1.setName("Raj");
        System.out.println("Name : " + obj1.getName());
        obj1.setAge(21);
        System.out.println("Age : " + obj1.getAge());
    }

}
