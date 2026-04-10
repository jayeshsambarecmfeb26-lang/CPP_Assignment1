//Q5: Ticket Booking Simulation (Multithreading + Synchronization) 
//Requirements: 
//1. Create a class TicketBookingSystem: 
//○ Maintain total tickets (e.g., int tickets = 10) 
//2. Create a method: 
//public synchronized void bookTicket(String userName) 
//3. Inside method: 
//○ Check if tickets are available 
//○ If yes: 
//■ Decrement ticket count 
//■ Print success message 
//○ Else: 
//■ Print failure message 
//4. Create a class UserThread: 
//○ Implement Runnable 
//○ Pass the user name and the booking system object 
//5. In run(): 
//○ Call bookTicket() 
//6. In main class: 
//○ Create multiple user threads (more than 10) 
//7. Start all threads simultaneously 
//8. Observe output: 
//○ Ensure no negative tickets 
//○ No double booking 
//9. (Optinal) Add a small delay using Thread.sleep() to simulate real-world concurrency



package JAVA_ASSIGNMENT_6;

class TicketBookingSystem {
    int tickets = 10;

    public synchronized void bookTicket(String userName) {
        if (tickets > 0) {
            System.out.println(userName + " booked ticket. Remaining: " + (--tickets));
        } else {
            System.out.println(userName + " failed. No tickets available.");
        }
    }
}
class UserThread implements Runnable {

    private String name;
    private TicketBookingSystem system;

    UserThread(String name, TicketBookingSystem system) {
        this.name = name;
        this.system = system;
    }

    public void run() {
        system.bookTicket(name);
    }
}
public class TicketMain {
    public static void main(String[] args) {

        TicketBookingSystem system = new TicketBookingSystem();

        for (int i = 1; i <= 15; i++) {
            Thread t = new Thread(new UserThread("User" + i, system));
            t.start();
        }
    }
}
