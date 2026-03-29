package java_OOps_Programms_2;

//19. Employee ID Generator 
//Create a class Employee: 
//Requirements: 
//● Static variable: counter 
//● Each employee gets auto-incremented ID 
//● Use constructor to assign ID 
//● Display employee details 

public class Employee 
{
	    static int counter = 0;
	    int id;
	    String name;

	    Employee(String name) {
	        counter++;
	        id = counter;
	        this.name = name;
	    }

	    void display()
	    {
	        System.out.println(id + " " + name);
	    }

	    public static void main(String[] args) 
	    {
	        Employee e1 = new Employee("Ramesh");
	        Employee e2 = new Employee("Suresh");

	        e1.display();
	        e2.display();
	    }
	

}
