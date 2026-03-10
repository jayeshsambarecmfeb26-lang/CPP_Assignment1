//============================================================================
// Name        : Pointer.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main()
{
    int num = 10;

    int *ptr = &num;
    int &ref = num;

    cout << "Initial value: " << num << endl;


    *ptr = 20;
    cout << "After modifying with pointer: " << num << endl;


    ref = 30;
    cout << "After modifying with reference: " << num << endl;

    return 0;
}

//Initial value: 10
//After modifying with pointer: 20
//After modifying with reference: 30
//Q3.2 — Explanation
//1. Two Differences Between Pointer and Reference
//Pointer	Reference
//Stores memory address	Acts as alias for a variable
//Can be reassigned	Cannot be reassigned
//Can be NULL	Cannot be NULL
//Uses * operator	Uses & symbol
//2. Why References Cannot Be Reseated
//
//A reference must always refer to the same variable after initialization.
//
//Example:
//
//int a = 10;
//int b = 20;
//
//int &ref = a;
//ref = b;   // assigns value of b to a
//
//It does not change the reference, it only copies the value.
//
//3. Why References Cannot Be NULL
//
//References must always refer to valid memory.
//
//Allowing NULL references would cause undefined behavior, so C++ does not allow them.
//
//Pointers can be:
//
//int *p = NULL;
