package JAVA_OOPS_ASSIGNMENT_1;
//24. Write a program to find largest digit in a number

public class LargestDigit {

	public static void main(String[] args) 
	{

        int num=592, max=0;
        while(num>0)
        {
            int d=num%10;
            if(d>max) 
            	
            	max=d;
            
            num=num/10;
        }
        
        System.out.println("Largest digit is:"+max);

	}

}
