//============================================================================
// Name        : Matrix.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class Matrix {
private:
    int rows, cols;
    int **data;

public:


    Matrix(int r = 0, int c = 0) {
        rows = r;
        cols = c;

        if(rows > 0 && cols > 0){
            data = new int*[rows];
            for(int i=0;i<rows;i++)
                data[i] = new int[cols];
        }
        else
            data = nullptr;
    }


    friend istream& operator>>(istream &in, Matrix &m) {
        cout << "Enter elements:\n";
        for(int i=0;i<m.rows;i++)
            for(int j=0;j<m.cols;j++)
                in >> m.data[i][j];

        return in;
    }


    friend ostream& operator<<(ostream &out, const Matrix &m) {
        for(int i=0;i<m.rows;i++){
            for(int j=0;j<m.cols;j++)
                out << m.data[i][j] << " ";
            out << endl;
        }
        return out;
    }


    Matrix operator+(const Matrix &m) {
        Matrix result(rows, cols);

        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                result.data[i][j] = data[i][j] + m.data[i][j];

        return result;
    }


    bool operator==(const Matrix &m) {
        if(rows != m.rows || cols != m.cols)
            return false;

        for(int i=0;i<rows;i++)
            for(int j=0;j<cols;j++)
                if(data[i][j] != m.data[i][j])
                    return false;

        return true;
    }


    ~Matrix() {
        for(int i=0;i<rows;i++)
            delete[] data[i];
        delete[] data;
    }
};

int main() {

    int r,c;

    cout << "Enter rows and columns: ";
    cin >> r >> c;

    Matrix m1(r,c), m2(r,c);


    cout << "Enter Matrix 1:\n";
    cin >> m1;

    cout << "Enter Matrix 2:\n";
    cin >> m2;


    Matrix m3 = m1 + m2;

    cout << "\nMatrix 1:\n" << m1;
    cout << "\nMatrix 2:\n" << m2;

    cout << "\nMatrix Addition (m1 + m2):\n";
    cout << m3;


    if(m1 == m2)
        cout << "\nMatrices are Equal\n";
    else
        cout << "\nMatrices are Not Equal\n";

    return 0;
}
