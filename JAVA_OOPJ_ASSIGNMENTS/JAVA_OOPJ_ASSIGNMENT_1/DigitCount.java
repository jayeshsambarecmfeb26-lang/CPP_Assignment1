package JAVA_OOPS_ASSIGNMENT_1;

//15. Write a program to count digits in a number. 

public class DigitCount {

	public static void main(String[] args) 
	{

        int n=54321,  count=0;

        while(n>0)
        {
            count++;
            n=n/10;
        }

        System.out.println("Digits: "+count);//5
	}

}
