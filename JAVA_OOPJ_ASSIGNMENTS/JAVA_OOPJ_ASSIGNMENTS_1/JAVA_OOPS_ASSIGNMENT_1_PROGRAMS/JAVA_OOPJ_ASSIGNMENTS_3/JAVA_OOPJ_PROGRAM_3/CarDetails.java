package JAVA_OOPJ_PROGRAM_3;

import java.util.Scanner;

//Question 2: Design a Fleet Management System 
//Requirements: 
//● Base class: Vehicle 
//● Derived classes: Car, Bike 
//● System should: 
//○ Track brand & speed 
//○ Store fuel type / mileage 
//● Use: 
//○ Static block → system initialization 
//○ Non-static block → object creation log 
//● Allow: 
//○ Updating vehicle speed 
//● Display vehicle details 

class Vehicle {
    String brand;
    int speed;

    static 
    {
        System.out.println("system initialization");
    }

    {
        System.out.println("object creation log");
    }

    void updateSpeed(int s) 
    {
    	speed = s; 
    }

    void display() {
        System.out.println(brand + " Speed=" + speed);
    }
}

class Car extends Vehicle
{
    String fuelType;
}

class Bike extends Vehicle 
{
    int mileage;
}

public class CarDetails 
{
    public static void main(String[] args)
    {
    	 Car c = new Car();
    	 
    	Scanner sc=new Scanner(System.in);
        
    	System.out.println("Enter the brand name");
        c.brand =sc.next();
        System.out.println("Enter the speed");
        int speed=sc.nextInt();
        c.updateSpeed(speed);
        System.out.println("Enter the fuel type");
        c.fuelType = sc.next();
        c.display();
    }
}