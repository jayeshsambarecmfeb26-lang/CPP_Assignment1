#ifndef LIBRARIAN_H
#define LIBRARIAN_H

#include "Person.h"

namespace LibrarySystem {

class Librarian : public Person {

private:
    int employeeId;
    double salary;

public:
    Librarian(int id,std::string name,std::string phone,int emp,double sal);

    void displayInfo() const override;

};

}

#endif
