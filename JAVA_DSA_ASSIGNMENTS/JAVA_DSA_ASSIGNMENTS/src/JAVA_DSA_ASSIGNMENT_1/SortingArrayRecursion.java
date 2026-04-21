package JAVA_DSA_ASSIGNMENT_1;

//4. Check if an Array is Sorted 
//Problem Description: 
//Approach Hint: 
//Given an integer array, determine whether it is sorted in ascending order using recursion. 
//Instead of checking the whole array at once, compare elements step by step recursively. 
// Compare the current element with the next one.  
// Then recursively check the rest of the array.  
//Example: 
//Input: [2, 4, 6, 8] → Output: true 
//Input: [3, 5, 2, 9] → Output: false 
//Requirements: 
// Do not use loops.  
// Use an index parameter to track position.

public class SortingArrayRecursion 
{
	
	public static boolean  sortArray(int[] a,int index )
			
	{
		
		if(index==a.length-1)
		{
			return true;
			
		}
		 if(a[index]>a[index+1])
		 {
			 return false;
		 }
		 
		 return sortArray(a,index+1);
		
			}
	
	public static void main(String[] args)
	{
		int a[]= {2, 4, 6, 8};
		
		System.out.println(sortArray(a,0));
		
		int b[]= {3, 5, 2, 9};
		System.out.println(sortArray(b,0));
	}

}
