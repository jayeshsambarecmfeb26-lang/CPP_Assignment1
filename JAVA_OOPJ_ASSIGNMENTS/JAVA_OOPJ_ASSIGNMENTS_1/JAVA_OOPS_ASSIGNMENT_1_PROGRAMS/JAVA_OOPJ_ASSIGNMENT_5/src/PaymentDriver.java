//Question 4: Payment Processing using Generics 
//A company is building a simple payment system that supports different payment types such as: 
//● Credit Card 
//● UPI 
//The system should use Generics so that it can handle different payment types in a flexible way. 
//1. Create Base Class 
//● Create a class Payment with: 
//○ paymentId 
//○ amount 
//● Add a method displayPayment() 
//2. Create Subclasses 
//● Create at least two subclasses: 
//○ CreditCardPayment 
//○ UPIPayment 
//● Each should override displayPayment() 
//C-DAC Mumbai
//3. Use ArrayList with Generics 
//● Create a separate ArrayList for: 
//○ Credit card payments 
//○ UPI payments 
//● Add at least 2–3 records in each list 
//4. Generic Method (Using Wildcard) 
//● Create a method that: 
//○ Accepts a list of any type that extends Payment (? extends Payment) 
//○ Traverses the list 
//○ Displays all payments 
//5. Execution 
//● Call the method for both lists 
//● Display all payment details

import java.util.*;

	class Payment {
	    int paymentId;
	    double amount;

	    Payment(int paymentId, double amount) {
	        this.paymentId = paymentId;
	        this.amount = amount;
	    }

	    void displayPayment() {
	        System.out.println("Payment ID: " + paymentId + " Amount: " + amount);
	    }
	}
	
	class CreditCardPayment extends Payment {
	    CreditCardPayment(int id, double amt) {
	        super(id, amt);
	    }

	    void displayPayment() {
	        System.out.println("Credit Card Payment  ID: " + paymentId + " Amount: " + amount);
	    }
	}

	class UPIPayment extends Payment 
	{
	    UPIPayment(int id, double amt) 
	    {
	        super(id, amt);
	    }

	    void displayPayment()
	    {
	        System.out.println("UPI Payment -> ID: " + paymentId + " Amount: " + amount);
	    }
	}
	
	

	class PaymentProcessor 
	{
	    public static void processPayments(List<? extends Payment> list) 
	    {
	        for (Payment p : list) {
	            p.displayPayment();
	        }
	    }
	}

	public class PaymentDriver 
	{
	    public static void main(String[] args) 
	    {
	        List<CreditCardPayment> creditList = new ArrayList<>();
	        creditList.add(new CreditCardPayment(1, 5000));
	        creditList.add(new CreditCardPayment(2, 6000));

	        List<UPIPayment> upiList = new ArrayList<>();
	        upiList.add(new UPIPayment(3, 700));
	        upiList.add(new UPIPayment(4, 900));

	        PaymentProcessor.processPayments(creditList);
	        PaymentProcessor.processPayments(upiList);
	    }
	
}
