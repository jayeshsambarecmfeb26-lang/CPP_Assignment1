#ifndef BOOK_H
#define BOOK_H

#include <iostream>
#include <string>

namespace LibrarySystem {

enum class BookStatus { AVAILABLE, ISSUED };

class Book {

private:
    int bookId;
    std::string title;
    std::string author;
    std::string isbn;
    BookStatus status;
    int quantity;
    int availableCopies;

public:

    Book();
    Book(int id, std::string t, std::string a, std::string i, int q);

    int getId() const;

    bool operator==(const Book& b);
    bool operator<(const Book& b);

    friend std::ostream& operator<<(std::ostream& out,const Book& b);
};

}

#endif
