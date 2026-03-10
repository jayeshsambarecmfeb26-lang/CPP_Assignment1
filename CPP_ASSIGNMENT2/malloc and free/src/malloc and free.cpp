//============================================================================
// Name        : malloc.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <cstdlib>
using namespace std;

int main()
{
    int *arr;

    arr = (int*)malloc(5 * sizeof(int));

    cout << "Enter 5 integers:\n";

    for(int i=0;i<5;i++)
        cin >> arr[i];

    cout << "Values are:\n";

    for(int i=0;i<5;i++)
        cout << arr[i] << " ";

    free(arr);

    return 0;
}

//1. Why Constructors Are Not Called with malloc
//
//malloc() is a C function that only allocates raw memory.
//It does not know about C++ objects or constructors.
//
//2. Why new Is Preferred in C++
//
//new:
//
//Calls constructors
//
//Type-safe
//
//Returns correct pointer type
//
//Automatically calculates size
//
//3. Difference in Return Types
//new	                         malloc
//Returns correct pointer type | Returns void*
//No type casting needed	   | Type casting required
//
//Example:
//
//int *p = new int;
//
//vs
//
//int *p = (int*) malloc(sizeof(int));
//4. Why malloc Cannot Initialize Complex Types
//
//Complex types (classes/objects) need constructors.
//
//malloc:
//
//Only allocates raw memory
//
//Does not call constructors
//
//Therefore objects cannot be properly initialized.
