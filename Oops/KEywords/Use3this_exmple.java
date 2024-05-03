package KEywords;

//3. this () can be invoke current class constructor .


class exmple3 {
    // create a constructor
    exmple3() {
        System.out.println("No arguments constructor");
    }

    // create a constructor
    exmple3(int x) {
        // use this keyword
        this();
        System.out.println("paramiterized constructor with parameter");
    }
}

public class Use3this_exmple {

    public static void main(String[] args) {
        exmple3 obj1 = new exmple3(10);

    }
}
