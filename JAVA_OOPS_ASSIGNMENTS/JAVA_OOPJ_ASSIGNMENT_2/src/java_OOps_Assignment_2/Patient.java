package java_OOps_Programms_2;

//8. Hospital Patient Record System 
//Create a simple patient management program. 
//Requirements 
//● Create a class Patient with: 
//○ patient ID 
//○ patient name 
//○ age 
//○ disease 
//● Create objects for at least 3 patients. 
//● Display patient details. 
//● Add a method to check whether the patient is a senior citizen (age 60 or above). 

public class Patient 
{
	    int id;
	    String name;
	    int age;
	    String disease;

	    Patient(int id, String name, int age, String disease) 
	    {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.disease = disease;
	    }

	    void display() {
	        System.out.println(id + " " + name + " " + age + " " + disease);
	    }

	    void isSenior() 
	    {
	        if (age >= 60)
	            System.out.println(name + " is a Senior Citizen");
	        else
	            System.out.println(name + " is not a Senior Citizen");
	    }

	    public static void main(String[] args) 
	    {
	        Patient p1 = new Patient(1, "ramesh", 43, "Fever");
	        Patient p2 = new Patient(2, "suresh", 46, "Heart Issue");
	        Patient p3 = new Patient(3, "harshal", 66, "Diabetes");

	        p1.display(); p1.isSenior();
	        p2.display(); p2.isSenior();
	        p3.display(); p3.isSenior();
	    }
	
}
