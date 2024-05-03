package MiniProjectjava.OOpsProject;
// now we use 4 classes  Emplpyees ande , full timeEmploye , part timeemplyoue  , payrollsystem 

import java.util.ArrayList;

// create  Abstract class empolyes
abstract class Employeses {

    private String name;
    private int id;
    private int age;

    // now create contructors
    public Employeses(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;

    }

    // use getter methode for name
    public String getName() {
        return name;
    }

    // use getter method for id
    public int getId() {
        return id;
    }

    // use getter methode for age
    public int getAge() {
        return age;
    }

    // create abstract methode calucale salary
    public abstract double calculateSalary();

    // create a methode 
    @Override
    public String toString() {
        return "Employeses [name  : " + name + ", id  : " + id + ", age : " + age + ", salary : " + calculateSalary() + "]";

    }

}

// create class full time employe

class Full_time_employe extends Employeses {
    private double monthlysalary;

    // create class full time name constructor
    public Full_time_employe(String name, int id, int age, double monthlysalary) {
        super(name, id, age);
        this.monthlysalary = monthlysalary;
    }

    @Override
    public double calculateSalary() {
        return monthlysalary;
    }

}

// create class part time employe

class Part_time_employe extends Employeses {
    private double hourlyrate;
    private double workofhours;

    // create constructor
    public Part_time_employe(String name, int id, int age, int workofhours, double hourlyrate) {
        super(name, id, age);
        this.hourlyrate = hourlyrate;
        this.workofhours = workofhours;
    }

    @Override
    public double calculateSalary() {
        // calculate the part time emp salary
        return hourlyrate * workofhours;
    }

}

// create class payroll system

class Payroll_system {
    // now create a list
    private ArrayList<Employeses> employeelList;

    // create a constructor
    public Payroll_system() {
        employeelList = new ArrayList<>();
    }

    // create a method to add employe
    public void addEmploye(Employeses employee) {
        employeelList.add(employee);
    }

    // create a function remove employe
    public void removeEmploye(int id) {
        // create null variaable
        Employeses employeeToRemove = null;
        // create for Each loop
        for (Employeses employee : employeelList) {

            // check if the id is equal to id
            if (employee.getId() == id) {
                employeeToRemove = employee;

                break;
            }
        }
        if (employeeToRemove != null) {
            employeelList.remove(employeeToRemove);

        }

    }

    // display the employee list
    public void displayEmployees() {

        for (Employeses employee : employeelList) {
            System.out.println(employee);
        }

    }
}

public class Empolyee_Payroll_System {
    public static void main(String[] args) {
        // create object of payroll system
        Payroll_system payrollsystem = new Payroll_system();
        // create object of full time employe
        Full_time_employe emp1 = new Full_time_employe("Piya", 1, 19, 800000);
        Full_time_employe emp2 = new Full_time_employe("Raj", 2, 20, 900000);
        Full_time_employe emp3 = new Full_time_employe("Nelam", 3, 21, 1000000);
        Full_time_employe emp4 = new Full_time_employe("Goldi", 4, 22, 1100000);

        // create object of part time employee
        Part_time_employe emp5 = new Part_time_employe("mamta", 5, 18, 10, 75000);
        Part_time_employe emp6 = new Part_time_employe("krishana", 6, 10, 10, 890000);
        Part_time_employe emp7 = new Part_time_employe("Muskan", 7, 15, 10, 909000);
        Part_time_employe emp8 = new Part_time_employe("Buniyadi", 8, 45, 10, 347000);
        // // add employe to payroll system
        payrollsystem.addEmploye(emp1);
        payrollsystem.addEmploye(emp2);
        payrollsystem.addEmploye(emp3);
        payrollsystem.addEmploye(emp4);
        payrollsystem.addEmploye(emp5);
        payrollsystem.addEmploye(emp6);
        payrollsystem.addEmploye(emp7);
        payrollsystem.addEmploye(emp8);

        System.out.println("Intial Employee Details : ");
        payrollsystem.displayEmployees();
        System.out.println();

        // remove employe from payroll system
        System.out.println("Removing Employee Details : ");
        payrollsystem.removeEmploye(2);
        payrollsystem.displayEmployees();
        System.out.println();

        // add employe to payroll system // check delete employee hai yaa nai list me 
        System.out.println("Renaming Empolyee Details : ");
        payrollsystem.displayEmployees();
        System.out.println();
        


    }

}
