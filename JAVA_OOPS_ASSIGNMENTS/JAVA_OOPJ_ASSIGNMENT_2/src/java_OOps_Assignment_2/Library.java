package java_OOps_Programms_2;

//20. Library System 
//Create two classes: 
//Class 1: Book 
//● bookId, bookName 
//Class 2: Library 
//● Method to display books 
//Requirements: 
//● Create multiple books 
//● Pass objects to library 
//● Display all books 


class Book 
{
    int id;
    String name;

    Book(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
}

public class Library
{
    void display(Book[] books) 
    {
        for (Book b : books)
        {
            System.out.println(b.id + " " + b.name);
        }
    }

    public static void main(String[] args)
    {
        Book[] books =
        	{
            new Book(1, "C"),
            new Book(2, "C++"),
            new Book(3, "Java")
        };

        Library lib = new Library();
        
        lib.display(books);
    }


}
