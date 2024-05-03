
//  Q.16) Create a class Person with properties (name and age) with following features.
// Default age of person should be 18.
// A person object can be initialized with name and age.
//Method to display name and age of person.

// classs person 

class person {
    // its properties name and age difine
    String name;
    int age;

    // Default constructor to initialize with default age 18 And constructor 1

    public person(String name) {
        this.name = name;
        this.age = 18; // Now Default age set to the 18
    }

    // Constructor to initialize with specified name and age And costructor 2
    public person(String name, int age) {
        this.name = name;
        this.age = age;

    }

    // Now use getter methode to get the name proprty
    public String getName() {
        return name;

    }

    // now use setter methode to set the name property
    public void setName(String n) {
        this.name = n;
    }

    // then use getter methode for the age property
    public int getAge() {
        return age;
    }

    // now use setter methode to set the age peoperty
    public void setAge(int a) {
        this.age = a;
    }
    // now create display methode for display infromation about pesron
    // public void displayInfo(){
    // System.out.println("Name : "+ name +"Age : " +age);
    // }

}

public class OopsTest9 {
    // Main method to demonstrate usage
    public static void main(String[] args) {
        // Creating a Person object with default age
        System.out.println("________Constructor Set  person object with Default age_________");
        person p1 = new person(" Piya Thakur ");
        System.out.println(" Person 1  \n Name : " + p1.getName() + " , Age : " + p1.getAge() + "");
        person p2 = new person(" Raj Thakur ");
        System.out.println(" Person 2  \n Name : " + p2.getName() + " , Age : " + p2.getAge() + "\n");

        // Creating a Person object with specified age
        System.out.println("________Controctor person object with specifide age and name_______  ");
        person person2 = new person("Nelam", 23);
        System.out.println("Name: " + person2.getName() + ", Age: " + person2.getAge());

        // System.out.println("\n________________Print infoemato uning displya methode
        // ___________________");
        // person person3 = new person("riya");
        // person3.displayInfo();

    }

}
