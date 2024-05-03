// Q 18) Create class Product (pid, price, quantity) with parameterized constructor.
//  Create a main function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) in XYZ class 
// to calculate and return total amount spent on all products. 
// (amount spent on single product=price of product * quantity of product).

// create class product

import java.util.Scanner;

class Product {
    int pid;
    double price;
    int quantity;

    // create parameterized constructor
    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

// Create a main function in different class (say XYZ) and perform following
// task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
public class Oopstest11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("__________________________________Product Details list ___________________________________\n\n");
        // 5 products ki jaankari user se input kr
        Product[] products = new Product[5]; // store  in array 

        for (int i = 0; i < 5; i++) {
            // user se input
            System.out.println("Enter the  information of the Products : " + (i + 1));
            System.out.print("Enter the product id       :  ");
            int pid = sc.nextInt();
            System.out.print("Enter the product price    :  ");
            double price = sc.nextDouble();
            System.out.print("Enter the product quantity :  ");
            int quantity = sc.nextInt();
            System.out.println("_________________________________________________________\n");

            products[i] = new Product(pid, price, quantity);

        }
        // Sabse zyada price wala product ka prodouct id find karne ke liye  .
        int maxPricePid = getMaxPricePid(products);
        System.out.println("Product ID of the product with highest price  : " + maxPricePid);

        // Total amount spent ko calculate karne ke liye 
        double totalAmountSpent = calculateTotalAmountSpent(products);
        System.out.println("Total amount spent on all products  : " + totalAmountSpent+"\n\n");

        sc.close();

    }

    // now Find P Id of product with highest price.
    // Sabse zyada price wala product ka prodouct id find karna .
    public static int getMaxPricePid(Product[] products) {
        double maxPrice = Double.MIN_VALUE;
        int maxPricePid = -1;
        for (Product product : products) {
            if (product.price > maxPrice) {
                maxPrice = product.price;
                maxPricePid = product.pid;
            }
        }
        return maxPricePid;
    }

    // Method to calculate total amount spent on all products
       public static double calculateTotalAmountSpent(Product[] products) {
        double totalAmountSpent = 0;
        for (Product product : products) {
            totalAmountSpent += (product.price * product.quantity);
        }
        return totalAmountSpent;
    }

}
