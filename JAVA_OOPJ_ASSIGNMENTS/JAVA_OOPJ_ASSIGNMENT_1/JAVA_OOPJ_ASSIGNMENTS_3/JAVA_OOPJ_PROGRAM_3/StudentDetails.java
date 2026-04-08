package JAVA_OOPJ_PROGRAM_3;

//Question 1: Design a College ERP (Student Module) 
//Requirements: 
//● Each student has: 
//○ Roll number, name 
//○ Marks in multiple subjects 
//○ Contact details (phone, email) 
//● System should: 
//○ Store multiple students 
//○ Calculate total & average marks 
//○ Track total students admitted 
//● Support: 
//○ Flexible average calculation 
//● Display formatted student report 

	import java.util.*;

	class Student 
	{
	     int rollNumber;
	     String name;
	     double[] marks;
	     String phone;
	     String email;

	    
	    public Student(int rollNumber, String name, double[] marks, String phone, String email) 
	    {
	        this.rollNumber = rollNumber;
	        this.name = name;
	        this.marks = marks;
	        this.phone = phone;
	        this.email = email;
	    }

	    public double calculateTotal()
	    {
	        double total = 0;
	        for (double m : marks) 
	        {
	            total += m;
	        }
	        return total;
	    }

	    public double calculateAverage() 
	    {
	        if (marks.length == 0) 
	        	{
	        	return 0;
	        	}
	        return calculateTotal() / marks.length;
	    }

	    public void displayReport() 
	    {
	        System.out.println(" Student Report ");
	        System.out.println("Roll No: " + rollNumber);
	        System.out.println("Name: " + name);

	        System.out.print("Marks: ");
	        for (double m : marks) {
	            System.out.print(m + " ");
	        }

	        System.out.println(" Total: " + calculateTotal());
	        System.out.println("Average: " + calculateAverage());

	        System.out.println("Phone: " + phone);
	        System.out.println("Email: " + email);
	    }
	}

	class CollegeERP
	{
	    ArrayList<Student> students = new ArrayList<>();
	     static int totalStudents = 0;

	    
	    public void addStudent(Student s) 
	    {
	        students.add(s);
	        totalStudents++;
	    }

	
	    public void displayAllStudents() 
	    {
	        for (Student s : students) {
	            s.displayReport();
	        }
	        System.out.println("Total Students Admitted: " + totalStudents);
	    }
	}

	public class StudentDetails
	
	{
	    public static void main(String[] args) 
	    {
	        Scanner sc = new Scanner(System.in);
	        CollegeERP erp = new CollegeERP();

	        System.out.print(" Enter number of students  ");
	        int n = sc.nextInt();

	        for (int i = 0; i < n; i++) 
	        {
	            System.out.println("Enter student details " + (i + 1));

	            System.out.print("Roll Number: ");
	            int roll = sc.nextInt();
	            sc.nextLine(); 

	            System.out.print("Name: ");
	            String name = sc.nextLine();

	            System.out.print("Number of subjects: ");
	            int subj = sc.nextInt();

	            double[] marks = new double[subj];
	            
	            for (int j = 0; j < subj ; j++) 
	            {
	                System.out.print("Enter marks for subject " + (j + 1) + ": ");
	                marks[j] = sc.nextDouble();
	            }

	            sc.nextLine(); 

	            System.out.print("Phone: ");
	            String phone = sc.nextLine();

	            System.out.print("Email: ");
	            String email = sc.nextLine();

	            Student s = new Student(roll, name, marks, phone, email);
	            
	            erp.addStudent(s);
	        }

	   
	        erp.displayAllStudents();

	     
	    }
	
}

	
