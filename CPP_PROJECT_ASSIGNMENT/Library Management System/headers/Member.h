#ifndef MEMBER_H
#define MEMBER_H

#include "Person.h"

namespace LibrarySystem {

class Member : public Person {
private:
    int booksIssued;
    int* issuedBookIds;

public:
    Member();
    Member(int,std::string,std::string);
    Member(const Member&);

    ~Member();

    void displayInfo() const override;

    Member& operator=(const Member&);
    bool operator==(const Member&);

};

}

#endif
