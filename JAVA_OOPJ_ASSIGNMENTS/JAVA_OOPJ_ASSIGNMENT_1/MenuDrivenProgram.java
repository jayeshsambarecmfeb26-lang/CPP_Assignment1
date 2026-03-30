package JAVA_OOPS_ASSIGNMENT_1;
//29. Create a menu-driven program: 
//1. Add 
//2. Subtract 
//3. Exit 
public class MenuDrivenProgram {

	public static void main(String[] args) 
	{
		int a,b;
		a=20;
		b=10;
	     int choice=2;
	        switch(choice)
	        {
	            case 1:
	            	System.out.println("Add "+(a+b));
	            	break;
	            
	            case 2: 
	            	System.out.println("Sub "+(a-b)); 
	            	break;
	            
	            case 3: 
	            	System.exit(0);
	        }
	}

}
