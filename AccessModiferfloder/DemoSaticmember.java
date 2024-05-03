package AccessModiferfloder;
// java ke andr Static member variable , static member function  or Static inner class  hota hai 

class Demo1 { // outer class

    int X; // instance variable
    static int a; // Static member variable

    public void fun1() {
    } // instance member function

    public static void fun2() {
    } // Static member function

    static class Demo2 { // Static inner class
        public static String country = "INDIA";

    }
}

    public class DemoSaticmember {
        public static void main(String[] args) {
            Demo1 demo1=new Demo1();
            Demo1 demo2 = new Demo1();
            Demo1.fun2();
            System.out.println(Demo1.Demo2.country);
        }

    }
