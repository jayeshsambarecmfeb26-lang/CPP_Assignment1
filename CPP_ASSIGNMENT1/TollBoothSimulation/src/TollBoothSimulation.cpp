//============================================================================
// Name        : TollBoothSimulation.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
using namespace std;

class TollBooth {
private:
    int totalVehicles;
    double totalRevenue;

public:

    TollBooth() {
        totalVehicles = 0;
        totalRevenue = 0.0;
    }

    void reset() {
        totalVehicles = 0;
        totalRevenue = 0.0;
        cout << "Booth statistics reset successfully!\n";
    }


    void vehiclePayingToll(int vehicleType, double tollAmount) {
        totalVehicles++;
        totalRevenue += tollAmount;

        if (vehicleType == 1)
            cout << "Standard Car added. Toll Collected: Rs." << tollAmount << endl;
        else if (vehicleType == 2)
            cout << "Truck added. Toll Collected: Rs." << tollAmount << endl;
        else if (vehicleType == 3)
            cout << "Bus added. Toll Collected: Rs." << tollAmount << endl;
    }

    int getTotalVehicles() {
        return totalVehicles;
    }

    double getTotalRevenue() {
        return totalRevenue;
    }
};

int main() {
    TollBooth booth;
    int choice;


    const double STANDARD_CAR_TOLL = 180.0;
    const double TRUCK_TOLL = 300.0;
    const double BUS_TOLL = 350.0;

    do {
        cout << "\n===== TOLL BOOTH MENU =====\n";
        cout << "1. Add Standard Car (Rs.180)\n";
        cout << "2. Add Truck (Rs.300)\n";
        cout << "3. Add Bus (Rs.350)\n";
        cout << "4. Display Total Vehicles Passed\n";
        cout << "5. Display Total Revenue Collected\n";
        cout << "6. Reset Booth Statistics\n";
        cout << "7. Exit\n";
        cout << "Enter your choice: ";
        cin >> choice;

        switch(choice) {
            case 1:
                booth.vehiclePayingToll(1, STANDARD_CAR_TOLL);
                break;

            case 2:
                booth.vehiclePayingToll(2, TRUCK_TOLL);
                break;

            case 3:
                booth.vehiclePayingToll(3, BUS_TOLL);
                break;

            case 4:
                cout << "Total Vehicles Passed: "
                     << booth.getTotalVehicles() << endl;
                break;

            case 5:
                cout << "Total Revenue Collected: Rs."
                     << booth.getTotalRevenue() << endl;
                break;

            case 6:
                booth.reset();
                break;

            case 7:
                cout << "Exiting Program...\n";
                break;

            default:
                cout << "Invalid Choice! Try Again.\n";
        }

    } while(choice != 7);

    return 0;
}
