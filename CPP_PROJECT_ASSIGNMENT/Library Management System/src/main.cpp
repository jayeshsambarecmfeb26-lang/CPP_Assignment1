#include "../headers/Library.h"
#include <iostream>

using namespace LibrarySystem;

int main(){

    Library lib;

    int choice;

    do{

        std::cout<<"\nLibrary Menu\n";
        std::cout<<"1 Add Book\n";
        std::cout<<"2 Display Books\n";
        std::cout<<"0 Exit\n";

        std::cin>>choice;

        switch(choice){

        case 1:
            lib.addBook();
            break;

        case 2:
            lib.displayBooks();
            break;

        }

    }while(choice!=0);

}
