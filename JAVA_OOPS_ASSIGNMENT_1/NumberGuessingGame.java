package JAVA_OOPS_ASSIGNMENT_1;

//38. Create a number guessing game. 

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame
{

	public static void main(String[] args)
	{
	
      Scanner sc = new Scanner(System.in);
        Random rand = new Random();

	   int number = rand.nextInt(10) + 1; 
	   int guess;

      System.out.println("Guess a number between 1 and 10:");

      do {
		    System.out.print("Enter your guess: ");
            guess = sc.nextInt();

		    if(guess > number)
		    {
		         System.out.println("Too High!");
		     } 
	      else if(guess < number) 
	      {
		         System.out.println("Too Low!");
		     } 
	      else {
	           System.out.println("Correct! You guessed it");
		      }

		  } while(guess != number);
		    


	}

}
