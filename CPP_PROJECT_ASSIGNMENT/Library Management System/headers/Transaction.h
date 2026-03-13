#ifndef TRANSACTION_H
#define TRANSACTION_H

#include <string>

namespace LibrarySystem {

class Transaction {

private:
    static int counter;

    int transactionId;
    int memberId;
    int bookId;

public:
    Transaction(int m,int b);
};

}

#endif
