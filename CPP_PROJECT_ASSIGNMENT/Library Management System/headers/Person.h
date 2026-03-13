#ifndef PERSON_H
#define PERSON_H

#include <iostream>
#include <string>

namespace LibrarySystem {

class Person {
protected:
    int id;
    std::string name;
    std::string phone;

public:
    Person(int id=0,std::string name="",std::string phone=""){
        this->id=id;
        this->name=name;
        this->phone=phone;
    }

    virtual void displayInfo() const = 0;

    virtual ~Person(){}
};

}

#endif
