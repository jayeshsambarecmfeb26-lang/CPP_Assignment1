#include "../headers/Member.h"
#include <iostream>

using namespace LibrarySystem;

Member::Member():Person(){
    booksIssued=0;
    issuedBookIds=nullptr;
}

Member::Member(int id,std::string name,std::string phone)
:Person(id,name,phone){
    booksIssued=0;
    issuedBookIds=nullptr;
}

Member::Member(const Member& m):Person(m.id,m.name,m.phone){
    booksIssued=m.booksIssued;

    if(booksIssued>0){
        issuedBookIds=new int[booksIssued];
        for(int i=0;i<booksIssued;i++)
            issuedBookIds[i]=m.issuedBookIds[i];
    }
}

Member::~Member(){
    delete[] issuedBookIds;
}

Member& Member::operator=(const Member& m){

    if(this!=&m){
        id=m.id;
        name=m.name;
        phone=m.phone;
    }

    return *this;
}

bool Member::operator==(const Member& m){
    return id==m.id;
}

void Member::displayInfo() const{
    std::cout<<"Member ID: "<<id<<std::endl;
    std::cout<<"Name: "<<name<<std::endl;
    std::cout<<"Phone: "<<phone<<std::endl;
}
