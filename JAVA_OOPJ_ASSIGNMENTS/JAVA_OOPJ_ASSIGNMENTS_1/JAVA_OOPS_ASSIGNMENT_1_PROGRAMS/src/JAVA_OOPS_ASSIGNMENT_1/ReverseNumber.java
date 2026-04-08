package JAVA_OOPS_ASSIGNMENT_1;
//14. Write a program to reverse a number. 

public class ReverseNumber {

	public static void main(String[] args) 
	{
        int n=54321, rev=0;

        while(n>0)
        {
            int d=n%10;
            
            rev=rev*10+d;
            
            n=n/10;
        }

        System.out.println("Reverse: "+rev);
	}

}
