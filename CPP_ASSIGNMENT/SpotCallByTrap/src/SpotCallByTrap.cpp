//============================================================================
// Name        : SpotCallByTrap.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

//#include <stdio.h>

//void doubleIt(int n)
//{
//    n = n * 2;
//printf("Inside doubleIt: %d\n", n);
//}
//int main() {
//int num = 7;
//    doubleIt(num);
//printf("In main after call: %d\n", num);
//return 0;
//}
//Q.1 first Output
//Inside doubleIt: 14
//In main after call: 7

//Q.2 fix the function using call by reference so the num in main() is actually doubled.
#include <iostream>
using namespace std;

void doubleIt(int &n) {   // Reference parameter
    n = n * 2;
    cout << "Inside doubleIt: " << n << endl;
}

int main() {
    int num = 7;
    doubleIt(num);
    cout << "In main after call: " << num << endl;
    return 0;
}
//Q.3 Display the output
//Inside doubleIt: 14
//In main after call: 14
