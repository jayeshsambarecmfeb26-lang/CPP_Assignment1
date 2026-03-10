//============================================================================
// Name        : Employee.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Employee
{
    const int employeeId;
    string name;
    float salary;

public:

    Employee(int id, string n, float s) : employeeId(id), name(n), salary(s)
    {
    }

    void display()
    {
        cout << "Employee ID: " << employeeId << endl;
        cout << "Name: " << name << endl;
        cout << "Salary: " << salary << endl;
    }
};

int main()
{
    Employee e1(101,"Amit",50000);

    e1.display();

    return 0;
}
//1. Why must const members be initialized in initializer list?
//
//const variables must be initialized at the time of object creation.
//
//They cannot be assigned later.
//
//Example:
//
//const int id;
//
//Must be initialized like:
//
//Employee() : id(10) {}
//2. What happens if you assign const value inside constructor body?
//
//Example:
//
//Employee()
//{
//    employeeId = 10;
//}
//
//This will cause a compiler error because const cannot be modified after initialization.
//
//3. Why initializer list is faster?
//
//Initializer list:
//
//Initializes variables directly
//
//Assignment in constructor:
//
//First default initialization
//
//Then assignment
//
//So initializer list avoids extra operation.
