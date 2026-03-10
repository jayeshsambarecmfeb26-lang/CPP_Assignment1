//============================================================================
// Name        : StudentCalculateGrade.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Student {
private:
    string name;
    int rollNumber;
    float marks;
    char grade;

public:
    void setName(string n) {
        name = n;
    }

    void setRollNumber(int r) {
        rollNumber = r;
    }

    void setMarks(float m) {
        marks = m;
    }

    void setGrade(char g) {
        grade = g;
    }


    string getName() {
        return name;
    }

    int getRollNumber() {
        return rollNumber;
    }

    float getMarks() {
        return marks;
    }

    char getGrade() {
        return grade;
    }


    void calculateGrade() {
        if (marks >= 90 && marks <= 100)
            grade = 'A';
        else if (marks >= 80)
            grade = 'B';
        else if (marks >= 70)
            grade = 'C';
        else if (marks >= 60)
            grade = 'D';
        else
            grade = 'F';

        cout << "Grade Calculated Successfully!\n";
    }


    void display() {
        cout << "\n--- Student Information ---\n";
        cout << "Name: " << name << endl;
        cout << "Roll Number: " << rollNumber << endl;
        cout << "Marks: " << marks << endl;
        cout << "Grade: " << grade << endl;
    }
};

int main() {
    Student s;
    int choice;
    string name;
    int roll;
    float marks;

    do {
        cout << "\n===== MENU =====\n";
        cout << "1. Accept Information\n";
        cout << "2. Display Information\n";
        cout << "3. Calculate Grade\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice) {
            case 1:
                cout << "Enter Name: ";
                cin >> name;
                cout << "Enter Roll Number: ";
                cin >> roll;
                cout << "Enter Marks: ";
                cin >> marks;

                s.setName(name);
                s.setRollNumber(roll);
                s.setMarks(marks);
                break;

            case 2:
                s.display();
                break;

            case 3:
                s.calculateGrade();
                break;

            case 4:
                cout << "Exiting Program...\n";
                break;

            default:
                cout << "Invalid Choice! Try Again.\n";
        }

    } while(choice != 4);

    return 0;
}
