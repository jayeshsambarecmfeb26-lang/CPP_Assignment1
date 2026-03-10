//============================================================================
// Name        : ClassBox.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
#include <iostream>
using namespace std;

class Box
{
private:
    int length;
    int width;
    int height;

public:


    Box(int l, int w, int h)
    {
        length = l;
        width = w;
        height = h;
    }

    void setDimensions(int length, int width, int height)
    {
        this->length = length;
        this->width = width;
        this->height = height;
    }

    int volume()
    {
        return length * width * height;
    }
};

int main()
{

    Box b1(2, 3, 4);

    cout << "Volume using constructor initialization: "
         << b1.volume() << endl;


    b1.setDimensions(5, 6, 7);

    cout << "Volume after using setDimensions(): "
         << b1.volume() << endl;

    return 0;
}

//Volume using constructor initialization: 24
//Volume after using setDimensions(): 210
//What the program demonstrates
//
//Parameterized constructor initializes the box.
//
//setDimensions() uses this-> to distinguish between parameters and class members.
//
//volume() calculates length × width × height.
//
//Q1.2 — Theory Answers
//1. Why must initialization happen before assignment?
//
//Initialization must happen first because a variable must be created and given memory before it can be assigned a value.
//
//Example:
//
//int x = 10;   // initialization
//x = 20;       // assignment
//
//Steps:
//
//Memory is allocated.
//
//Value is stored.
//
//Without initialization, assignment may operate on undefined data.
//
//2. When is initialization preferred over assignment?
//
//Initialization is preferred in the following cases:
//
//1. For const variables
//
//They must be initialized at the time of declaration.
//
//Example:
//
//const int a = 10;
//2. For reference variables
//int x = 5;
//int &ref = x;
//
//References must be initialized when declared.
//
//3. For class objects
//
//Using constructor initialization is more efficient than assigning values later.
//
//Example:
//
//Box b(2,3,4);  // initialization
//
//Instead of:
//
//Box b;
//b.setDimensions(2,3,4);  // assignment
//
//Initialization avoids extra steps and improves performance.
