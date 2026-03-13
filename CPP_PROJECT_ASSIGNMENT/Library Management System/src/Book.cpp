#include "../headers/Book.h"

using namespace LibrarySystem;

Book::Book() {
    bookId = 0;
    quantity = 0;
    availableCopies = 0;
}

Book::Book(int id, std::string t, std::string a, std::string i, int q) {
    bookId = id;
    title = t;
    author = a;
    isbn = i;
    quantity = q;
    availableCopies = q;
    status = BookStatus::AVAILABLE;
}

int Book::getId() const {
    return bookId;
}

bool Book::operator==(const Book& b) {
    return bookId == b.bookId;
}

bool Book::operator<(const Book& b) {
    return bookId < b.bookId;
}

std::ostream& LibrarySystem::operator<<(std::ostream& out, const Book& b) {

    out << b.bookId << " "
        << b.title << " "
        << b.author << " "
        << b.isbn;

    return out;
}
