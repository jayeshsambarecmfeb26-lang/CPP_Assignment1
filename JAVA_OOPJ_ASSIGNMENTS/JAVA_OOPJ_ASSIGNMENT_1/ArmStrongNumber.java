package JAVA_OOPS_ASSIGNMENT_1;
//26. Write a program to check whether a number is Armstrong.
public class ArmStrongNumber {

	public static void main(String[] args) 
	{
		{       
		       int n=153;
			  int temp=n;
			  int sum=0;
			  int count=0;//3
			  int arm=1;
			  while(n!=0)
			  {
				  count++;
				  n=n/10; 
			  }
			  n=temp;
			  while(n!=0)//to separate digit
			  {
				int d=n%10;//3
				arm=1;
				for(int i=1;i<=count;i++)
				{
					arm=arm*d;
				}
				sum=sum+arm;
				n=n/10;//to access remaining digits
			  }
			  if(temp==sum)//we cant use n here because n is zero
			  {
				 System.out.println(temp+" " + "IS A ARMSTRONG NUMBER");
			  }
			  else 
			  {
				  System.out.println(temp+" " + "IS NOT A ARMSTRONG NUMBER");
		
			  }
			
			
		}
	}

}
