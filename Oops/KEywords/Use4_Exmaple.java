package KEywords;
//4. this  keyword can be used to pass  as an argument in the  method call .

class ThisDemo4 {
    // ceratea method
    void method1(ThisDemo4 dm) { // <-- pass perameter methode1
        System.out.println(" this is method1");
    }

    // create a method2
    void method2() {
        // call method1 in method2
        method1(this); // <--- pass arguments in method1
        System.out.println("this is method2");
    }

}

public class Use4_Exmaple {
    public static void main(String[] args) {
        ThisDemo4 dm = new ThisDemo4();
        dm.method2();
    }

}
