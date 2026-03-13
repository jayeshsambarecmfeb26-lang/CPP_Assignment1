#include "../headers/Librarian.h"
#include <iostream>

using namespace LibrarySystem;

Librarian::Librarian(int id,std::string name,std::string phone,int emp,double sal)
:Person(id,name,phone){

    employeeId=emp;
    salary=sal;
}

void Librarian::displayInfo() const{

    std::cout<<"Librarian ID: "<<employeeId<<std::endl;
    std::cout<<"Name: "<<name<<std::endl;
}
