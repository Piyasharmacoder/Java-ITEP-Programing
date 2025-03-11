package MiniProjectjava;
//. Create a Bank class and declare an instance variable named amount of type double.Create parameterized constructor 
//to initialize variable “amount” with value 10000.Create two methods withdraw(double withdrawalAmount) and deposit(double depositAmount).
//Calculate withdrawal based on some condition (using ternary operator) like If amount is sufficient then “
//withdraw successful” message will be printed on the console and amount should be updated after
//withdraw. Later on, deposit 5000 in the account balance.At the end display total balance on the console.

public class Bank1 {

    private double amount;

    // Parameterized Constructor
    public Bank1(double amount) {
        this.amount = amount;
    }

    // ---------------------------------------------------- WithdrawMethod--------------------------------------------------------//
    public void withdraw(double withdrawalAmount) {
        String result = (withdrawalAmount <= amount)
                ? "Withdraw successful"
                : "Insufficient balance";
        if (withdrawalAmount <= amount) {
            amount -= withdrawalAmount;
        }
        System.out.println(result);
    }

    // ----------------------------------------------------- DepositMethod--------------------------------------------------------//
    public void deposit(double depositAmount) {
        amount += depositAmount;
        System.out.println("Deposit successful");
    }

    // -------------------------------------------- MethodtoDisplayTotalBalance------------------------------------------------//
    public void displayBalance() {
        System.out.println("Total balance: " + amount);
    }
    // --------------------------------------------------Mainclass--------------------------------------------------------------//

    public static void main(String[] args) {

        Bank1 accountNum = new Bank1(10000);

        // call withdrawal methode
        accountNum.withdraw(3000);

        // call Deposit amount methode
        accountNum.deposit(5000);

        // Display total balance
        accountNum.displayBalance();
    }
}