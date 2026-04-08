package JAVA_OOPS_ASSIGNMENT_1;

//22. Write a program to check whether a number is prime.

public class PrimeNumber {

	public static void main(String[] args) {


	    int n=17;
	     int count=0;
	     for(int i=1;i<=n;i++)
	     {
	    	 if(n%i==0) //n is complately divisible using modulus
	    	 {
	    		 count++;// to count divisible no
	    	 }
	     }
	     if(count==2)//prime no have only 2 factors by 1,itself
	     {
	    	 System.out.println(n+"is prime");
	     }
	     else
	     {
	    	 System.out.println(n+ "is not prime");
	     }
		   
	}

}
