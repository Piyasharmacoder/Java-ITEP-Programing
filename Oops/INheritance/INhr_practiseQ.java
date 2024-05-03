package INheritance;
//Write a Java program to create a class called Employee with methods called work() and getSalary(). 
//Create a subclass called HRManager that overrides the work() method and adds a new method called addEmployee().


// create a class called Employee 
class Employees {
    private int salary;

    // create a parameterized constructor for salary
    public Employees(int salary) {
        this.salary = salary;

    }

    // create a methode work
    public void work() {
        System.out.println("I am working employee");
    }

    // create a methode getSalary
    public int getsalary() {
        return salary;
    }
}

// create a class called HRManager

class HRManager extends Employees {
    public HRManager(int salary) {
        super(salary);
    }

    public void work() {
        System.out.println("\nI am working as HR Manager");
    }

    public void addEmployee() {
        System.out.println("\nadding  new employee");
    }
}

public class INhr_practiseQ {
    public static void main(String[] args) {

        Employees em = new Employees(2000);
        em.work();
        System.out.println("Employees Salary : " + em.getsalary());

        HRManager hrm = new HRManager(10000);
        hrm.work();
        System.out.println("HR Salary : " + hrm.getsalary());
        hrm.addEmployee();

    }

}
