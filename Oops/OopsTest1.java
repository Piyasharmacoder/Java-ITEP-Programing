//Create a class Employee with following properties: and  methodes : 
/* 1. Salary ( properties) int 
2. getsalary (methode returing int)
3.name(proprties)string 
4. get name ( methode returing string )
5. set name ( methode changing name ) 
 */

class Employe1Test {
    int salary;
    String name;

    // methode 1
    public int getsalary() {
        return salary;
    }

    // methode 2
    public String getName() {
        return name;
    }

    // methode 3
    public void setName(String n) {
        name = n;

    }

}

public class OopsTest1 {
    public static void main(String[] args) {
        Employe1Test Ria = new Employe1Test();
        Ria.setName("RAJ THAKUR");
        Ria.salary = 5000;
        System.out.println("Name   : "+Ria.getName());
        System.out.println("Salary : "+Ria.getsalary());
        

    }

}
