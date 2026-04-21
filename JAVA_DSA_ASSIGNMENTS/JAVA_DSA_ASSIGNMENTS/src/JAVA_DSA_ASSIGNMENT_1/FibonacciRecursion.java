package JAVA_DSA_ASSIGNMENT_1;

import java.util.Scanner;

//2. Fibonacci Sequence with Recursive Definition 
//Problem Description: 
//The Fibonacci sequence is defined as: 
// F(0) = 0, F(1) = 1  
// F(n) = F(n-1) + F(n-2) for n ≥ 2  
//Example: 
//Input: n = 5 
//Output: 5 

public class FibonacciRecursion 
{

	    static int fibonacci(int n) 
	    {
	        if (n == 0)
	        {
	            return 0;
	        }
	        else if (n == 1) 
	        	{
	        	return 1;
	        	}
	        else
	        {
	            return fibonacci(n - 1) + fibonacci(n - 2);
	    }
	    }
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Position of series: ");
	        int n = sc.nextInt();
	        
	        
	        
	        int result = fibonacci(n);
	        		
	        		 System.out.println(result);
	        		

	        		 sc.close();
	    }

	    
	    
}
