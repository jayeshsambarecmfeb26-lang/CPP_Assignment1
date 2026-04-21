package JAVA_DSA_ASSIGNMENT_4;

import java.util.Arrays;

//Q4. Merge Sort 
//Write a recursive program to implement Merge Sort. 
//Test Cases: 
//• Input: [38, 27, 43, 3, 9, 82, 10] → Output: [3, 9, 10, 27, 38, 43, 82] 
//• Input: [5, 4, 3, 2, 1] → Output: [1, 2, 3, 4, 5] 
public class MergeSort
{
	static void mergeSort(int arr[], int left, int right) {
	    if (left < right) {
	        int mid = (left + right) / 2;

	        mergeSort(arr, left, mid);
	        mergeSort(arr, mid + 1, right);

	        merge(arr, left, mid, right);
	    }
	}

	static void merge(int arr[], int left, int mid, int right) {
	    int n1 = mid - left + 1;
	    int n2 = right - mid;

	    int L[] = new int[n1];
	    int R[] = new int[n2];

	    for (int i = 0; i < n1; i++) L[i] = arr[left + i];
	    for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

	    int i = 0, j = 0, k = left;

	    while (i < n1 && j < n2) {
	        if (L[i] <= R[j]) arr[k++] = L[i++];
	        else arr[k++] = R[j++];
	    }

	    while (i < n1) arr[k++] = L[i++];
	    while (j < n2) arr[k++] = R[j++];
	    
	   
	}
	
	
	public static void main(String[] args)
	{
		
		int arr[]= {38, 27, 43, 3, 9, 82, 10};
		
		mergeSort(arr,0,6);
		 System.out.println(Arrays.toString(arr));
		
	}

}
