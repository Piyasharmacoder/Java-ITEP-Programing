package Interface;

// interface 1 

interface DEMo5 {
    void show();
}

// now create interface2

interface DEMo6 {
    void display();
}

// now create interface3

interface DEMo7 {
    void name();

    void age();
}

class test implements DEMo5, DEMo6, DEMo7 {
    public void show() {
        System.out.println("Hello");

    }

    public void display() {
        System.out.println("IM maultiple inhertence");
    }

    public void name() {
        System.out.println("piyanka");
    }

    public void age() {
        System.out.println("18");
    }
}

public class InterF {
    public static void main(String[] args) {
        test t = new test();
        t.show();
        t.display();
        t.name();
        t.age();

    }

}
