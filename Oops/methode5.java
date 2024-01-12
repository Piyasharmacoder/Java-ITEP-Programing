public class methode5 {
    static void Introduction(String name) { // method1 creation
        System.out.println(" Welcome " + name);
        System.out.println(" what are you doing " + name);
    }

    static void age(int age) { // methode2
        System.out.println(" Iam " + age + " is old ");
    }

    static void grad(int Class) { // method 3
        System.out.println(" I Study in class  " + Class);

    }

    public static void main(String[] args) {

        // methodes  calling 
        Introduction("priyanka"); // method1
        age(18);    // method2 
        grad(10);  // method3
    }
}