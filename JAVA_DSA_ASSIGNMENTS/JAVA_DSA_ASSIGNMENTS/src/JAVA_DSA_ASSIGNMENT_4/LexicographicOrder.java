package JAVA_DSA_ASSIGNMENT_4;
//Q6. Sorting Strings (Lexicographic Order) 
//Write a program to sort an array of strings using any sorting algorithm. 
//Test Cases: 
//• Input: ["apple", "banana", "cherry", "date"] → Output: ["apple", "banana", 
//"cherry", "date"] 
// 
// 
//• Input: ["dog", "cat", "elephant", "bee"] → Output: ["bee", "cat", "dog", 
//"elephant"] 
// 
// Assignment: Tree Data Structures (Coding)

public class LexicographicOrder 
{

	    static void sortStrings(String arr[]) {
	        int n = arr.length;

	        for (int i = 0; i < n - 1; i++) {
	            for (int j = 0; j < n - i - 1; j++) {

	                if (arr[j].compareTo(arr[j + 1]) > 0) {

	                    String temp = arr[j];
	                    arr[j] = arr[j + 1];
	                    arr[j + 1] = temp;
	                }
	            }
	        }
	    }

	    static void printArray(String arr[]) {
	        for (String str : arr) {
	            System.out.print(str + " ");
	        }
	        System.out.println();
	    }

	    public static void main(String[] args) {

	        
	        String arr1[] = {"apple", "banana", "cherry", "date"};
	        sortStrings(arr1);
	        System.out.print("Input: ");
	        printArray(arr1);

	        String arr2[] = {"dog", "cat", "elephant", "bee"};
	        sortStrings(arr2);
	        System.out.print("Input: ");
	        printArray(arr2);
	    }
	
}
