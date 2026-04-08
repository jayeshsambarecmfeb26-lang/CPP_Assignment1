package java_OOps_Programms_2;

import java.util.Scanner;

//Create a program for booking bus seats. 
//Requirements 
//● Assume a bus has 10 seats. 
//● Use an array to mark seats as booked or available. 
//● Show a menu: 
//1. View Available Seats 
//2. Book a Seat 
//3. Cancel a Seat 
//4. Exit 
//● Do not allow double booking. 

public class BusTicketBookingSystem 
{

	    public static void main(String args[]) {
	        Scanner sc = new Scanner(System.in);

	        boolean seats[] = new boolean[10]; // false = available, true = booked
	        int choice, seatNo;

	        do {
	            System.out.println("\n1. View Seats");
	            System.out.println("2. Book Seat");
	            System.out.println("3. Cancel Seat");
	            System.out.println("4. Exit");
	            System.out.print("Enter choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.println("\nSeat Status:");
	                    for (int i = 0; i < 10; i++) {
	                        if (seats[i])
	                            System.out.println("Seat " + (i + 1) + " : Booked");
	                        else
	                            System.out.println("Seat " + (i + 1) + " : Available");
	                    }
	                    break;

	                case 2:
	                    System.out.print("Enter seat number (1-10): ");
	                    seatNo = sc.nextInt();

	                    if (seatNo < 1 || seatNo > 10) {
	                        System.out.println("Invalid seat number!");
	                    } else if (seats[seatNo - 1]) {
	                        System.out.println("Seat already booked!");
	                    } else {
	                        seats[seatNo - 1] = true;
	                        System.out.println("Seat booked successfully!");
	                    }
	                    break;

	                case 3:
	                    System.out.print("Enter seat number to cancel (1-10): ");
	                    seatNo = sc.nextInt();

	                    if (seatNo < 1 || seatNo > 10) {
	                        System.out.println("Invalid seat number!");
	                    } else if (!seats[seatNo - 1]) {
	                        System.out.println("Seat already empty!");
	                    } else {
	                        seats[seatNo - 1] = false;
	                        System.out.println("Seat cancelled successfully!");
	                    }
	                    break;

	                case 4:
	                    System.out.println("Thank you!");
	                    break;

	                default:
	                    System.out.println("Invalid choice!");
	            }

	        } while (choice != 4);
	    }
	
}
