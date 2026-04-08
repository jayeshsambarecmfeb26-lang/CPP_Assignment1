package java_OOps_Programms_2;

//18. Expression Evaluator 
//Create a program: 
//Requirements: 
//● Take 3 numbers 
//● Perform: 
//○ (a + b) * c 
//○ a > b && b > c 
//○ a % b 
//● Show results with explanation 

import java.util.Scanner;

public class ExpressionEvaluator 
{
	
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        int c = sc.nextInt();

	        System.out.println("(a+b)*c = " + ((a+b)*c));
	        System.out.println("a>b && b>c = " + (a>b && b>c));
	        System.out.println("a%b = " + (a%b));
	    }
	

}
