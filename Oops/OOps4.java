class Employee {
    int id;
    String name;
    int salary;
    int age;

    public void printditails() {
        System.out.println("My id is " + id);
        System.out.println("And My name " + name);
        System.out.println("and My Age is " + age);
        System.out.println("my salary is " + salary);
        System.out.println();

    }

}

public class OOps4 {
    public static void main(String[] args) {
        Employee Raj = new Employee();
        Employee Piya = new Employee();
        Employee Prakash = new Employee();
        // setting the attribute
        Raj.id = 101;
        Raj.name = " Raj Thakur";
        Raj.age = 21;
        Raj.salary = 5000000;

        Piya.id = 102;
        Piya.name = "Priyanka Sharma";
        Piya.age = 19;
        Piya.salary = 5000000;

        Prakash.id = 103;
        Prakash.name = " Prakash dubye ";
        Prakash.age = 21;
        Prakash.salary = 500000;

        // printing the attributre
        Raj.printditails();
        Piya.printditails();
        Prakash.printditails();

    }

}
