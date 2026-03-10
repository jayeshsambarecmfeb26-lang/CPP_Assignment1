//============================================================================
// Name        : BankingSystem.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class BankAccount {
private:
    int accountNumber;
    string accountHolderName;
    double balance;

public:

    void setAccountNumber(int accNo) {
        accountNumber = accNo;
    }

    void setAccountHolderName(string name) {
        accountHolderName = name;
    }

    void setBalance(double bal) {
        balance = bal;
    }

    int getAccountNumber() {
        return accountNumber;
    }

    string getAccountHolderName() {
        return accountHolderName;
    }

    double getBalance() {
        return balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            cout << "Amount Deposited Successfully!\n";
        } else {
            cout << "Invalid Deposit Amount!\n";
        }
    }


    void withdraw(double amount) {
        if (amount <= 0) {
            cout << "Invalid Withdrawal Amount!\n";
        }
        else if (amount > balance) {
            cout << "Insufficient Balance!\n";
        }
        else {
            balance -= amount;
            cout << "Withdrawal Successful!\n";
        }
    }


    void displayAccountDetails() {
        cout << "\n--- Account Details ---\n";
        cout << "Account Number: " << accountNumber << endl;
        cout << "Account Holder Name: " << accountHolderName << endl;
        cout << "Current Balance: " << balance << endl;
    }
};

int main() {
    BankAccount account;
    int choice;
    int accNo;
    string name;
    double amount;


    cout << "Enter Account Number: ";
    cin >> accNo;
    cout << "Enter Account Holder Name: ";
    cin >> name;
    cout << "Enter Initial Balance: ";
    cin >> amount;

    account.setAccountNumber(accNo);
    account.setAccountHolderName(name);
    account.setBalance(amount);

    do {
        cout << "\n===== BANK MENU =====\n";
        cout << "1. Deposit Money\n";
        cout << "2. Withdraw Money\n";
        cout << "3. Display Account Details\n";
        cout << "4. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1:
                cout << "Enter amount to deposit: ";
                cin >> amount;
                account.deposit(amount);
                break;

            case 2:
                cout << "Enter amount to withdraw: ";
                cin >> amount;
                account.withdraw(amount);
                break;

            case 3:
                account.displayAccountDetails();
                break;

            case 4:
                cout << "Exiting Program...\n";
                break;

            default:
                cout << "Invalid Choice! Try Again.\n";
        }

    } while (choice != 4);

    return 0;
}
