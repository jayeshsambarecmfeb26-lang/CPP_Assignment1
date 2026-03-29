package java_OOps_Programms_2;

//14. Salary Conversion System 
//Create a program: 
//Requirements: 
//● Take the salary as double 
//● Convert it into: 
//○ int (explicit casting) 
//○ float (implicit casting) 
//● Show the precision loss clearly 

public class SalaryConversion {
	
	    public static void main(String[] args) 
	    
	    {
	        double salary = 534.45;

	        int intSalary = (int) salary; 
	        float floatSalary = (float) salary; 

	        System.out.println("Original: " + salary);
	        System.out.println("Int: " + intSalary);
	        System.out.println("Float: " + floatSalary);
	    }
	
}
