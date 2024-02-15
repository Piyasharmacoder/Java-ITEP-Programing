class Computer {

    public void playmusic() {
        System.out.println(" music playing ");

    }

    public String getmeApen(int cost) {
        if (cost >= 20)
            return "pen";
        else
            return "nothing ";

    }
}

public class Methodenew13 {
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playmusic();
        String str = obj.getmeApen(20);
        System.out.println(str);

    }

}
