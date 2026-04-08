package java_OOps_Programms_2;

//9. Daily Expense Tracker 
//Create a program to track a person’s daily expenses. 
//Requirements 
//● Accept expenses for 7 days in an array. 
//● Calculate: 
//○ total weekly expense 
//○ average expense 
//○ highest expense 
//○ lowest expense 
//● Display the day on which the highest expense occurred. 

import java.util.Scanner;

public class DailyExpenseTracker 
{
	
	    public static void main(String[] args)
	    {
	        Scanner sc = new Scanner(System.in);
	        int[] exp = new int[7];
	        int total = 0;

	        for (int i = 0; i < 7; i++) 
	        {
	            System.out.print("Enter expense for Day " + (i+1) + ": ");
	            exp[i] = sc.nextInt();
	            total += exp[i];
	        }

	        int max = exp[0], min = exp[0], day = 1;

	        for (int i = 1; i < 7; i++)
	        {
	            if (exp[i] > max) {
	                max = exp[i];
	                day = i + 1;
	            }
	            if (exp[i] < min)
	                min = exp[i];
	        }

	        System.out.println("Total = " + total);
	        System.out.println("Average = " + (total / 7.0));
	        System.out.println("Highest = " + max + " on Day " + day);
	        System.out.println("Lowest = " + min);
	    }
	

}
