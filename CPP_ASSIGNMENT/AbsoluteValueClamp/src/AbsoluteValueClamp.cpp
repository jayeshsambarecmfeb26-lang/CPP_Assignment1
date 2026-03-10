//============================================================================
// Name        : AbsoluteValueClamp.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include<iostream>
using namespace std;

int absolute(int n)
{
    return (n > 0) ? n : -n;
}

int clamp(int val, int lo, int hi)
{
    return (val < lo) ? lo : (val > hi) ? hi : val;
}

int main(){
    int val[] = {-15, 0, 25, -3};
    int hi[] = {10, 10, 10, 5};
    int lo[] = {-10, -10, -10, 0};



    for(int i = 0; i < 4; i++)
    {
        cout  << "\n" << val[i] << "  " << lo[i] << "  " << hi[i] << "  " << absolute(val[i]) << "  " << clamp(val[i], lo[i], hi[i]);
    }
}
