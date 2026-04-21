package JAVA_DSA_ASSIGNMENT_1;

import java.util.Scanner;

//Problem Description: 
//Given a string, write a recursive function to reverse it. You are not allowed to use loops or built
//in reverse functions. 
//Hint: 
//Think about reducing the problem size by removing one character at a time and solving the 
//smaller problem. 
//Example: 
//Input: "recursion" 
//Output: "noisrucer" 
//Requirements: 
// Base case: when the string becomes empty or has one character.  
// Recursive step: process the remaining substring. 

public class ReverseStringRecursion 
{
	
	  static String reverse(String str) 
	  {
	        
	        if (str.length() <= 1)
	        {
	            return str;
	        }

	        return reverse(str.substring(1)) + str.charAt(0);
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        String input = sc.nextLine();
	        System.out.println(reverse(input));
	        
	        sc.close();
	    }
	

}
