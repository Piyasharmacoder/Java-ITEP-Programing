package PracticeSetInOops;
// overload a constructoer used to inctialige a rectrangle fo length 4 and breath 5 for using custom parameters 

class TrangleExmple {
    private int leght;
    private int breath;

    // create constructor to initialize
    public TrangleExmple() {
        leght = 4;
        breath = 5;
    }

    // create overloadeed constructor
    public TrangleExmple(int leght, int breath) {
        this.leght = leght;
        this.breath = breath;

    }

    // now use getter methode
    public int getLength() {
        return leght;
    }

    // then use setter methode
    public void setLength(int leght) {
        this.leght = leght;
    }

    // now use getter methode to breath
    public int getBreath() {
        return breath;

    }

    // then use setter methode to breth
    public void setBreath(int breath) {
        this.breath = breath;
    }

}

public class Ques3 {
    public static void main(String[] args) {
        TrangleExmple t = new TrangleExmple();

       System.out.println( t.getLength());
       System.out.println(t.getBreath());
    }

}
