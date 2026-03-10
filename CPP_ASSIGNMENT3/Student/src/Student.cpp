//============================================================================
// Name        : Student.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include <fstream>
using namespace std;

class Student {
private:
    int roll;
    string name;
    float marks;

public:
    Student(int r, string n, float m) {
        roll = r;
        name = n;
        marks = m;
        cout << "Creating student " << name << endl;
    }


    void writeToFile(ofstream &out) {
        out << roll << " " << name << " " << marks << endl;
    }


    ~Student() {
        cout << "Destroying student " << name << endl;
    }
};

int main() {


    Student s[3] = {
        Student(1,"Amit",85),
        Student(2,"Neha",90),
        Student(3,"Rahul",78)
    };


    ofstream fout("students.txt");

    for(int i=0;i<3;i++)
        s[i].writeToFile(fout);

    fout.close();

    cout << "\nData written to file.\n";


    ifstream fin("students.txt");

    int roll;
    string name;
    float marks;

    cout << "\nReading file contents:\n";

    while(fin >> roll >> name >> marks){
        cout << "Roll: " << roll
             << " Name: " << name
             << " Marks: " << marks << endl;
    }

    fin.close();

    return 0;
}
