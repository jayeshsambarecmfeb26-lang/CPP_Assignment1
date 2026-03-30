package JAVA_OOPS_ASSIGNMENT_1;

//35. Find GCD of two numbers. 

public class GCD {

	public static void main(String[] args)
	{
        int a=5,b=15;
        while(b!=0)
        {
            int t=b;
            b=a%b;
            a=t;
        }
        System.out.println("GCD ="+a);
	}

}
