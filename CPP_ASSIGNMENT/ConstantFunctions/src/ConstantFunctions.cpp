//============================================================================
// Name        : ConstantFunctions.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================
#include <iostream>
#include <iomanip>
using namespace std;


const float PI = 3.14159f;


float circleArea(float radius) {
    return PI * radius * radius;
}


float circlePerimeter(float radius) {
    return 2 * PI * radius;
}

int main()
{
    float radius = 7.0f;

    cout << " * After setting the precision to 4 * \n"<<fixed << setprecision(4);

    cout << "Area of circle is: " << circleArea(radius) << setprecision(4)<< endl;

    cout << "circumference of circle is : " << circlePerimeter(radius) << endl;

  //  PI = 3.0f; // error: assignment of read-only variable 'PI'

    return 0;
}
