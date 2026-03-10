//============================================================================
// Name        : Divide.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;


class DivideByZero {
public:
    const char* message() const {
        return "Error: Division by Zero!";
    }
};


int divide(int a, int b) {
    if(b == 0)
        throw DivideByZero();

    return a / b;
}

int main() {

    int num1, num2;

    cout << "Enter two integers: ";
    cin >> num1 >> num2;

    try {

        try {
            int result = divide(num1, num2);
            cout << "Result = " << result << endl;
        }

        catch(DivideByZero &e) {
            cout << "Inside inner catch\n";
            cout << e.message() << endl;

            throw;
        }

    }

    catch(DivideByZero &e) {
        cout << "Handled in outer catch\n";
    }

    return 0;
}
