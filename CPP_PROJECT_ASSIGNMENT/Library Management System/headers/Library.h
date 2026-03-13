#ifndef LIBRARY_H
#define LIBRARY_H

#include "Book.h"
#include "Member.h"
#include "Container.h"

#include <vector>
#include <map>

namespace LibrarySystem {

class Library {

private:

    Container<Book> books;
    Container<Member> members;

public:

    void addBook();
    void displayBooks();

};

}

#endif
