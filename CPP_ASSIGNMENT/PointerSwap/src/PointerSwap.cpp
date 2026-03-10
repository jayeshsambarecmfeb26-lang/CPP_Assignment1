//============================================================================
// Name        : PointerSwap.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

int main()
{

    int x = 10, y = 20, z = 30;


    int *px = &x;
    int *py = &y;
    int *pz = &z;

    cout << "Before swapping:" << endl;
    cout << "*px = " << *px << endl;
    cout << "*py = " << *py << endl;
    cout << "*pz = " << *pz << endl;

    cout << "Address of pointers:" << endl;
    cout << "px = " << px << endl;
    cout << "py = " << py << endl;
    cout << "pz = " << pz << endl;

    int temp = *px;
    *px = *pz;
    *pz = temp;

    // Print after swap
    cout << " After Swapiing:" << endl;
    cout << "*px = " << *px << endl;
    cout << "*py = " << *py << endl;
    cout << "*pz = " << *pz << endl;

    cout << "Addresses of pointers Afte Swapping" << endl;
    cout << "px = " << px << endl;
    cout << "py = " << py << endl;
    cout << "pz = " << pz << endl;

    return 0;
}

