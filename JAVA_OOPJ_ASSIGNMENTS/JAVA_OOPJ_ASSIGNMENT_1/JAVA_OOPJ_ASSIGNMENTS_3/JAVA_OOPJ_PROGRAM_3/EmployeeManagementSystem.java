package JAVA_OOPJ_PROGRAM_3;

//Question 7: Design an Employee Management System 
//Requirements: 
//Each employee has: 
//● Employee ID, name 
//● Salary 
//System should: 
//● Store multiple employees 
//● Calculate salary with allowances 
//● Track total employees 
//Support: 
//● Use method overloading for salary calculation 
//Display: 
//● Employee salary details 
class Employee 
{
    int id;
    String name;
    double salary;
    static int count=0;

    Employee(int i,String n,double s)
    {
        id=i; name=n; salary=s; count++;
    }

    double calcSalary()
    { 
    	return salary; 
    }
    double calcSalary(double bonus)
    {
    	return salary+bonus;
    	}

    void display(){
        System.out.println(name+" Salary="+calcSalary(1000));
    }
}

public class EmployeeManagementSystem 
{
    public static void main(String[] args)
    {
        Employee e=new Employee(1,"Sam",3000);
        e.display();
    }
}