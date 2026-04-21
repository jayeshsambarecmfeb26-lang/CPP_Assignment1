package JAVA_DSA_ASSIGNMENT_4;

//Q2. Insertion Sort 
//Implement Insertion Sort to arrange elements in ascending order. 
//Test Cases: 
//• Input: [12, 11, 13, 5, 6] → Output: [5, 6, 11, 12, 13] 
//• Input: [4, 3, 2, 10, 12] → Output: [2, 3, 4, 10, 12]

import java.util.Arrays;

public class InsertationSort1 
{
	static void insertionSort(int arr[])
	{
	    for (int i = 1; i < arr.length; i++) 
	    {
	        int key = arr[i];
	        int j = i - 1;

	        while (j >= 0 && arr[j] > key) 
	        {
	            arr[j + 1] = arr[j];
	            j--;
	        }
	        arr[j + 1] = key;
	    }
	    System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args)
	{

		int arr[]= {12, 11, 13, 5, 6};
		int arr1[]= {4, 3, 2, 10, 12};

		insertionSort(arr);
		
		insertionSort(arr1);
		
	}
}
//[5, 6, 11, 12, 13]
//[2, 3, 4, 10, 12]
