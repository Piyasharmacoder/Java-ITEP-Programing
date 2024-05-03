class MyEmploye {
    private int id;
    private String name;
    private int age;

    // constrctor create
    public MyEmploye() {
        id = 101;
        name = "priyamka";
        age = 19;

    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        this.name = n;
    }
    public void setId(int i) {
        this.id = i;
    }

    public int getId(int id) {
        return id;
    }

     
    public void setAge(int b) {
        this.age = b;
    }

    public int getAge(int age) {
        return age;
    }


}
 public class Costructor1 {
    public static void main(String[] args) {
        MyEmploye piya =new MyEmploye();


        System.out.println(piya.getName());
        System.out.println(piya.getAge(21));
        System.out.println(piya.getId(1002));
        
    }
    
}
