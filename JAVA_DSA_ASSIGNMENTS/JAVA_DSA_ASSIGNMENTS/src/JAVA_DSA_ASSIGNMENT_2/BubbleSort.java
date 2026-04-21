//Q1. Trace Bubble Sort Passes 
//Problem Description: 
//Given an array, print the array after each pass of Bubble Sort. 
//Example: 
//Input: [4, 3, 2] 
//Output: 
//Pass 1: [3, 2, 4] 
//Pass 2: [2, 3, 4]



package JAVA_DSA_ASSIGNMENT_2;

import java.util.Arrays;

public class BubbleSort {

	
	 static void bubble(int []a)
	 {
		 for(int i=0;i<a.length-1;i++)//for iteration
		 {
			 for(int j=0;j<a.length-1-i;j++)//for sorting
			 {
				 if(a[j]>a[j+1])
				 {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
				 }
			 }
			 System.out.print("Pass " + (i + 1) + ": ");
	            System.out.println(Arrays.toString(a));
		 }
	

	 }
	
	public static void main(String[] args) {
		
		int a[]= {4, 3, 2};
		
		
		bubble(a);
		
		
		
	}
}
