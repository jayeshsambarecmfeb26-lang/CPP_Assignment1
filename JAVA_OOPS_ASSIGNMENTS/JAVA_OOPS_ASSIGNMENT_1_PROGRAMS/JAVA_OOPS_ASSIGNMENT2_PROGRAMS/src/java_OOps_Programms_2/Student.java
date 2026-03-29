package java_OOps_Programms_2;

//Create a class Student: 
//Requirements: 
//● Instance variables: name, rollNo 
//● Static variable: totalStudents 
//● Increment totalStudents every time object is created 
//● Display total number of students 
//Bonus: Add a static method to display count 


public class Student 
{
	    String name;
	    int rollNo;
	    static int totalStudents = 0;

	    Student(String name, int rollNo) {
	        this.name = name;
	        this.rollNo = rollNo;
	        totalStudents++;
	    }

	    static void displayCount()
	    {
	        System.out.println("Total Students: " + totalStudents);
	    }

	    public static void main(String[] args) 
	    {
	        Student a=new Student("A", 1);
	        Student b=new Student("B", 2);
	        Student c=new Student("C", 3);

	        displayCount();
	    
	}
}
