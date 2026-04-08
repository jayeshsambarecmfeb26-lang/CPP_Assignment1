package JAVA_OOPJ_PROGRAM_3;

//Question 9: Design a Course Management System 
//Requirements: 
//Each course has: 
//● Course ID, course name 
//● Fees 
//Each student: 
//● Can enroll in courses 
//System should: 
//● Store students and courses 
//● Track enrollments 
//● Count total courses 
//Display: 
//● Student course details 

class Course 
{
    int id;
    String name;
    double fees;
    static int count=0;

    Course(int i,String n,double f)
    {
        id=i; name=n; fees=f; count++;
    }
}

class StudentC
{
    String name;
    Course course;

    StudentC(String n,Course c){
        name=n; course=c;
    }

    void display(){
        System.out.println(name+" enrolled in "+course.name);
    }
}

public class CourseManagementSystem
{
    public static void main(String[] args) 
    {
        Course c=new Course(1,"sql",6000);
        StudentC s=new StudentC("Jay",c);
        s.display();
    }
}
