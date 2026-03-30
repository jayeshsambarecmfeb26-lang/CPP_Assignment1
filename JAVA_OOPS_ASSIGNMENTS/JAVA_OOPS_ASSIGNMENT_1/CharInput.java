package JAVA_OOPS_ASSIGNMENT_1;

//5. Take a character input and print: 
//○ Next character 
//○ Previous character

public class CharInput 
{

	
    public static void main(String[] args)
	 {
	        char ch = 'A';

	         int num=(int) ch;
	          
	          char next=(char)(ch + 1);

	           char prev=(char)(ch - 1);

	        System.out.println("ASCII value of char is " + num);

	        System.out.println("Next  char is " + next);

	        System.out.println("Previous char is " + prev);	
	
}

}

//ASCII value of char is 65
//Next  char is B
//Previous char is @
