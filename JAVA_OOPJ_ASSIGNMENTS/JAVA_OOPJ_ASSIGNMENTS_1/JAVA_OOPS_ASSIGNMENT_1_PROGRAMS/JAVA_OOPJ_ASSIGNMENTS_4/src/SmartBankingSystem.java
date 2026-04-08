//Q2: Smart Banking System 
//Design a system to manage bank accounts and transactions. 
//2.1 Create a base class Account with: 
//● accountNumber (int) 
//● accountHolderName (String) 
//● balance (double) 
//2.2 Create derived classes: 
//● SavingsAccount 
//● CurrentAccount 
//using inheritance. 
//2.3 Override a method displayAccountDetails() in both child classes to show account type (method 
//overriding). 
//2.4 Create an interface BankService with: 
//● deposit(double amount) 
//● withdraw(double amount) 
//2.5 Implement BankService in account classes and define logic for deposit and withdrawal. 
//2.6 Accept balance as String input and convert it into double using Wrapper classes. 
//2.7 Overload deposit method: 
//● deposit(amount) 
//● deposit(amount, bonus) 
//2.8 Implement withdrawal method: 
//● subtract amount from balance 
//● ensure balance does not go below zero 
//2.9 Create a method to generate account summary using: 
//● StringBuilder or StringBuffer 
//● Include: 
//○ account details 
//○ current balance 
//C-DAC Mumbai
//2.10 Add exception handling for: 
//● invalid numeric input 
//● negative deposit/withdrawal 
//● withdrawal greater than balance 
//2.11 In main method: 
//● take input 
//● create account object 
//● perform deposit and withdrawal 
//● display updated account summary 

import java.util.*;


class Account 
{
    int accountNumber;
    String accountHolderName;
    double balance;

    Account(int accNo, String name, String balanceStr)
    {
        this.accountNumber = accNo;
        this.accountHolderName = name;
        this.balance = Double.parseDouble(balanceStr); // Wrapper class
    }

    void displayAccountDetails() 
    {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Name: " + accountHolderName);
        System.out.println("Balance: ₹" + balance);
    }
}


interface BankService 
{
    void deposit(double amount);
    void deposit(double amount, double bonus); 
    void withdraw(double amount);
}


class SavingsAccount extends Account implements BankService 
{

    SavingsAccount(int accNo, String name, String balanceStr) {
        super(accNo, name, balanceStr);
    }


    void displayAccountDetails() 
    {
        System.out.println(" Savings Account ");
        super.displayAccountDetails();
    }

    public void deposit(double amount) {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
    }

    public void deposit(double amount, double bonus) {
        if (amount <= 0 || bonus < 0)
            throw new IllegalArgumentException("Invalid deposit/bonus");
        balance += (amount + bonus);
    }

    public void withdraw(double amount) {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid withdrawal amount");
        if (amount > balance)
            throw new ArithmeticException("Insufficient balance");

        balance -= amount;
    }

    String generateSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account Details");
        sb.append("Type: Savings\n");
        sb.append("Account No: ").append(accountNumber).append("\n");
        sb.append("Name: ").append(accountHolderName).append("\n");
        sb.append("Balance: ₹").append(balance).append("\n");
        return sb.toString();
    }
}

class CurrentAccount extends Account implements BankService
{

    CurrentAccount(int accNo, String name, String balanceStr) {
        super(accNo, name, balanceStr);
    }

   
    void displayAccountDetails() 
    {
        System.out.println("\n--- Current Account ---");
        super.displayAccountDetails();
    }

    public void deposit(double amount)
    {
        if (amount <= 0) throw new IllegalArgumentException("Invalid deposit amount");
        balance += amount;
    }

    public void deposit(double amount, double bonus) 
    {
        if (amount <= 0 || bonus < 0)
            throw new IllegalArgumentException("Invalid deposit/bonus");
        balance += (amount + bonus);
    }

    public void withdraw(double amount)
    {
        if (amount <= 0)
            throw new IllegalArgumentException("Invalid withdrawal amount");
        if (amount > balance)
            throw new ArithmeticException("Insufficient balance");

        balance -= amount;
    }

    String generateSummary() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account Details \n");
        sb.append("Type: Current\n");
        sb.append("Account No: ").append(accountNumber).append("\n");
        sb.append("Name: ").append(accountHolderName).append("\n");
        sb.append("Balance: ₹").append(balance).append("\n");
        return sb.toString();
    }
}


public class SmartBankingSystem 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Account Number: ");
            int accNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Balance (String): ");
            String balanceStr = sc.nextLine();

            System.out.println(" Choose Account Type:");
            System.out.println("1. Savings");
            System.out.println("2. Current");
            int choice = sc.nextInt();

            Account acc;

            if (choice == 1) {
                acc = new SavingsAccount(accNo, name, balanceStr);
            } else if (choice == 2) {
                acc = new CurrentAccount(accNo, name, balanceStr);
            } else {
                throw new Exception("Invalid account type");
            }

            BankService service = (BankService) acc;

            // Deposit
            System.out.print("\nEnter deposit amount: ");
            double dep = sc.nextDouble();

            System.out.print("Enter bonus amount: ");
            double bonus = sc.nextDouble();

            service.deposit(dep, bonus);

          
            System.out.print("Enter withdrawal amount: ");
            double wd = sc.nextDouble();

            service.withdraw(wd);

        
            acc.displayAccountDetails();

            if (acc instanceof SavingsAccount) 
            {
                System.out.println(((SavingsAccount) acc).generateSummary());
            } else {
                System.out.println(((CurrentAccount) acc).generateSummary());
            }

        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Invalid numeric input!");
        } catch (IllegalArgumentException | ArithmeticException e)
        {
            System.out.println(e.getMessage());
        } catch (Exception e) 
        {
            System.out.println(e.getMessage());
        }
    }
}


