import java.util.Scanner;

class Dog {
    private String name;
    private String breed;

    public Dog(String name, String breed) {
        this.name = name;
        this.breed = breed;

    }

    public void setname(String name) {
        this.name = name;
    }

    public void setbreed(String breed) {
        this.breed = breed;
    }

    public void printdata() {
        System.out.println("---------------------\nPrint data\n---------------------");
        System.out.println("Name : " + name);
        System.out.println("Breed : " + breed + "\n");
    }
}

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of Dog : ");
        String name = sc.nextLine();
        System.out.print("Enter Breed of Dog : ");
        String breed = sc.nextLine();
        Dog obj = new Dog(name, breed);
        obj.printdata();
        System.out.println("Do you want to update name and breed\nYES or NO....?");
        String check = sc.next();
        if (check.equals("1") || check.equals("yes")) {
            System.out.println("What do you want to change\nName\tBreed\tBoth");
            String update = sc.next();
            switch (update) {
                case "name":
                    System.out.print("Enter name : ");
                    sc.nextLine();
                    String name1 = sc.nextLine();
                    obj.setname(name1);
                    obj.printdata();
                    break;

                case "breed":
                    System.out.print("Enter breed");
                    sc.nextLine();
                    String breed1 = sc.nextLine();
                    obj.setbreed(breed1);
                    obj.printdata();
                    break;

                case "both":
                    System.out.print("Enter name : ");
                    sc.nextLine();
                    String name2 = sc.nextLine();
                    System.out.print("Enter breed");
                    String breed2 = sc.nextLine();
                    obj.setname(name2);
                    obj.setbreed(breed2);
                    obj.printdata();
                    break;

                default:
                    break;
            }
        }

    }
}
