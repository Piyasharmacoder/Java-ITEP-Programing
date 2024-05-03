public class Oopsfrection {

    // addtion of fraction
    public static fraction add(fraction f2, fraction f3) {
        int numerator = f2.num * f3.dem + f2.dem * f3.num;
        int denominator = f2.dem * f3.dem;
        fraction sum = new fraction(numerator, denominator);
        return sum;
    }

    // multilpe of fraction
    public static fraction Mul(fraction m1, fraction m2) {
        int numerator = m1.num * m2.num;
        int denominator = m1.dem * m2.dem;
        fraction sum = new fraction(numerator, denominator);
        return sum;
    }

    public static int gcd(int num, int dem) {
        int min = Math.min(num, dem);
        for (int i = min; i >= 1; i--) {
            if (num % i == 0 && dem % i == 0) {
                return i;
            }

        }
        return min;
    }

    public static class fraction {
        int num; // numreidrter
        int dem; // demreter

        // create constructor
        public fraction(int num, int dem) {
            this.num = num;
            this.dem = dem;
            simplify();
        }

        // fraction simplifiy
        public void simplify() {
            int hcf = gcd(num, dem);
            num /= hcf;
            dem /= hcf;
        }

    }

    public static void main(String[] args) {
        fraction f1 = new fraction(35, 21);
        System.out.println(f1.num + "/" + f1.dem);
        // f1.simplify();
        System.out.println(f1.num + "/" + f1.dem);

        // add fraction
        System.out.println("\n____________________add Fraction________________________");
        fraction f2 = new fraction(35, 21);
        System.out.println(f2.num + "/" + f2.dem);
        fraction f3 = new fraction(7, 3);
        System.out.println(f3.num + "/" + f3.dem);

        fraction sum = add(f2, f3);
        System.out.println(sum.num + "/" + sum.dem);

        System.out.println("\n____________________ MUltiplye Fraction________________________");
        fraction m1 = new fraction(35, 21);
        System.out.println(m1.num + "/" + m1.dem);
        fraction m2 = new fraction(7, 3);
        System.out.println(m2.num + "/" + m2.dem);

        fraction multi = Mul(m1, m2);
        System.out.println(multi.num + "/" + multi.dem);

    }

}
