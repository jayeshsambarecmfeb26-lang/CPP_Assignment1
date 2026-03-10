//============================================================================
// Name        : SwapFunctions.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;


void swapByValue(int a, int b)
{
    int temp = a;
    a = b;
    b = temp;
}

void swapByAddress(int *a, int *b)
{
    int temp = *a;
    *a = *b;
    *b = temp;
}

void swapByReference(int &a, int &b)
{
    int temp = a;
    a = b;
    b = temp;
}

int main()
{
    int x = 10, y = 20;

    cout << "Original values: x = " << x << " y = " << y << endl;

    swapByValue(x, y);
    cout << "After swapByValue: x = " << x << " y = " << y << endl;

    swapByAddress(&x, &y);
    cout << "After swapByAddress: x = " << x << " y = " << y << endl;

    swapByReference(x, y);
    cout << "After swapByReference: x = " << x << " y = " << y << endl;

    return 0;
}
//Q.2.1 Observation
//
//swapByValue() → does NOT swap values
//
//swapByAddress() → swaps values
//
//swapByReference() → swaps values
//
//Q2.2 — Explanation
//Reference Variables as Aliases
//
//A reference variable is another name for an existing variable.

