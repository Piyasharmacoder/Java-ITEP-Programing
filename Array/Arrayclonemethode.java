public class Arrayclonemethode {
    public static void main(String[] args )throws CloneNotSupportedException {
        Student obj1= new Student();
        obj1.roll_no=1;
        Student obj2 = (Student) obj1.clone();
        obj2.roll_no =5;

        System.out.println(obj1.roll_no);
        System.out.println(obj2.roll_no);
    }
    
}
