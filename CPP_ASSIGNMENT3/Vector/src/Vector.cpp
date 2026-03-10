//============================================================================
// Name        : Vector.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Vector {
private:
    int *arr;
    int size;

public:

    // Constructor
    Vector(int s) {
        size = s;
        arr = new int[size];
    }

    // Function to initialize elements
    void setValues() {
        cout << "Enter " << size << " elements:\n";
        for(int i = 0; i < size; i++)
            cin >> arr[i];
    }

    // Overload [] operator
    int& operator[](int index) {
        return arr[index];
    }

    // Overload () operator to compute sum
    int operator()() {
        int sum = 0;
        for(int i = 0; i < size; i++)
            sum += arr[i];
        return sum;
    }

    // Display function
    void display() {
        for(int i = 0; i < size; i++)
            cout << arr[i] << " ";
        cout << endl;
    }

    // Destructor
    ~Vector() {
        delete[] arr;
    }
};

int main() {

    Vector v(5);

    v.setValues();

    cout << "Original Vector: ";
    v.display();

    // Task 3
    v[2] = 50;

    cout << "After v[2] = 50: ";
    v.display();

    // Task 4
    cout << "Sum of elements: " << v() << endl;

    return 0;
}
