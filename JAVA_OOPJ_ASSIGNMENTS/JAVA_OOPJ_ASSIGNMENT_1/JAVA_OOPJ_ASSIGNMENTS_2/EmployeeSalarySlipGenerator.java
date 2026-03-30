package java_OOps_Programms_2;

//5. Employee Salary Slip Generator 
//Create a Java program to generate salary slips for employees. 
//Requirements 
//C-DAC Mumbai
//● Accept employee name, ID, basic salary. 
//● Calculate: 
//○ HRA = 20% of basic salary 
//○ DA = 10% of basic salary 
//○ PF = 8% of basic salary 
//● Calculate net salary. 
//● Display a formatted salary slip. 

import java.util.Scanner;

public class EmployeeSalarySlipGenerator 
{
	

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Employee Name: ");
	        String name = sc.nextLine();

	        System.out.print("Enter Employee ID: ");
	        int id = sc.nextInt();

	        System.out.print("Enter Basic Salary: ");
	        double basic = sc.nextDouble();

	        double hra = basic * 0.20;
	        double da = basic * 0.10;
	        double pf = basic * 0.08;

	        double netSalary = basic + hra + da - pf;

	        System.out.println("\n----- SALARY SLIP -----");
	        System.out.println("Name: " + name);
	        System.out.println("ID: " + id);
	        System.out.println("Basic: " + basic);
	        System.out.println("HRA: " + hra);
	        System.out.println("DA: " + da);
	        System.out.println("PF: " + pf);
	        System.out.println("Net Salary: " + netSalary);
	    }
	

}
