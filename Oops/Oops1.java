class Animal {
  String color;
  String name;
  int age;

}
// using refrence variable 

public class Oops1 {
  public static void main(String[] args) {
    Animal obj = new Animal();
    obj.color = "blue";
    obj.name = "Piya";
    obj.age = 20;
    System.out.println(obj.name + " " + obj.color + " " + obj.age);

  }

}
