package JAVA_OOPS_ASSIGNMENT_1;
//23. Write a program to find sum of even and odd numbers separately (1 to N). 

public class EvenAndOddSum {

	public static void main(String[] args)
	{
	int evenSum=0;
	int oddSum=0;
	
		for(int i=1;i<=10;i++)
		{
			if(i%2==0)
			{
				evenSum+=i;
			}
			else if (i%2 != 0)
			{
				oddSum+=i;
			}
		}
		 System.out.println("even sum is "+evenSum);
		 System.out.println("odd sum is "+oddSum);
	}

}
