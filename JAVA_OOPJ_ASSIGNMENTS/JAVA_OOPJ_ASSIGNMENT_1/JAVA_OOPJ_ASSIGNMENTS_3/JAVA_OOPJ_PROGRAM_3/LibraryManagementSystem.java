package JAVA_OOPJ_PROGRAM_3;

//Question 6: Design a Library Management System 
//Requirements: 
//Each book has: 
//● Book ID, title, author 
//● Availability status 
//System should: 
//● Store multiple books 
//C-DAC Mumbai
//● Issue and return books 
//● Prevent issuing unavailable books 
//Support: 
//● Track total books 
//Display: 
//● Available and issued books 

class Book 
{
    int id;
    String title, author;
    boolean available=true;
    static int count=0;

    Book(int i,String t,String a)
    {
        id=i;
        title=t; 
        author=a;
        count++;
    }

    void issue()
    {
        if(available)
        { 
        	available=false; 
        }
        else 
        {
        	System.out.println("Not Available");
    }
    }
    void ret()
    {
    	available=true; 
    }

    void display()
    {
        System.out.println(title+" "+(available?"Available":"Issued"));
    }
}

public class LibraryManagementSystem 
{
    public static void main(String[] args)
    {
        Book b=new Book(1,"SQL","Author");
        b.issue();
        b.display();
    }
}