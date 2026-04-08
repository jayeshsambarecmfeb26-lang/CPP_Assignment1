package JAVA_OOPS_ASSIGNMENT_1;

//34. Print all prime numbers between 1 to 100. 

public class PrimeNumbers
{

	public static void main(String[] args) 
	{
	 
		for(int n=1;n<=100;n++)
		{
			int count=0;  
			for(int i=1;i<=n;i++)
			{
				if(n%i==0)
				{
					count++;
				}
			}
			if(count==2)
			{
			System.out.println(n);
		    }
	
}

	}

}
