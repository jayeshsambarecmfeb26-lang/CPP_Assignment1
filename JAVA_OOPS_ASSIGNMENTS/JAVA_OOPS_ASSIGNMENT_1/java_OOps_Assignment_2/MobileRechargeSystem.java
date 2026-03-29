package java_OOps_Programms_2;

//7. Mobile Recharge System 
//Create a recharge application for prepaid mobile users. 
//Requirements 
//● Ask for mobile number and recharge amount. 
//● Show recharge plans using switch-case. 
//● Example: 
//○ Rs. 199 → 28 days validity 
//○ Rs. 399 → 56 days validity 
//○ Rs. 599 → 84 days validity 
//● Print recharge confirmation with plan details.


import java.util.Scanner;

public class MobileRechargeSystem 
{

	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Mobile Number: ");
	        String mobile = sc.nextLine();

	        System.out.print("Enter Recharge Amount: ");
	        int amount = sc.nextInt();

	        String validity;

	        switch (amount) {
	            case 199:
	                validity = "28 days";
	                break;
	            case 399:
	                validity = "56 days";
	                break;
	            case 599:
	                validity = "84 days";
	                break;
	            default:
	                validity = "Invalid Plan";
	        }

	        System.out.println("Recharge Successful!");
	        System.out.println("Mobile " + mobile);
	        System.out.println("Amount Rs." + amount);
	        System.out.println("Validity  " + validity);
	    }
	

}
