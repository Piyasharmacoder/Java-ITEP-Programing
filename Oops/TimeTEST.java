

class Time1 {
    private int h, m, s;

    public Time1(int h, int m, int s) {
        this.h = h;
        this.m = m;
        this.s = s;
    }

    public Time1() {
    }

    public Time1 addTime(Time1 t) {
        Time1 temp = new Time1();
        temp.h = this.h + t.h;
        temp.m = this.m + t.m;
        temp.s = this.s + t.s;
        if (temp.s >= 60) {
            temp.m++;
            temp.s -= 60;
        }
        if (temp.m >= 60) {
            temp.h++;
            temp.m -= 60;
        }
        return temp;

    }

    void display() {
        System.out.println(h + ":" + m + ":" + s );
    }
}

public class TimeTEST {
    
    public static void main(String[] args) {
        Time1 T1 = new Time1(2, 15, 52);
        Time1 T2 = new Time1(4, 42, 41);
        Time1 T3 = T1.addTime(T2);
        T3.display();
    }
}
