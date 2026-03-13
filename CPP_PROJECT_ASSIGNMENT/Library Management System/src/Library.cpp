#include "../headers/Library.h"
#include <iostream>

using namespace LibrarySystem;

void Library::addBook(){

    int id,q;
    std::string title,author,isbn;

    std::cout<<"Book ID: ";
    std::cin>>id;

    std::cout<<"Title: ";
    std::cin>>title;

    std::cout<<"Author: ";
    std::cin>>author;

    std::cout<<"ISBN: ";
    std::cin>>isbn;

    std::cout<<"Quantity: ";
    std::cin>>q;

    Book b(id,title,author,isbn,q);

    books.add(b);
}

void Library::displayBooks(){

    for(int i=0;i<books.getSize();i++)
        std::cout<<books[i]<<std::endl;
}
