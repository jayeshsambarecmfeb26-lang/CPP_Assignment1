package JAVA_OOPS_ASSIGNMENT_1;

//30. Take a number and print its table until user stops (use loop)

import java.util.Scanner;

public class UseLoop 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		
		        char choice;

		        do {
		            System.out.print("Enter a number: ");
		            int num = sc.nextInt();

		          
		            for(int i = 1; i <= 10; i++) 
		            {
		                System.out.println(num + " x " + i + " = " + (num * i));
		            }

		            System.out.print("Do you want to continue? (y/n): ");
		            choice = sc.next().charAt(0);

		        } while(choice == 'y' || choice == 'Y');

		        System.out.print("Program is Ended ");
		    }
		
	}


