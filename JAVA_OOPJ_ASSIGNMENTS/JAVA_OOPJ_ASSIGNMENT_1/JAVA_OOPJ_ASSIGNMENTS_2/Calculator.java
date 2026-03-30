package java_OOps_Programms_2;

//11. Calculator System (Overloaded Methods) 
//Create a Java program for a calculator: 
//Requirements: 
//● Create methods named calculate 
//● Overload them for: 
//○ int + int 
//○ double + double 
//○ int + int + int 
//● Call all methods from main 
//● Display results clearly

public class Calculator
{

	    void calculate(int a, int b)
	    {
	        System.out.println("Sum of integer datatype: " + (a + b));
	    }

	    void calculate(double a, double b) 
	    {
	        System.out.println("Sum of double datatype: " + (a + b));
	    }

	    void calculate(int a, int b, int c)
	    {
	        System.out.println("Sum 3 integer values: " + (a + b + c));
	    }

	    public static void main(String[] args)
	    {
	        Calculator c = new Calculator();
	        c.calculate(5, 10);
	        c.calculate(5.5, 7.5);
	        c.calculate(5, 10, 15);
	    }
	

}
