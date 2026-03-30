package java_OOps_Programms_2;

//10. Restaurant Order Management System 
//Create a program for restaurant management. 
//Requirements 
//● Display a food menu with price list. 
//● Let the user order multiple items. 
//● Use loop and switch-case for repeated ordering. 
//C-DAC Mumbai
//● Calculate total amount. 
//● Add GST of 5%. 
//● Print final bill


import java.util.Scanner;

public class RestaurantManagement
{

	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        int choice;
	        double total = 0;

	        do {
	            System.out.println("1.Pav Bhaji - 100");
	            System.out.println("2.pizza- 200");
	            System.out.println("3.burger - 150");
	            System.out.println("4. Exit");

	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {
	                case 1: total += 100; break;
	                case 2: total += 200; break;
	                case 3: total += 150; break;
	                case 4: break;
	                default: System.out.println("Invalid choice");
	            }

	        } while (choice != 4);

	        double gst = total * 0.05;
	        double finalBill = total + gst;

	        System.out.println("Total = " +total);
	        System.out.println("GST = " +gst);
	        System.out.println("Final Bill = " +finalBill);
	    }
	
}
