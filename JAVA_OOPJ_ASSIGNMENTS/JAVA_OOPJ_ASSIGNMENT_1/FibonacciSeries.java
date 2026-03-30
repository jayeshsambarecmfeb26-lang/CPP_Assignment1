package JAVA_OOPS_ASSIGNMENT_1;

//18. Write a program to print Fibonacci series up to N terms.

public class FibonacciSeries
{
	public static void main(String[] args) {
		
		System.out.println("FibonacciSeries from 0 to 12 ");
    int a=0,b=1;
    for(int i=1;i<=12;i++)
    {
        System.out.println(a+" ");
        int c=a+b;
        a=b;
        b=c;

    }
	}
}
