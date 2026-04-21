
//Q2. Insert an Element into a Sorted Array 
//Problem Description: 
//Given a sorted array, insert a new element into its correct position using the logic of Insertion 
//Sort. 
//Example: 
//Input: [1, 3, 5, 7], insert 4 
//Output: [1, 3, 4, 5, 7] 
//Requirements: 
// Do not use extra sorting.  
// Shift elements as needed.


package JAVA_DSA_ASSIGNMENT_2;

import java.util.Arrays;

public class InsertationSort 
{

	
public static void main(String[] args)
{

	int arr[]= {1, 3, 5, 7};
	

	
	int n=arr.length;
	
	
	int key=4;
	
	int result[]=new int[n+1];//size of 2nd array
	
	
	//copy of the first array
	
	for(int i=0;i<n;i++)
	{
		result[i]=arr[i];
	}

	int i=n-1;//i=3
	
	while(i>=0 && result[i]>key)
	{
	result[i+1]=result[i];
	i--;
	}
	
	result[i+1]=key;
	
	System.out.println(Arrays.toString(result));
	
	
}
}
