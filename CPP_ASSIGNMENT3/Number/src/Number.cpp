//============================================================================
// Name        : Number.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Inspector;
class Number {
private:
    int value;

public:

    Number(int v = 0) {
        value = v;
    }


    friend bool operator>(Number a, Number b);


    friend class Inspector;


    Number operator++() {
        ++value;
        return *this;
    }


    Number operator++(int) {
        Number temp = *this;
        value++;
        return temp;
    }


    Number& operator=(const Number &n) {
        value = n.value;
        return *this;
    }
};

bool operator>(Number a, Number b) {
    return a.value > b.value;
}

class Inspector {
public:
    void show(Number n) {
        cout << "Value = " << n.value << endl;
    }
};

int main() {

    Number n1(10), n2(20), n3;
    Inspector obj;

    cout << "Initial Values:\n";
    obj.show(n1);
    obj.show(n2);

    cout << "\nPre-increment (++n1):\n";
    ++n1;
    obj.show(n1);


    cout << "\nPost-increment (n1++):\n";
    n1++;
    obj.show(n1);


    cout << "\nInspector reading private values:\n";
    obj.show(n1);
    obj.show(n2);


    if(n1 > n2)
        cout << "\nn1 is greater than n2\n";
    else
        cout << "\nn2 is greater than n1\n";

    n3 = n1;
    cout << "\nAfter assignment n3 = n1:\n";
    obj.show(n3);

    return 0;
}
