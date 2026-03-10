//============================================================================
// Name        : Employee.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstring>
using namespace std;

class Employee {
private:
    int id;
    char* name;
    mutable int accessCount;

public:


    Employee(int i, const char* n) {
        id = i;
        name = new char[strlen(n) + 1];
        strcpy(name, n);
        accessCount = 0;
    }

    Employee(const Employee& e) {
        id = e.id;

        name = new char[strlen(e.name) + 1];
        strcpy(name, e.name);

        accessCount = e.accessCount;

        cout << "User-defined Copy Constructor Called (Deep Copy)\n";
    }


    ~Employee() {
        delete[] name;
    }


    void display() const {
        accessCount++;

        cout << "ID: " << id << endl;
        cout << "Name: " << name << endl;
        cout << "Access Count: " << accessCount << endl;
        cout << "Memory Address of name: " << (void*)name << endl;
        cout << endl;
    }
};

int main() {

    Employee e1(101, "Rahul");

    e1.display();
    e1.display();
    e1.display();


    Employee e2 = e1;

    cout << "\nDisplaying e2\n";
    e2.display();

    return 0;
}
//display() should not modify logical state of object.
//
//So we declare:
//
//void display() const
//
//This guarantees:
//
//It will not change object data
//
//Can be called on const objects
//
//Example:
//
//const Employee e1(101,"Rahul");
//e1.display();
//7. Why accessCount must be mutable
//
//display() is const, but we still want to count how many times it is called.
//
//Normally const functions cannot modify variables.
//
//Solution:
//
//mutable int accessCount;
//
//Meaning:
//
//This variable can change even inside const functions
//
//Example:
//
//void display() const {
//    accessCount++;  // allowed because mutable
//}
//8. Task Demonstration
//Step 1
//Employee e1(101,"Rahul");
//
//e1.display();
//e1.display();
//
//Output:
//
//Access Count: 1
//Access Count: 2
//Step 2
//Employee e2 = e1;
//
//If default constructor used → shallow copy
//
//If our constructor used → deep copy
//
//Proof:
//
//Memory Address of name:
//e1 → 0x61ff08
//e2 → 0x61ff40
//
//Different → Deep Copy
