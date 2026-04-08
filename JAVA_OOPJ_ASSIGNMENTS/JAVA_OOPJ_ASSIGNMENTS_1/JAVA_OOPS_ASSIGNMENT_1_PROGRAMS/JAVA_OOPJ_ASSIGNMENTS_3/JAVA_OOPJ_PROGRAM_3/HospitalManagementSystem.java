package JAVA_OOPJ_PROGRAM_3;

//Question 4: Design a Hospital Management System 
//Requirements: 
//Each patient has: 
//● Patient ID, name, age 
//● Disease 
//● Contact details 
//System should: 
//● Store multiple patients 
//● Identify senior citizens (age ≥ 60) 
//● Count total patients 
//Support: 
//● Use object composition (Patient → ContactDetails)
//Display: 
//● Patient details with status 

	class Patient 
	{
	    int id, age;
	    String name, disease;
	    Contact contact;
	    static int count = 0;

	    Patient(int i, String n, int a, String d, Contact c) 
	    {
	        id=i; name=n; age=a; disease=d; contact=c;
	        count++;
	    }

	    void display() 
	    {
	        System.out.println(name + " Age="+ age + (age>=60 ?  " Senior":""));
	    }
	}
	class Contact {
	    String phone, email;
	    Contact(String p, String e)
	    {
	    	phone = p; 
	    	email = e;
	    	}
	}
	public class HospitalManagementSystem 
	{
	    public static void main(String[] args) 
	    {
	        Patient p = new Patient(1,"Suresh",61,"dengue",new Contact("7890","s@gmail.com"));
	        p.display();
	    }
	

}
