package Basicprogram.operators.logical;
   
    class logicalor  {
    public static void main(String args[]) {
        int a = 5;
        System.out.println(a < 5 && a < 20);
        System.out.println(a < 5 || a < 20);
        System.out.println(!(a < 5 && a < 20));
    }
}
