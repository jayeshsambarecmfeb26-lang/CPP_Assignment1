package JAVA_OOPS_ASSIGNMENT_1;
//9. Create a simple calculator using switch: 
//○ Input: two numbers + operator 
//○ Perform: +, -, *, / 

public class SwitchCalculator
{

	public static void main(String[] args) 
	{
		
        int a=20,b=30;
        
        char operator = '+';

        switch(operator)
        {
            case '+': 
            	System.out.println(a+b); 
            	break;
            case '-':
            	System.out.println(a-b); 
            	break;
            case '*': 
            	System.out.println(a*b);
            	break;
            case '/':
            	System.out.println(a/b); 
            	break;
        }



	}

}
//50