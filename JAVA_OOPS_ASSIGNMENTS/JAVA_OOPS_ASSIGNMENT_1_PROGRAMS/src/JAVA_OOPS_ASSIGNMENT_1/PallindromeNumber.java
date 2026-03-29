package JAVA_OOPS_ASSIGNMENT_1;

//16. Write a program to check whether a number is palindrome. 

public class PallindromeNumber {

	public static void main(String[] args) 
	{
       
        int n=121, rev=0, temp=n;

        while(n>0)
        {
            int d=n%10;
            rev=rev*10+d;
        
            n=n/10;
        }

        System.out.println(temp==rev?"Palindrome":"Not");

	}

}
