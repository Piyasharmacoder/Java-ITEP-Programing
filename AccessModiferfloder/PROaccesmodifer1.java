package AccessModiferfloder;

class C1 {
    // same class ke anber hum 4 access modifer use kr skate hai

    public int x = 12;
    protected int y = 34;
    int r = 23;
    private int z = 78;

    public void math1() {
        System.out.println(x);
        System.out.println(y);
        System.out.println(r);
        System.out.println(z);

    }

}

public class PROaccesmodifer1 {
    public static void main(String[] args) {
        C1 obj = new C1();
        obj.math1();
        System.out.println("________________________");

        // same packge me use ker skate yya nai
        System.out.println(obj.x);
        System.out.println(obj.y);
        System.out.println(obj.r);
        //System.out.println(obj.z); // only private same packges me use nai kr sakte

    }

}
