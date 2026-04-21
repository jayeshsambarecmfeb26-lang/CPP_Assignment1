package JAVA_DSA_ASSIGNMENT_2;
//Q4.Optimized Bubble Sort 
//Problem Description: 
//Modify the Bubble Sort algorithm to improve its efficiency by stopping early if the array is 
//already sorted. 
//Requirements: 
// If no swaps happen in a pass, terminate early.

import java.util.*;
public class OptBubbleSort
{

    public static void bubbleSort(int[] arr)
    {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false; 

            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

         
            if (!swapped) {
                break;
            }
        }
    }

    public static void main(String[] args) 
    {
        int[] arr = {1, 2, 3, 4, 5}; 

        bubbleSort(arr);

        System.out.println(Arrays.toString(arr));
    }
}