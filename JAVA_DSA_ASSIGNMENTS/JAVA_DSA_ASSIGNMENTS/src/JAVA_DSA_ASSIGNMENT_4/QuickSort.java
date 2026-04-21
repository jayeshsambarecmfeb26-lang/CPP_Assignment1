package JAVA_DSA_ASSIGNMENT_4;
//Q5. Quick Sort 
//Implement Quick Sort using the last element as the pivot. 
//Test Cases: 
//• Input: [10, 7, 8, 9, 1, 5] → Output: [1, 5, 7, 8, 9, 10] 
//• Input: [1, 1, 1, 1] → Output: [1, 1, 1, 1]

public class QuickSort 
{
	
	   
	    static void quickSort(int arr[], int low, int high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);

	            quickSort(arr, low, pi - 1);  // Left side
	            quickSort(arr, pi + 1, high); // Right side
	        }
	    }

	  
	    static int partition(int arr[], int low, int high) {
	        int pivot = arr[high];  // last element as pivot
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            if (arr[j] <= pivot) {
	                i++;

	             
	                int temp = arr[i];
	                arr[i] = arr[j];
	                arr[j] = temp;
	            }
	        }

	   
	        int temp = arr[i + 1];
	        arr[i + 1] = arr[high];
	        arr[high] = temp;

	        return i + 1;
	    }

	  
	    static void printArray(int arr[]) {
	        for (int num : arr) {
	            System.out.print(num + " ");
	        }
	        System.out.println();
	    }

	  
	    public static void main(String[] args) {

	        int arr1[] = {10, 7, 8, 9, 1, 5};
	        
	        quickSort(arr1, 0, arr1.length - 1);
	        System.out.print("Output: ");
	        printArray(arr1);

	        int arr2[] = {1, 1, 1, 1};
	        
	        quickSort(arr2, 0, arr2.length - 1);
	        System.out.print("Output: ");
	        printArray(arr2);
	    
	}

}
