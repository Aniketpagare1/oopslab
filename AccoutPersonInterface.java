/*Implementing “Multiple Inheritance”. 
Create a two interfaces Account containing methods set() and display() And interface Person containing methods store() and disp(). 
Derive a class Customer from Person and Account. Accept the name, account number, balance and display all the information related to account along with the interest.*/ 
import java.util.Scanner;
// Account interface
interface Account {
    void set(String accountNumber, double balance);
    void display();
}
// Person interface
interface Person {
    void store(String name);
    void disp();
}
// Customer class implementing Account and Person interfaces
class Customer implements Account, Person {
    private String name;
    private String accountNumber;
    private double balance;
    @Override
    public void set(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    @Override
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
    @Override
    public void store(String name) {
        this.name = name;
    }
    @Override
    public void disp() {
        System.out.println("Name: " + name);
    }
    public void calculateInterest(double interestRate) {
        double interest = balance * interestRate / 100;
        balance += interest;
        System.out.println("Interest: $" + interest);
        System.out.println("Updated Balance: $" + balance);
    }
}
// Main class
public class AccoutPersonInterface {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = new Customer();
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        customer.store(name);
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter balance: $");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        customer.set(accountNumber, balance);
        System.out.println("\nCustomer Information:");
        customer.disp();
        customer.display();
        System.out.print("\nEnter interest rate (%): ");
        double interestRate = scanner.nextDouble();
        System.out.println("\nAccount Information with Interest:");
        customer.calculateInterest(interestRate);
        scanner.close();
    }
}
