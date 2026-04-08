package java_OOps_Programms_2;

//3. ATM Simulation 
//Create a simple ATM system. 
//Requirements 
//● Show a menu using switch-case: 
//1. Check Balance 
//2. Deposit Money 
//3. Withdraw Money 
//4. Exit 
//● Start with an initial balance. 
//● Prevent withdrawal if balance is insufficient. 
//● Continue showing the menu until the user chooses Exit.



import java.util.*;

public class ATM_System
{


	    public static void main(String args[]) 
	    {
	        Scanner sc = new Scanner(System.in);

	        double balance = 500;
	        int choice;

	        do 
	        {
	            System.out.println("1.Check Balance");
	            System.out.println("2. Deposit");
	            System.out.println("3. Withdraw");
	            System.out.println("4. Exit");
	            
	            System.out.print("Enter Option number : ");
	            
	            
	            choice = sc.nextInt();

	            switch (choice)
	            {
	                case 1:
	                    System.out.println("Balance: Rs. " + balance);
	                    break;

	                case 2:
	                    System.out.print("Enter amount to deposit: ");
	                    double deposit = sc.nextDouble();
	                    balance += deposit;
	                    break;

	                case 3:
	                    System.out.print("Enter amount to withdraw: ");
	                    double withdraw = sc.nextDouble();
	                    if (withdraw <= balance) {
	                        balance -= withdraw;
	                    } else {
	                        System.out.println("Insufficient Balance!");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Thank you for choosing our Atm");
	                    break;

	                default:
	                    System.out.println(" Invalid choice!");
	            }

	        } while (choice != 4);
	    }
	
}
