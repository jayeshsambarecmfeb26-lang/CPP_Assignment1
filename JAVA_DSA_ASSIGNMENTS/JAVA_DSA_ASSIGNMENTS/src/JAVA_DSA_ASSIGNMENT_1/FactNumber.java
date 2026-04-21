
//1. Factorial with Edge Case Handling 
//Problem Description: 
//You are given a non-negative integer n. Write a recursive function to compute its factorial. 
//The factorial of a number n is defined as: 
// n! = n × (n-1) × (n-2) × ... × 1  
// By definition, 0! = 1  
//Your function must correctly handle the edge case when n = 0. Also consider what should 
//happen if a negative number is passed. 
//Requirements: 
// Use recursion only (no loops).  
// Clearly define the base case.  
// Ensure your function does not cause infinite recursion




package JAVA_DSA_ASSIGNMENT_1;

public class FactNumber 
{

 static int factorial(int n)
 {
	
	 if(n==0 )
	 { 
	return 1;
	 }
	 else
	 {
		return n*factorial(n-1); 
	 }
	
	 
 }



public static void main(String[] args) 
{
	int n=5;
	if(n>0)
	{
	System.out.println(factorial(n));//120
	}
	else
	{
		System.out.println("number is negative");
	}
}


}
