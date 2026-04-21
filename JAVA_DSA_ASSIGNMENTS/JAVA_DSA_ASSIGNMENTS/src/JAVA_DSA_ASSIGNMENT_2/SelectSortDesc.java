package JAVA_DSA_ASSIGNMENT_2;

import java.util.Arrays;

//Q3.Selection Sort in Descending Order 
//Problem Description: 
//Modify the Selection Sort algorithm to sort an array in descending order. 
//. 
//Example: 
//Input: [3, 5, 1, 2] 
//Output: [5, 3, 2, 1]

public class SelectSortDesc
{

	
	public static void selectionSort(int[] arr)
	{
        int n = arr.length;
        for (int i = 0; i < n - 1; i++)
        {
            int minIndex = i;

           for (int j = i + 1; j < n; j++)
           {
                if (arr[j] < arr[minIndex]) 
                {
                    minIndex = j;
                }
            }

            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
	}
static void printArray(int[]arr)
{
	System.out.print("[ ");
	for(int i=arr.length-1;i>=0;i--)
	{
	System.out.print(arr[i]+" ");

	}
	System.out.print("]");

}
	
	public static void main(String[] args) {
		
		
		int arr[]= {3, 5, 1, 2};
		
		selectionSort(arr);
		printArray(arr);
	}
}
