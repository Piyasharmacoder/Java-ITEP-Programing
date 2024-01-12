 package Assignment1;

 import java.util.Scanner;
class Program4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("  Enter the temperature  in fahrenheit : ");
        double F = sc.nextDouble();
        double C = (F - 32) * 5 / 9F;
        System.out.println(" Temperature  into fahrenheit to celcius  :" + C);
    }
}
