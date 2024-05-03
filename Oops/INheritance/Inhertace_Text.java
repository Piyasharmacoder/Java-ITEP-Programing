package INheritance;

class Students3 {
    int rollno;
    int id;
    int age;
    String name;

    // public Students3(int rollno, int id, int age, String name) {
    // this.rollno = rollno;
    // this.age = age;
    // this.name = name;
    // this.id = id;

    // }

     
    // create getter methode
    public int getRollno() {
        return this.rollno;
    }

    // create setter methode
    public void setRollno(int Rno) {
        this.rollno = Rno;
    }

    // create getter methode
    public String getName() {
        return this.name;
    }

    // create setter methode
    public void setName(String n) {
        this.name = n;
    }

    // create getter methode
    public int getId() {
        return this.id;
    }

    // create setter methode
    public void setId(int id) {
        this.id = id;
    }

    // create getter methode
    public int getAge() {
        return this.age;
    }

    // create setter methode
    public void setAge(int age) {
        this.age = age;
    }

    // print methode
    public void displayI() {
        System.out.println(
                "Name : " + name + "\t" + "RollNumber : " + rollno + "\t" + "Id  : " + id + "\t" + "Age : " + age);
    }

}

// class 2 School student
class SchoolStudent extends Students3 {
    int marks;
    String Schoolname;

    // getter methode
    public int getMarks() {
        return this.marks;
    }

    // Setter mrthode
    public void setMarks(int m) {
        this.marks = m;

    }

    // getter methode
    public String getSchoolname() {
        return this.Schoolname;
    }

    // Setter mrthode
    public void setSchoolname(String scname) {
        this.Schoolname = scname;

    }

    public void displayDeat() {
        System.out.println("Name : " + name + "\t" + "RollNumber : " + rollno + "\t" + "Id  : " + id + "\t" + "Age : "
                + age + "Marks : " + marks + "\t" + " School Name : " + Schoolname);
    }

}

public class Inhertace_Text {
    public static void main(String[] args) {
        Students3 Base = new Students3();
        Base.setName("Piya Sharma ");
        // System.out.println("Name : " + Base.getName());
        Base.setRollno(38);
        // System.out.println("Rollno : " + Base.getRollno());
        Base.setId(1001);
        // System.out.println("Id : " + Base.getId());
        Base.setAge(19);
        // System.out.println("Age : " + Base.getAge() +"\n");

        Base.displayI();
        System.out.println("____________________________________________________\n");

        SchoolStudent D = new SchoolStudent();
        Base.setName("Piya Sharma ");
        System.out.println("Name : " + Base.getName());
        Base.setRollno(38);
        System.out.println("Rollno : " + Base.getRollno());

        
        D.setId(1001);
        System.out.println("Id : " + D.getId());
        D.setAge(19);
        System.out.println("Age : " + D.getAge());

        D.setMarks(500);
        System.out.println("Marks : " + D.getMarks());
        D.setSchoolname("SVCE");
        System.out.println("School name : " + D.getSchoolname());


        System.out.println("\n");

        
    }

}
