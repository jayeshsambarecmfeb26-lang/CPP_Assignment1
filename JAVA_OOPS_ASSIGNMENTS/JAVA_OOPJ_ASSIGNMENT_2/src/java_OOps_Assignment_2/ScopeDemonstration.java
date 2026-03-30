package java_OOps_Programms_2;
//17. Scope Demonstration Program 
//Create a program: 
//Requirements: 
//● Declare variable inside: 
//○ Method 
//○ Loop 
//○ Block 
//● Try accessing outside scope (show error via comments) 
//● Print valid usages 

public class ScopeDemonstration
{

	    public static void main(String[] args) 
	    {
	        int a = 20;

	        for (int i = 0; i < 3; i++) {
	            int b = 30;
	            System.out.println("Inside loop: " + b);
	        }

	        {
	            int c = 30;
	            System.out.println("Inside block: " + c);
	        }

	        // System.out.println(b); // ERROR
	        // System.out.println(c); // ERROR

	        System.out.println("Valid a: " + a);
	    }
	

}
