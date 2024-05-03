package MiniProjectjava.OOpsProject;

import java.util.Scanner;
import java.util.UUID;

//  create interface  name utility methods

interface UtilityMethods {
    public void get_details();

    public void set_details();
}

class Shworoom implements UtilityMethods {

    String shoroom_Name;
    String shoroom_Address;
    int shoroom_Phone;
    // String Shoroom_Email;
    String shoroom_Type;
    int total_Empolyees;
    int total_cars_in_stock = 0;

    String mangner_Name;

    @Override
    // get tha deatils
    public void get_details() {
        System.out.println("Showroom Name : " + shoroom_Name);
        System.out.println("Showroom Address : " + shoroom_Address);
        System.out.println("Showroom Phone : " + shoroom_Phone);
        // System.out.prlnintln("Showroom Email : " + Shoroom_Email);
        // System.out.println("Showroom Type : " + Shoroom_Type);

        System.out.println("Mangenner Name : " + mangner_Name);

        System.out.println("Total Employees : " + total_Empolyees);
        System.out.println("Total cars in stock : " + total_cars_in_stock);

    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        System.out.println(
                "=======================================***ENTER SHOWROOMS DETAILS***============================================");
        System.out.println();

        System.out.print("SHWOROOM NAME : ");
        shoroom_Name = sc.nextLine();

        System.out.print("SHWOROOM ADDRESS : ");
        shoroom_Address = sc.nextLine();

        System.out.print("MANGNER NAME :");
        mangner_Name = sc.nextLine();

        System.out.print("SHWOROOM PHONE : ");
        shoroom_Phone = sc.nextInt();

        // System.out.println("SHWOROOM EMAIL : ");
        // Shoroom_Email = sc.nextLine();

        // System.out.print("SHWOROOM TYPE : ");
        // Shoroom_Type = sc.nextLine();

        System.out.print("TOTAL EMPLOYEES : ");
        total_Empolyees = sc.nextInt();

        System.out.print("TOTAL CARS IN STOCK : ");
        total_cars_in_stock = sc.nextInt();

    }

}

// class employees

class Employees extends Shworoom implements UtilityMethods {
    String emp_id;
    String emp_name;
    String emp_address;
    int emp_phone;
    int emp_age;
    String emp_department;

    @Override
    // get employees details
    public void get_details() {
        System.out.println("EMPLOYEE ID : " + emp_id);
        System.out.println("EMPLOYEE NAME : " + emp_name);
        System.out.println("EMPLOYEE ADDRESS : " + emp_address);
        System.out.println("EMPLOYEE PHONE : " + emp_phone);
        System.out.println("EMPLOYEE AGE : " + emp_age);
        System.out.println("EMPLOYEE DEPARTMENT : " + emp_department);
        System.out.println("SHOWROOM NAME : " + shoroom_Name);

    }

    @Override
    // set employees details
    public void set_details() {
        Scanner sc = new Scanner(System.in);
        System.out.println();

        UUID uuid = UUID.randomUUID();
        emp_id = String.valueOf(uuid);

        System.out.println();
        System.out.println(
                "=======================================***ENTER EMPLOYEES DETAILS***============================================");
        System.out.println();

        // System.out.println("EMPLOYEE ID : ");
        // emp_id = sc.nextLine();

        System.out.print("EMPLOYEE NAME : ");
        emp_name = sc.nextLine();

        System.out.print("EMPLOYEE ADDRESS : ");
        emp_address = sc.nextLine();

        System.out.print("EMPLOYEE DEPARTMENT : ");
        emp_department = sc.nextLine();

        System.out.print("SHOWROOM NAME : ");
        shoroom_Name = sc.nextLine();

        System.out.print("EMPLOYEE PHONE : ");
        emp_phone = sc.nextInt();

        System.out.print("EMPLOYEE AGE : ");
        emp_age = sc.nextInt();

    }

}

// class Car
class Car extends Shworoom implements UtilityMethods {
    // data members
    String car_name;
    String car_model;
    String car_color;
    String car_type;
    int car_prices;
    String car_fule_type;
    String car_transmission;

    @Override
    public void get_details() {
        System.out.println("CAR NAME : " + car_name);
        System.out.println("CAR MODEL : " + car_model);
        System.out.println("CAR COLOR : " + car_color);
        System.out.println("CAR TYPE : " + car_type);
        System.out.println("CAR PRICES : " + car_prices);
        System.out.println("CAR FULE TYPE : " + car_fule_type);
        System.out.println("CAR TRANSMISSION : " + car_transmission);
        // System.out.println("SHOWROOM NAME : " + Shoroom_Name);

    }

    @Override
    public void set_details() {
        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println(
                "=======================================*** ENTER CAR DETAILS ***============================================");

        System.out.println();
        System.out.print("CAR NAME : ");

        car_name = sc.nextLine();
        System.out.print("CAR MODEL : ");
        car_model = sc.nextLine();

        System.out.print("CAR COLOR : ");
        car_color = sc.nextLine();

        System.out.print("CAR TYPE(SVU/SEDAn/WBM/NAINO/) : ");
        car_type = sc.nextLine();

        System.out.print("CAR FULE TYPE  (PETROL/DIESEL): ");
        car_fule_type = sc.nextLine();

        System.out.print("CAR TRANSMISSION(ATOMATIC/MANUAL) : ");
        car_transmission = sc.nextLine();

        System.out.print("CAR PRICES : ");
        car_prices = sc.nextInt();

        // System.out.println("SHOWROOM NAME : ");
        total_cars_in_stock++;

    }
}
// this is the main class

public class CarShowroomMengement {
    static void main_menu() {
        System.out.println();
        System.out.println(
                "======================================= *** WELCOM TO SHOEROOM MANAGEMENT SYSTEM *** ============================================");
        System.out.println();
        System.out.println(
                "=============================================== *** SELECT YOUR CHOISE HERE *** ==================================================");
        System.out.println();
        System.out.println(" 1.] ADD SHOEROOM \t\t\t  2.] ADD EMPLOYESS \t\t\t  3.] ADD CARS");
        System.out.println();
        System.out.println(" 4.] GET SHOEROOM \t\t\t  5.] GET EMPLOYESS \t\t\t  6.] GET CARS");
        System.out.println();

        // System.out.println(" 7.] UPDATE SHOEROOM \t\t\t 8.] UPDATE EMPLOYESS \t\t\t
        // 9.] UPDATE CARS");
        // System.out.println();
        // System.out.println(" 10.] DELETE SHOEROOM \t\t\t 11.] DELETE EMPLOYESS \t\t\t
        // 12.] DELETE CARS");
        System.out.println();
        System.out.println("\t\t\t\t\t\t ---ENTER 0 TO EXIT --- ");
        System.out.println(
                "=================================================================================================================================");
        System.out.println();
        System.out.print("ENTER YOUR CHOISE HERE : ");

    }

    public static void main(String[] args) {
        // array type object stro

        Scanner sc = new Scanner(System.in);
        Shworoom shworoom[] = new Shworoom[5];
        Employees employees[] = new Employees[5];
        Car car[] = new Car[5];

        int car_counter = 0;
        int emp_counter = 0;
        int shworoom_counter = 0;
        int choice = 100;

        // using while loop for checking

        while (choice != 0) {

            main_menu();
            choice = sc.nextInt();

            while (choice != 9 && choice != 0) {
                switch (choice) {
                    case 1:
                        shworoom[shworoom_counter] = new Shworoom();
                        shworoom[shworoom_counter].set_details();
                        shworoom_counter++;
                        System.out.println();
                        System.out.println("1.] ADD NEW SHOWROOM ");
                        System.out.println();
                        System.out.println("9.] GO BACK MAIN MENU");
                        main_menu();
                        choice = sc.nextInt();
                        break;
                    case 2:
                        employees[emp_counter] = new Employees();
                        employees[emp_counter].set_details();
                        emp_counter++;
                        System.out.println();
                        System.out.println("2.] ADD NEW EMPLOYEES ");
                        System.out.println();
                        System.out.println("9.] GO BACK MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    case 3:
                        car[car_counter] = new Car();
                        car[car_counter].set_details();
                        car_counter++;
                        System.out.println();
                        System.out.println("3.] ADD NEW CARS ");
                        System.out.println();
                        System.out.println("9.] GO BACK MAIN MENU");
                        choice = sc.nextInt();
                        break;

                    // for get deatiles in showrooms class

                    case 4:
                        for (int i = 0; i < shworoom_counter; i++) {
                            shworoom[i].get_details();
                            System.out.println();
                            System.out.println();

                        }
                        System.out.println();
                        System.out.println("9.] GO BACk TO MAIN MENU ");
                        System.out.println("0.] EXIT");
                        choice = sc.nextInt();
                        break;

                    case 5:
                        for (int i = 0; i < emp_counter; i++) {
                            employees[i].get_details();
                            System.out.println();
                            System.out.println();
                        }
                        System.out.println();
                        System.out.println("9.] GO BACk TO MAIN MENU ");
                        System.out.println("0.] EXIT");
                        choice = sc.nextInt();
                        break;

                    case 6:
                        for (int i = 0; i < car_counter; i++) {
                            car[i].get_details();
                            System.out.println();
                            System.out.println();
                        }

                        System.out.println();
                        System.out.println("9.] GO BACk TO MAIN MENU ");
                        System.out.println("0.] EXIT");
                        choice = sc.nextInt();
                        break;

                    default:
                        System.out.println("ENTER VALID CHOICE");
                        break;
                }

            }

        }

    }

}
