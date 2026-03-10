//============================================================================
// Name        : Student.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Student
{
    int rollNo;
    string name;
    float marks;

public:


    Student()
    {
        rollNo = 0;
        name = "Unknown";
        marks = 0;
    }

    Student(int r, string n, float m)
    {
        rollNo = r;
        name = n;
        marks = m;
    }

    void display()
    {
        cout << "Roll No: " << rollNo << endl;
        cout << "Name: " << name << endl;
        cout << "Marks: " << marks << endl;
        cout << endl;
    }
};

int main()
{
    Student s1;

    Student s2(1,"Rahul",85);


    s1.display();
    s2.display();


    return 0;
}

//When does compiler generate default constructor?
//
//If no constructor is defined in the class, the compiler automatically generates a default constructor.
//
//When does it NOT generate one?
//
//If any constructor is already defined, the compiler does not generate a default constructor.
//
//Example:
//
//Student(int r);
//
//Now default constructor is not created automatically.
//
//Can constructors be overloaded?
//
//Yes.
//
//Example:
//
//Student();
//Student(int r);
//Student(int r, string n);
//
//This is called constructor overloading.
