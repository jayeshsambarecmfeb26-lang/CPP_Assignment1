package java_OOps_Programms_2;

//13. Bank Account System 
//Create a class BankAccount: 
//Requirements: 
//● Variables: accountNumber, name, balance 
//● Use: 
//C-DAC Mumbai
//○ Default constructor 
//○ Parameterized constructor 
//● Display account details 
//● Create multiple objects using different constructors 

public class BankAccount 
{
	    int accNo;
	    String name;
	    double balance;

	    BankAccount() {
	        accNo = 0;
	        name = "Default";
	        balance = 0;
	    }

	    BankAccount(int accNo, String name, double balance) {
	        this.accNo = accNo;
	        this.name = name;
	        this.balance = balance;
	    }

	    void display() {
	        System.out.println(accNo + " " + name + " " + balance);
	    }

	    public static void main(String[] args) {
	        BankAccount a1 = new BankAccount();
	        BankAccount a2 = new BankAccount(201, "Suresh", 6000);

	        a1.display();
	        a2.display();
	    }
	

}
