package java_OOps_Programms_2;


//4. Grocery Store Bill Generator 
//Create a billing system for a small grocery shop. 
//Requirements 
//● Accept item names, quantity, and price for multiple items. 
//● Store item totals in arrays. 
//● Calculate total bill amount. 
//● Apply discount: 
//○ 10% discount if bill is above Rs. 3000 
//● Print the final bill in proper format. 



import java.util.*;
public class GroceryStoreBillGenerator 
{
	

	    public static void main(String args[]) 
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter number of items: ");
	        int n = sc.nextInt();

	        double total = 0;

	        for (int i = 1; i <= n; i++) {
	            System.out.print("Enter price of item " + i + ": ");
	            double price = sc.nextDouble();

	            System.out.print("Enter quantity: ");
	            int qty = sc.nextInt();

	            total = total + (price * qty);
	        }

	        double discount = 0;
	        if (total > 3000) {
	            discount = total * 0.10;
	        }

	        double finalAmount = total - discount;

	        System.out.println("\nTotal = Rs. " + total);
	        System.out.println("Discount = Rs. " + discount);
	        System.out.println("Final Bill = Rs. " + finalAmount);
	    }
	
	
}
