package Interface;

interface SimlpeInterface {
    void method1();

    void method2();

}

interface childSimlpe_Interface extends SimlpeInterface {
    void method3();

    void method4();
}

class mySample_class implements childSimlpe_Interface {
    // methodes implementetion
    public void method1() {
        System.out.println("method1");
    }

    public void method2() {
        System.out.println("Methode2");
    }

    public void method3() {
        System.out.println("Methode3");
    }

    public void method4() {
        System.out.println("Methode4");
    }
}

public class InterfaceInheritancen {
    public static void main(String[] args) {

        mySample_class meth = new mySample_class();
        meth.method1();
        meth.method2();
        meth.method3();
        meth.method4();
    }

}
