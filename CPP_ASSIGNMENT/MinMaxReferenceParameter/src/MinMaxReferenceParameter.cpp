//============================================================================
// Name        : MinMaxReferenceParameter.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

void findMinMax(int a, int b, int c, int &min, int &max);

int main()
{
    int a = 60, b = 50, c = 40;
    int lo, hi;

    findMinMax(a, b, c, lo, hi);

    cout << "Given Numbers are : " << a << ", " << b << ", " << c << endl;
    cout << "Minimum number is: " << lo << endl;
    cout << "Maximum number is: " << hi << endl;

    return 0;
}

void findMinMax(int a, int b, int c, int &min, int &max)
{
    min= a;
    max= a;

    if (b < min)
        min = b;
    else
        max = b;

    if (c < min)
        min = c;
    else
        max = c;
}
