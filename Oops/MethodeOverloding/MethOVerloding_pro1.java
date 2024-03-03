package MethodeOverloding;

class practise_Methode {

    // create mehode 1
    public int add(int a, int b) {
        return a + b;
    }

    // create mehode 2
    public int add(int a, int b, int c) {
        return a + b * c;

    }

    // create mehode 3
    public String name(String a, String b) {
        return a + b;

    }

    // create mehode 4
    public String name(String a, String b, String c) {
        return a + b + c;

    }

}

public class MethOVerloding_pro1 {
    public static void main(String[] args) {
        // now call methodes
        practise_Methode obj1 = new practise_Methode();
        obj1.add(12, 14);
        obj1.add(5, 5, 8);
        obj1.name("Riya", "Sharma");
        obj1.name("Priyanka", "Buniyadi", "Sharma");

    }
}
