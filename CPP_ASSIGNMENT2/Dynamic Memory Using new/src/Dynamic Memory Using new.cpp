//============================================================================
// Name        : Dynamic.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main()
{
    int *arr = new int[5];

    cout << "Enter 5 integers:\n";

    for(int i=0;i<5;i++)
        cin >> arr[i];

    cout << "Values are:\n";

    for(int i=0;i<5;i++)
        cout << arr[i] << " ";

    delete[] arr;

    return 0;
}
