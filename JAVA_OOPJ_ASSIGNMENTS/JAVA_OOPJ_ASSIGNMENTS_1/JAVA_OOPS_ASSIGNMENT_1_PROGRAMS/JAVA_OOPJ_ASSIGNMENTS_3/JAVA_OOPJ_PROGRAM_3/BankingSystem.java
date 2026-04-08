package JAVA_OOPJ_PROGRAM_3;

import java.util.Scanner;

//Question 3: Design a Banking System 
//Requirements: 
//Each account has: 
//● Account number, holder name 
//● Balance 
//System should: 
//● Store multiple accounts 
//● Deposit & withdraw money 
//● Prevent withdrawal if balance is insufficient 
//● Track total number of accounts  
//Support: 
//● Overloaded methods for deposit (cash / online) 
//Display: 
//● Account details with updated balance 

	class Account {
	    int accNo;
	    String name;
	    double balance;
	    static int count = 0;

	    Account(int a, String n, double b) 
	    {
	        accNo = a; name = n; balance = b;
	        count++;
	    }

	    void deposit(double amt) 
	    { 
	    	balance += amt; 
	    	}
	    void deposit(double amt, String type)
	    {
	    	balance += amt; 
	    	}

	    void withdraw(double amt) 
	    {
	        if (amt <= balance) 
	        {
	        	balance -= amt;
	        }
	        else
	        	{
	        	System.out.println("Insufficient Balance");
	        	}
	    }

	    void display() {
	        System.out.println(accNo + " " + name + " Balance=" + balance);
	    }
	}

	public class BankingSystem 
	{
	    public static void main(String[] args)
	    {    
	    	
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the number  of Accounts");
	    int p=sc.nextInt();
	    
	    for(int i=0;i<p;i++ )
	    {
	    	 System.out.println("Enter  Accounts no");
	    	 int a=sc.nextInt();
	 	    sc.nextLine();
	 	   System.out.println("Enter  Account holder name");
	 	  String n=sc.nextLine();
	 	 System.out.println("Enter  balance");
	 	 double b=sc.nextDouble();
	 	Account t = new Account(a, n, b);
	 	 System.out.println("Enter  deposit ammount");
	 	double d=sc.nextDouble();
	 	 t.deposit(d);
	 	 System.out.println("Enter  withdrawal ammount");
	 	double w=sc.nextDouble();
	        t.withdraw(w);
	        t.display();  
	    }
	    	
	    
       
	   
	  
	   
	        
	
	    }
	
}
