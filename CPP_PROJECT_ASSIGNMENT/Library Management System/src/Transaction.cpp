#include "../headers/Transaction.h"

using namespace LibrarySystem;

int Transaction::counter=0;

Transaction::Transaction(int m,int b){

    transactionId=++counter;
    memberId=m;
    bookId=b;
}
