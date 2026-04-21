package JAVA_DSA_ASSIGNMENT_4;
//Q3. Selection Sort 
//Sort an array using Selection Sort. 
//Test Cases: 
//• Input: [64, 25, 12, 22, 11] → Output: [11, 12, 22, 25, 64] 
//• Input: [29, 10, 14, 37, 13] → Output: [10, 13, 14, 29, 37]

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort1
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
        System.out.println(Arrays.toString(arr));
	}

	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the size of first array");
		
		int n=sc.nextInt();
		
		
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		selectionSort(arr);
System.out.println("Enter the size of second array");
		
		int n1=sc.nextInt();
		
int arr2[]=new int[n1];
		
		for(int i=0;i<n1;i++)
		{
			arr2[i]=sc.nextInt();
		}
		
		selectionSort(arr2);
		
	}
}
//[11, 12, 22, 25, 64]
