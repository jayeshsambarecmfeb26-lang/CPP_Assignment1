package JAVA_DSA_ASSIGNMENT_4;
//Q1. Bubble Sort 
//Write a program to implement Bubble Sort on an integer array. 
//Test Cases: 
//• Input: [5, 2, 9, 1, 5, 6] → Output: [1, 2, 5, 5, 6, 9] 
//• Input: [3, 2, 1] → Output: [1, 2, 3] 
//• Input: [1, 2, 3] → Output: [1, 2, 3]

import java.util.Arrays;

public class BubbleSort1
{
	
	 static void bubble1(int []a)
	 {
		 for(int i=0;i<a.length-1;i++)
		 {
			
			 for(int j=0;j<a.length-1-i;j++)
			 {
				 if(a[j]>a[j+1])
				 {
					 int temp=a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					 
				
				 }
			 }
//			if(!swapped)
//			{
//				break;
//			}
	           
		 }
	
		 System.out.println("Output: "+Arrays.toString(a));
	 }
	
	public static void main(String[] args) 
	{
		
		int a[]= {5, 2, 9, 1, 5, 6};
		
		int b[]= {3, 2, 1};
		
		int c[]= { 1, 2, 3 };
		
		bubble1(a);
		
		bubble1(b);
		bubble1(c);
	}
}


